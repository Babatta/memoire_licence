/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import metier.MetierImp;
import model.Connexion;
import model.Objet;

/**
 *
 * @author LENOVO
 */
public class Control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = null;
        List<Connexion> list = new ArrayList<>();
        MetierImp mi = new MetierImp();
        String etatcheck = request.getParameter("etatcheck");
        //String etatcheck = request.getParameter("etatcheck");
        String lien = request.getHeader("referer");

        if (etatcheck == null) {
            rd = request.getRequestDispatcher("mesObjets.jsp");
        } else if (etatcheck.equalsIgnoreCase("1")) {

            String id = request.getParameter("id");
            mi.OnEtatObjet(Integer.parseInt(id));
            HttpSession session = request.getSession();
            int idUser = (int) session.getAttribute("idUser");
            System.out.println(idUser);
            request.setAttribute("listeObjet", mi.listeObjetAbonneOff(idUser));
            long debut = System.currentTimeMillis();
            session.setAttribute("debut", debut);
            rd = request.getRequestDispatcher("objetOff.jsp");

        } else if (etatcheck.equalsIgnoreCase("0")) {
            String id = request.getParameter("id");
            mi.OffEtatObjet(Integer.parseInt(id));
            HttpSession session = request.getSession();
            int idUser = (int) session.getAttribute("idUser");
            System.out.println(idUser);
            request.setAttribute("listeObjet", mi.listeObjetAbonneOn(idUser));
            float intensite = Float.parseFloat(request.getParameter("intensite"));
            Objet ob = new Objet();
            int etat = ob.getEtat();
            float voltage = ob.getVoltage();
            rd = request.getRequestDispatcher("objetOn.jsp");
            long debut = (long) session.getAttribute("debut");
            long fin = System.currentTimeMillis();
            long temps = (fin - debut) / 1000;
            float energie = mi.CalculEnergie(temps, intensite, voltage);
            mi.ajouterConsommation(Integer.parseInt(id), debut, fin, energie);
            System.out.println("intensité= " + intensite);
            System.out.println("dateDeb= " + debut);
            System.out.println("dateFin= " + fin);
            System.out.println("energie= " + energie);
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
