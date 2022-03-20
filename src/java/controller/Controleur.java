/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import metier.MetierImp;
import model.Abonnement;
import model.Batiment;
import model.Connexion;
import model.Localisation;
import model.Objet;
import model.Reseau;
import model.Station;
import model.User;
import model.Zone;

/**
 *
 * @author LENOVO
 */
public class Controleur extends HttpServlet {

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
            throws ServletException, IOException, FileNotFoundException, DocumentException {
        RequestDispatcher rd = null;
        List<Connexion> list = new ArrayList<>();
        MetierImp mi = new MetierImp() {
        };
        String action = request.getParameter("action");
        String lien = request.getHeader("referer");

        if (action == null) {
            rd = request.getRequestDispatcher("bienvenu.jsp");
        } else if (action.equals("bienvenu")) {
            rd = request.getRequestDispatcher("bienvenu.jsp");
        } else if (action.equals("connexion1")) {
            rd = request.getRequestDispatcher("connexion.jsp");
        } else if (action.equals("ajUser")) {

            rd = request.getRequestDispatcher("ajoutUser.jsp");
        } else if (action.equals("retour")) {
            rd = request.getRequestDispatcher("accueilAdmin.jsp");
        } else if (action.equals("AjStation")) {

            request.setAttribute("listeReseau", mi.ListerReseau());
            rd = request.getRequestDispatcher("ajouterStation.jsp");
        } else if (action.equals("enrStation")) {
            request.setAttribute("listereseau", mi.ListerReseau());
            String nom = request.getParameter("nomSta");
            String type = request.getParameter("typeSta");
            String alerte = request.getParameter("alerte");
            String connectivite = request.getParameter("connectivite");
            int idReseau = Integer.parseInt(request.getParameter("idReseau"));

            if (!mi.verifStation(idReseau, nom)) {
                rd = request.getRequestDispatcher("ajouterStation.jsp");
                JOptionPane.showMessageDialog(null, "Cette station existe déjà!.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mi.ajouterStation(idReseau, nom, type, connectivite, alerte);
                rd = request.getRequestDispatcher("ajouterStation.jsp");
                JOptionPane.showMessageDialog(null, "Station enregistrée!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (action.equals("dmd")) {
            rd = request.getRequestDispatcher("demande.jsp");
        } else if (action.equals("siteObjet")) {
            request.setAttribute("listerZone", mi.ListerZone());
            rd = request.getRequestDispatcher("ajouterObjet.jsp");
        } else if (action.equals("AjObjet")) {
            request.setAttribute("listerZone", mi.ListerZone());
            // int idZone = Integer.parseInt(request.getParameter("idZone"));
            // request.setAttribute("listerBatiment", mi.listeBatiment1(idZone));
//            int idBatiment = Integer.parseInt(request.getParameter("idBatiment"));
//            request.setAttribute("listerLoca", mi.listeLocalisation1(idZone, idBatiment));
//            request.setAttribute("idBatiment", idBatiment);
//mi.nomBat().forEach((batiment) -> {
//    System.out.println(batiment.getNomBatiment());
//     System.out.println(batiment.getIdZone());
//            });
            request.setAttribute("listerBatiment", mi.nomBat());
            request.setAttribute("listerLoca", mi.listeLocalisation1());
//            mi.listeLocalisation1().forEach((localisation)->{
//    System.out.println(localisation.getNomLocalisation());
//     System.out.println(localisation.getIdLocalisation());
//     });
//            int idLocalisation = Integer.parseInt(request.getParameter("idLocalisation"));
//            request.setAttribute("listerLoca", mi.nomLoca(idZone, idBatiment, idLocalisation));
//           request.setAttribute("idLocalisation", idLocalisation);
            request.setAttribute("listeStation", mi.ListerStation());
            request.setAttribute("listeAbonne", mi.ListerUserAbonne());
            rd = request.getRequestDispatcher("ajouterObjet.jsp");

        } else if (action.equals("enrObjet")) {
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            request.setAttribute("idZone", idZone);
            request.setAttribute("listerZone", mi.nomZones(idZone));
            String bat = request.getParameter("idBatiment");
            int idBatiment = Integer.parseInt(bat.split("&")[0]);
            System.out.println("idBat= " + idBatiment);
            request.setAttribute("idBatiment", idBatiment);
            request.setAttribute("listerBatiment", mi.nomBat());
            int idLocalisation = Integer.parseInt(request.getParameter("idLocalisation"));
            request.setAttribute("idLocalisation", idLocalisation);
            int idStation = Integer.parseInt(request.getParameter("idStation"));
            request.setAttribute("listeStation", mi.ListerStation());
            request.setAttribute("listerLoca", mi.nomLoca(idZone, idBatiment, idLocalisation));
            String nom = request.getParameter("nomObjet");
            String type = request.getParameter("type");
            String connectivite = request.getParameter("connectivite");
            String voltage = request.getParameter("voltage");
            int idUser = Integer.parseInt(request.getParameter("idUser"));
            request.setAttribute("listeAbonne", mi.ListerUserAbonne());
            mi.ajouterObjet(idZone, idBatiment, idLocalisation, idStation, idUser, nom, type, voltage, connectivite, 0);
            rd = request.getRequestDispatcher("ajouterObjet.jsp");

            //JOptionPane.showMessageDialog(null, "Objet enregistré!", "Message", JOptionPane.INFORMATION_MESSAGE);
//<div class="alert alert-primary" role="alert">
//  Objet ajouté avec succé.
//</div
        } else if (action.equals("mdf")) {

            int id = Integer.parseInt(request.getParameter("id"));
            User us = mi.UserId1(id);
            // int id = us.getIdUser();
            HttpSession session = request.getSession();
            session.setAttribute("idUser", us.getIdUser());
            session.setAttribute("prenom", us.getPrenom());
            session.setAttribute("nom", us.getNom());
            session.setAttribute("login", us.getLogin());
            session.setAttribute("passe", us.getPasse());
            session.setAttribute("adresse", us.getAdresse());
            session.setAttribute("tel", us.getTel());
            session.setAttribute("email", us.getEmail());
            session.setAttribute("profil", us.getProfil());
            rd = request.getRequestDispatcher("modifierCompte.jsp");
        } else if (action.equals("enrMDF")) {
            HttpSession session = request.getSession();
            String passe = request.getParameter("passe");
            String confirmpasse = request.getParameter("confirmpasse");
            String login = request.getParameter("login");

            User us = mi.UserCompte(passe, login);

            int idUser = Integer.parseInt(request.getParameter("idUser"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");

            String email = request.getParameter("email");
            String profil = request.getParameter("profil");
            String adresse = request.getParameter("adresse");
            String tel = request.getParameter("tel");
            if (tel.length() == 9) {
                if (passe.equals(confirmpasse) == false) {
                    request.setAttribute("message", "Mots de passe non correspondants!");
                    rd = request.getRequestDispatcher("modifierCompte.jsp");
                } else if (mi.selectMDP(us.getIdUser(), login) == true) {
                    request.setAttribute("passe", us.getPasse());
                    request.setAttribute("idUser", us.getIdUser());
                    request.setAttribute("prenom", us.getPrenom());
                    request.setAttribute("nom", us.getNom());
                    request.setAttribute("login", us.getLogin());
                    request.setAttribute("adresse", us.getAdresse());
                    request.setAttribute("tel", us.getTel());
                    request.setAttribute("email", us.getEmail());

                    rd = request.getRequestDispatcher("modifierCompte.jsp");
                    JOptionPane.showMessageDialog(null, "Utisateur déjà existant.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    mi.modifierABonne(idUser, nom, prenom, login, passe, email, profil, adresse, tel);
                    rd = request.getRequestDispatcher("accueilAbonne.jsp");
                    request.setAttribute("message", "Mise à jour effectuée!");
                }
            } else {
                session.setAttribute("idUser", us.getIdUser());
                session.setAttribute("prenom", us.getPrenom());
                session.setAttribute("nom", us.getNom());
                session.setAttribute("login", us.getLogin());
                session.setAttribute("adresse", us.getAdresse());
                session.setAttribute("tel", us.getTel());
                session.setAttribute("email", us.getEmail());

                rd = request.getRequestDispatcher("modifierCompte.jsp");
                JOptionPane.showMessageDialog(null, "Numéro invalide!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (action.equals("listeAbonne")) {

            request.setAttribute("listerAbonne", mi.ListerUserAbonne());
            rd = request.getRequestDispatcher("listeAbonne.jsp");
        } else if (action.equals("AjLocalisation")) {

            request.setAttribute("listerZone", mi.listeZone());
            request.setAttribute("listerBatiment", mi.ListerBatiment1());
            rd = request.getRequestDispatcher("ajouterLocalisation.jsp");
        } else if (action.equals("enrLoca")) {
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            int idBatiment = Integer.parseInt(request.getParameter("idBatiment"));
            String nomLocalisation = request.getParameter("nomLoca");
            String typeLocalisation = request.getParameter("typeLoca");
            mi.ajouterLocalisation(idZone, idBatiment, typeLocalisation, nomLocalisation);

            rd = request.getRequestDispatcher("ajouterLocalisation.jsp");
            JOptionPane.showMessageDialog(null, "Localisation enregistrée!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (action.equals("AjBat")) {
            request.setAttribute("listerZone", mi.ListerZone1());
            rd = request.getRequestDispatcher("ajouterBatiment.jsp");
        } else if (action.equals("AjZone")) {
            request.setAttribute("listebatiment", mi.ListerBatiment1());
            rd = request.getRequestDispatcher("ajouterZone.jsp");
        } else if (action.equals("enrZone")) {
            String nomZone = request.getParameter("nomZone");
            if (!mi.verifZone(nomZone)) {
                rd = request.getRequestDispatcher("ajouterZone.jsp");
                JOptionPane.showMessageDialog(null, "Cette zone existe déjà!", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mi.ajouterZone(nomZone);
                rd = request.getRequestDispatcher("ajouterZone.jsp");
                JOptionPane.showMessageDialog(null, "Zone enregistrée!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (action.equals("AjReseau")) {

            rd = request.getRequestDispatcher("ajouterReseau.jsp");
        } else if (action.equals("enrReseau")) {
            String nomReseau = request.getParameter("nomReseau");
            if (!mi.verifReseau(nomReseau)) {
                rd = request.getRequestDispatcher("ajouterReseau.jsp");
                JOptionPane.showMessageDialog(null, "Ce réseau existe déjà!", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {

                mi.ajouterReseau(nomReseau);
                rd = request.getRequestDispatcher("ajouterReseau.jsp");
                JOptionPane.showMessageDialog(null, "Réseau enregistré!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (action.equals("enrBat")) {
            request.setAttribute("listerZone", mi.ListerZone());
            String nomBatiment = request.getParameter("nomBat");
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            if (!mi.verifBatiment(idZone, nomBatiment)) {
                rd = request.getRequestDispatcher("ajouterBatiment.jsp");
                JOptionPane.showMessageDialog(null, "Ce bâtiment existe déjà!", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                mi.ajouterBatiment(idZone, nomBatiment);
                request.setAttribute("listeZone", mi.ListerZone());
                rd = request.getRequestDispatcher("ajouterBatiment.jsp");
                JOptionPane.showMessageDialog(null, "Bâtiment enregistré avec succés!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } /*else if (action.equals("enrLocalisation")) {

            String nomLocalisation = request.getParameter("nomLoca");
            String typeLocalisation = request.getParameter("typeLoca");
            int idBatiment = Integer.parseInt(request.getParameter("idBatiment"));
            Zone z = mi.selectnomZone(idBatiment);

            mi.ajouterLocalisation(z.getIdZone(), idBatiment, typeLocalisation, nomLocalisation);

            request.setAttribute("listebatiment", mi.ListerBatiment());
            rd = request.getRequestDispatcher("ajouterLocalisation.jsp");
            JOptionPane.showMessageDialog(null, "localisation enregistrée!", "Message", JOptionPane.INFORMATION_MESSAGE);

        }*/ else if (action.equals("dmd")) {

            rd = request.getRequestDispatcher("FormeDemande.jsp");
        } else if (action.equals("voirD")) {

            request.setAttribute("listeDemande", mi.listerAbonnement());
            rd = request.getRequestDispatcher("listeDemande.jsp");
        } else if (action.equals("voirZone")) {

            request.setAttribute("listeZo", mi.ListerZone());
            rd = request.getRequestDispatcher("listeZone.jsp");
        }/* else if (action.equals("courbe")) {
            rd = request.getRequestDispatcher("courbe.jsp");
        } else if (action.equals("circ")) {
            rd = request.getRequestDispatcher("pie.jsp");
        } */ else if (action.equals("listeObjet")) {

            request.setAttribute("listeObjet", mi.listeObjet());
            rd = request.getRequestDispatcher("listeObjets.jsp");
        } else if (action.equals("RchObjet")) {
            String nom = request.getParameter("rechObjet");
            request.setAttribute("listeObjet", mi.RechercheObjet(nom));
            rd = request.getRequestDispatcher("listeOb.jsp");
        } else if (action.equals("stat")) {
            String passe = request.getParameter("passe");
            String login = request.getParameter("login");
            request.setAttribute("login", login);
            request.setAttribute("passe", passe);
            User us = mi.UserCompte(passe, login);
            int id = us.getIdUser();
            // int id = Integer.parseInt(request.getParameter("id"));
            System.out.println(id);
            request.setAttribute("listeObjet", mi.listeObjetAbonne(id));
            //  Objet ob = mi.listerObjet(id);
            //request.setAttribute("nomObjet", ob.getNomObjet());
            request.setAttribute("idUser", us.getIdUser());
            request.setAttribute("prenom", us.getPrenom());
            request.setAttribute("nom", us.getNom());
            request.setAttribute("login", us.getLogin());
            request.setAttribute("adresse", us.getAdresse());
            request.setAttribute("tel", us.getTel());
            request.setAttribute("email", us.getEmail());
            request.setAttribute("profil", us.getProfil());
            // request.setAttribute("listerObjet", mi.listerObjet(id));
            rd = request.getRequestDispatcher("statistiques.jsp");
        } else if (action.equals("obj")) {
            String passe = request.getParameter("passe");
            String login = request.getParameter("login");
            User us = mi.UserCompte(passe, login);
            int idUser = us.getIdUser();
            request.setAttribute("listerObjet", mi.listeObjetAbonne(idUser));
            rd = request.getRequestDispatcher("mesObjets.jsp");
        } else if (action.equals("ajouterUser")) {
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String login = request.getParameter("login");
            String passe = request.getParameter("passe");
            String confirmpasse = request.getParameter("confirmpasse");
            String email = request.getParameter("email");
            String profil = request.getParameter("profil");
            String adresse = request.getParameter("adresse");
            String tel1 = request.getParameter("tel1");
            String tel2 = request.getParameter("tel2");
            String tel = tel1 + "" + tel2;

            if (tel2.length() == 7 && tel1.length() == 2) {
                if (passe.equals(confirmpasse) == false) {
                    request.setAttribute("message", "Mots de passe non correspondants!");
                    rd = request.getRequestDispatcher("ajoutUser.jsp");
                } else if (!mi.selectLog(login)) {
                    rd = request.getRequestDispatcher("ajoutUser.jsp");
                    JOptionPane.showMessageDialog(null, "Utisateur déjà existant.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    mi.ajouterUser(nom, prenom, login, passe, email, profil, adresse, tel);
                    User us = mi.selectidUser();
                    System.out.println("" + us.getIdUser());
                    if (profil.equals("administrateur")) {
                        mi.ajouterAdmin(us.getIdUser());
                    } else if (profil.equals("abonne")) {
                        mi.ajouterAbonne(us.getIdUser());
                    }
                    mi.ajouterAbonne(us.getIdUser());

                    rd = request.getRequestDispatcher("ajoutUser.jsp");
                    JOptionPane.showMessageDialog(null, "Utisateur enregistré avec succés!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                rd = request.getRequestDispatcher("ajoutUser.jsp");
                JOptionPane.showMessageDialog(null, "Numéro invalide!", "Message", JOptionPane.INFORMATION_MESSAGE);

            }
            /*else {
                JOptionPane.showMessageDialog(null, "Compte déjà existant.", "Message", JOptionPane.INFORMATION_MESSAGE);
                rd = request.getRequestDispatcher("ajoutUser.jsp");
            }*/
        } else if (action.equals("demandeAbonnement")) {

            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            String tel1 = request.getParameter("tel1");
            String tel2 = request.getParameter("tel2");
            String tel = "" + tel1 + "" + tel2;
            mi.ajouterDemande(nom, prenom, email, adresse, tel);
            rd = request.getRequestDispatcher("demande.jsp");
            JOptionPane.showMessageDialog(null, "Informations transmises avec succés!", "Message", JOptionPane.INFORMATION_MESSAGE);

        } else if (action.equals("validerDmd")) {
            int iddmd = Integer.parseInt(request.getParameter("idDmd"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String adresse = request.getParameter("adresse");
            String tel = request.getParameter("tel");
            String email = request.getParameter("email");
            String log = mi.Login();
            String pas = mi.Passe();
            mi.ajouterUser(nom, prenom, log, pas, email, "abonne", adresse, tel);
            User u1 = mi.selectidUser();
            mi.ajouterAbonne(u1.getIdUser());
            User User = mi.selectidUser(log, pas);
            HttpSession session = request.getSession();
            session.setAttribute("User", User);
            int idUser = User.getIdUser();
            String url = "http://169.254.37.176:8084/Memoire2019/Controleur?action=mdf&id=" + idUser;
            //http://localhost:8084/Memoire2019/Controleur?action=mdf&id=20

            mi.validerDemande(iddmd);
            mi.supprimerDemande(iddmd);

            request.setAttribute("listeDemande", mi.listerAbonnement());
            //  mi.sendMail(log, pas, log);
            JOptionPane.showMessageDialog(null, "Email envoyé.", "Message", JOptionPane.INFORMATION_MESSAGE);
            rd = request.getRequestDispatcher("listeDemande.jsp");

//            else if {
//                request.setAttribute("listeDemande", mi.listerAbonnement());
//                JOptionPane.showMessageDialog(null, "Compte déjà existant.Veuillez tenter une autre validation", "Message", JOptionPane.INFORMATION_MESSAGE);
//                rd = request.getRequestDispatcher("listeDemande.jsp");
//            }
        } else if (action.equals("rpc")) {
            String passe = request.getParameter("passe");
            String login = request.getParameter("login");
            getServletContext().setAttribute("passe", passe);
            getServletContext().setAttribute("login", login);
            User us = mi.UserCompte(passe, login);
            int id = us.getIdUser();

            getServletContext().setAttribute("idUser", us.getIdUser());
            getServletContext().setAttribute("prenom", us.getPrenom());
            getServletContext().setAttribute("nom", us.getNom());
            getServletContext().setAttribute("login", us.getLogin());
            getServletContext().setAttribute("adresse", us.getAdresse());
            getServletContext().setAttribute("tel", us.getTel());
            getServletContext().setAttribute("email", us.getEmail());
            getServletContext().setAttribute("profil", us.getProfil());

            request.setAttribute("listeObjet", mi.listeObjetAbonne(id));
            // mi.PDFgenerator();
            rd = request.getRequestDispatcher("RapportCons");
        } else if (action.equals("main")) {
            rd = request.getRequestDispatcher("manipulation.jsp");
        } /////////////////////
        else if (action.equals("monCompte")) {
//            String passe = request.getParameter("passe");
//            String login = request.getParameter("login");
//            getServletContext().setAttribute("passe", passe);
//            getServletContext().setAttribute("login", login);
//            User us = mi.UserCompte(passe, login);
//            int id = us.getIdUser();
//
//            getServletContext().setAttribute("idUser", us.getIdUser());
//            getServletContext().setAttribute("prenom", us.getPrenom());
//            getServletContext().setAttribute("nom", us.getNom());
//            getServletContext().setAttribute("login", us.getLogin());
//            getServletContext().setAttribute("adresse", us.getAdresse());
//            getServletContext().setAttribute("tel", us.getTel());
//            getServletContext().setAttribute("email", us.getEmail());
//            getServletContext().setAttribute("profil", us.getProfil());

            rd = request.getRequestDispatcher("modifierCompte.jsp");
        } else if (action.equals("enrMDF")) {
            HttpSession session = request.getSession();
            String passe = request.getParameter("passe");
            String confirmpasse = request.getParameter("confirmpasse");
            String login = request.getParameter("login");

            User us = mi.UserCompte(passe, login);

            int idUser = Integer.parseInt(request.getParameter("idUser"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");

            String email = request.getParameter("email");
            String profil = request.getParameter("profil");
            String adresse = request.getParameter("adresse");
            String tel = request.getParameter("tel");
            if (tel.length() == 9) {
                if (passe.equals(confirmpasse) == false) {
                    request.setAttribute("message", "Mots de passe non correspondants!");
                    rd = request.getRequestDispatcher("modifierCompte.jsp");
                } else if (mi.selectMDP(us.getIdUser(), login) == true) {
                    request.setAttribute("passe", us.getPasse());
                    request.setAttribute("idUser", us.getIdUser());
                    request.setAttribute("prenom", us.getPrenom());
                    request.setAttribute("nom", us.getNom());
                    request.setAttribute("login", us.getLogin());
                    request.setAttribute("adresse", us.getAdresse());
                    request.setAttribute("tel", us.getTel());
                    request.setAttribute("email", us.getEmail());

                    rd = request.getRequestDispatcher("modifierCompte.jsp");
                    JOptionPane.showMessageDialog(null, "Utisateur déjà existant.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    mi.modifierABonne(idUser, nom, prenom, login, passe, email, profil, adresse, tel);
                    rd = request.getRequestDispatcher("accueilAbonne.jsp");
                    request.setAttribute("message", "Mise à jour effectuée!");
                }
            } else {
                session.setAttribute("idUser", us.getIdUser());
                session.setAttribute("prenom", us.getPrenom());
                session.setAttribute("nom", us.getNom());
                session.setAttribute("login", us.getLogin());
                session.setAttribute("adresse", us.getAdresse());
                session.setAttribute("tel", us.getTel());
                session.setAttribute("email", us.getEmail());

                rd = request.getRequestDispatcher("modifierCompte.jsp");
                JOptionPane.showMessageDialog(null, "Numéro invalide!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (action.equals("listeAbonne")) {
            request.setAttribute("listerAbonne", mi.ListerUserAbonne());
            rd = request.getRequestDispatcher("listeAbonne.jsp");
        } else if (action.equals("recherche")) {
            String saisie = request.getParameter("saisie");
            if (saisie == null) {
                getServletContext().setAttribute("listerAbonne", mi.ListerUserAbonne());
                rd = request.getRequestDispatcher("listeAbonne.jsp");
            } else {
                getServletContext().setAttribute("listerAbonne", mi.resultatRecherche(saisie));
                rd = request.getRequestDispatcher("listeAb.jsp");
            }
        } else if (action.equals("listeBat")) {
            request.setAttribute("listerBatiment", mi.listeBatiment());
            rd = request.getRequestDispatcher("listeBatiment.jsp");
        } else if (action.equals("rtrBat")) {
            request.setAttribute("listerBatiment", mi.listeBatiment());
            rd = request.getRequestDispatcher("listeBatiment.jsp");
        } else if (action.equals("supprimerBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            mi.supprimerBatiment(idBat, idZone);
            request.setAttribute("listerBatiment", mi.nomBat());
            rd = request.getRequestDispatcher("listeBatiment.jsp");

        } else if (action.equals("supprimerUser")) {
            int idUser = Integer.parseInt(request.getParameter("id"));
            mi.supprimerUser(idUser);
            mi.supprimerAbonne(idUser);
            request.setAttribute("listerAbonne", mi.ListerUserAbonne());
            rd = request.getRequestDispatcher("listeAbonne.jsp");
        } else if (action.equals("modifierBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
//            String nomBat=request.getParameter("rechBat");

            Batiment Batiment = mi.listerBatiment(idZone, idBat);
            HttpSession session = request.getSession();
            session.setAttribute("Batiment", Batiment);
            rd = request.getRequestDispatcher("modifierBatiment.jsp");

        } else if (action.equals("updateBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            String nomBat = request.getParameter("nomBat");
            mi.modifierBatiment(idBat, idZone, nomBat);
            request.setAttribute("listerBatiment", mi.listeBatiment());
            rd = request.getRequestDispatcher("listeBatiment.jsp");

        } else if (action.equals("RchBat")) {
            String rechBat = request.getParameter("rechBat");
            request.setAttribute("listerBatiment", mi.RechercheBatiment(rechBat));
            rd = request.getRequestDispatcher("listeBat.jsp");
        } ////////////Zone/////
        else if (action.equals("listeZone")) {
            request.setAttribute("listerZone", mi.nomZone());
            rd = request.getRequestDispatcher("listeZone.jsp");
        } else if (action.equals("rtrZ")) {
            request.setAttribute("listerZone", mi.nomZone());
            rd = request.getRequestDispatcher("listeZone.jsp");
        } else if (action.equals("supprimerZone")) {

            int idZone = Integer.parseInt(request.getParameter("idZone"));
            mi.supprimerZone(idZone);
            mi.supprimerBatimentZone(idZone);
            mi.supprimerLocalisationZone(idZone);
            request.setAttribute("listerZone", mi.nomZone());
            rd = request.getRequestDispatcher("listeZone.jsp");
        } else if (action.equals("modifierZone")) {
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            System.out.println(idZone);
            Zone Zone = mi.listerZone(idZone);
            HttpSession session = request.getSession();
            session.setAttribute("Zone", Zone);
            rd = request.getRequestDispatcher("modifierZone.jsp");
        } else if (action.equals("updateZone")) {
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            String nomZone = request.getParameter("nomZone");

            mi.modifierZone(idZone, nomZone);
//             System.out.println("id="+idOb2);
            request.setAttribute("listerZone", mi.nomZone());
            rd = request.getRequestDispatcher("listeZone.jsp");
        } else if (action.equals("RchZone")) {
            String nomZone = request.getParameter("rechZone");
            request.setAttribute("listerZone", mi.selectZone(nomZone));
            rd = request.getRequestDispatcher("listeZo.jsp");
        } /////Localisation////supprimerLoca&idloca=1&idBat=1&idZone=1
        else if (action.equals("listeLocalisation")) {

            request.setAttribute("listeLoca", mi.ListerInfoLocalisation());
            rd = request.getRequestDispatcher("listeLocalisation.jsp");
        } else if (action.equals("rtrLoca")) {

            request.setAttribute("listeLoca", mi.ListerInfoLocalisation());
            rd = request.getRequestDispatcher("listeLocalisation.jsp");
        } else if (action.equals("supprimerLoca")) {
            int idLoca = Integer.parseInt(request.getParameter("idloca"));
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            System.out.println(idLoca);
            System.out.println(idBat);
            System.out.println(idZone);
            mi.supprimerLocaBatiment(idLoca, idBat, idZone);
            request.setAttribute("listeLoca", mi.ListerInfoLocalisation());
            rd = request.getRequestDispatcher("listeLocalisation.jsp");
        } else if (action.equals("modifierLoca")) {
            int idLoca = Integer.parseInt(request.getParameter("idLoca"));
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            Localisation Localisation = mi.SelectLocalisation(idBat, idZone, idLoca);
            HttpSession session = request.getSession();
            session.setAttribute("Localisation", Localisation);
            request.setAttribute("Localisation", Localisation);
            rd = request.getRequestDispatcher("modifierLoca.jsp");
        } else if (action.equals("updateLoca")) {

            int idLoca = Integer.parseInt(request.getParameter("idLoca"));
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            String nomLoca = request.getParameter("nomLoca");
            String typeLoca = request.getParameter("typeLoca");
            mi.modifierLocalisation(idLoca, idBat, idZone, nomLoca, typeLoca);
            request.setAttribute("listeLoca", mi.ListerInfoLocalisation());
            rd = request.getRequestDispatcher("listeLocalisation.jsp");
        } else if (action.equals("RchLoca")) {
            String nomLoca = request.getParameter("rechLoca");
            request.setAttribute("listeLoca", mi.RechercheLocalisation(nomLoca));
            rd = request.getRequestDispatcher("listeLoca.jsp");
        } else if (action.equals("modifierBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            rd = request.getRequestDispatcher("modifBat.jsp");

        } else if (action.equals("supprimerBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            mi.supprimerBatiment(idBat, idZone);
            mi.supprimerLocaBatiment(idBat, idZone);

        } /////// Reseau/////////////
        else if (action.equals("listeReseau")) {
            request.setAttribute("listerReseau", mi.ListerReseau());
            rd = request.getRequestDispatcher("listeReseau.jsp");
        } else if (action.equals("rtrRs")) {
            request.setAttribute("listerReseau", mi.ListerReseau());
            rd = request.getRequestDispatcher("listeReseau.jsp");
        } else if (action.equals("supprimerReseau")) {
            int idRe = Integer.parseInt(request.getParameter("idReseau"));
            mi.supprimerReseau(idRe);
            mi.deleteStation(idRe);
            request.setAttribute("listerReseau", mi.ListerReseau());
            rd = request.getRequestDispatcher("listeReseau.jsp");
        } else if (action.equals("modifierReseau")) {
            int idRe = Integer.parseInt(request.getParameter("idReseau"));
            Reseau Reseau = mi.selectReseau(idRe);
            HttpSession session = request.getSession();
            session.setAttribute("Reseau", Reseau);
            rd = request.getRequestDispatcher("modifierReseau.jsp");

        } else if (action.equals("UpdateReseau")) {
            int idRe = Integer.parseInt(request.getParameter("idReseau"));
            String nomReseau = request.getParameter("nomReseau");
            System.out.println(nomReseau);
            System.out.println(idRe);
            mi.modifierReseau(idRe, nomReseau);
            request.setAttribute("listerReseau", mi.ListerReseau());
            rd = request.getRequestDispatcher("listeReseau.jsp");

        }///RechReseau&recReseau=Reseau1
        else if (action.equals("RchReseau")) {
            String nomR = request.getParameter("rechReseau");
            request.setAttribute("listerReseau", mi.recherReseau(nomR));
            rd = request.getRequestDispatcher("listeRs.jsp");
        } else if (action.equals("RchStat")) {
            String nomSta = request.getParameter("rechStat");
            request.setAttribute("listerStation", mi.recherStation(nomSta));
            rd = request.getRequestDispatcher("listeSta.jsp");
        } 
        else if (action.equals("supprimerBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            mi.supprimerBatiment(idBat, idZone);
            //  mi.supprimerLocaBatiment(idBat,idZone);

            rd = request.getRequestDispatcher("listeBatiment.jsp");
        } else if (action.equals("modifierBat")) {
            int idBat = Integer.parseInt(request.getParameter("idBat"));
            int idZone = Integer.parseInt(request.getParameter("idZone"));
            System.out.println(idBat);
            System.out.println(idZone);
            rd = request.getRequestDispatcher("modifierBatiment.jsp");
        } ////Station///idSta=1&idReseau=2
        else if (action.equals("listeStation")) {
            request.setAttribute("listerStation", mi.ListerStation1());
            rd = request.getRequestDispatcher("listeStation.jsp");
        } //supprimerSta&idSta=2&idReseau=1
        else if (action.equals("rtrSta")) {
            request.setAttribute("listerStation", mi.ListerStation1());
            rd = request.getRequestDispatcher("listeStation.jsp");
        } else if (action.equals("supprimerSta")) {
            int idSta = Integer.parseInt(request.getParameter("idSta"));
            int idReseau = Integer.parseInt(request.getParameter("idReseau"));
            System.out.println(idSta);
            System.out.println(idReseau);
            mi.supprimerStation(idSta, idReseau);
            request.setAttribute("listerStation", mi.ListerStation1());
            rd = request.getRequestDispatcher("listeStation.jsp");
        } else if (action.equals("modifierStat")) {
            int idSta = Integer.parseInt(request.getParameter("idSta"));
            int idReseau = Integer.parseInt(request.getParameter("idReseau"));
            System.out.println(idSta);
            System.out.println(idReseau);
            Station Station = mi.selectStation(idSta, idReseau);
            HttpSession session = request.getSession();
            session.setAttribute("Station", Station);
            rd = request.getRequestDispatcher("modifierStation.jsp");

//           request.setAttribute("listerStation", mi.ListerStation1());
//           rd = request.getRequestDispatcher("listeStation.jsp");
        } else if (action.equals("updateSta")) {
            int idSta = Integer.parseInt(request.getParameter("idSta"));
            int idReseau = Integer.parseInt(request.getParameter("idReseau"));
            String nom = request.getParameter("nomStation");
            String type = request.getParameter("typeStation");
            String alerte = request.getParameter("alerte");
            String connectivite = request.getParameter("connectivite");
            mi.modifierStation(idReseau, idSta, type, connectivite, alerte, nom);
            request.setAttribute("listerStation", mi.ListerStation1());
            rd = request.getRequestDispatcher("listeStation.jsp");
        } //       else if (action.equals("RECHSta")) {
        //           
        //       }
        else if (action.equals("supprimerOb")) {

            int idOb = Integer.parseInt(request.getParameter("idOb"));
            mi.supprimerObjet(idOb);
            request.setAttribute("listeObjet", mi.listeObjet());
            rd = request.getRequestDispatcher("listeObjets.jsp");
        } else if (action.equals("modifierOb")) {
            int idOb = Integer.parseInt(request.getParameter("idOb"));
            System.out.println(idOb);
            Objet Objet = mi.listerObjet(idOb);
            HttpSession session = request.getSession();
            session.setAttribute("Objet", Objet);

            rd = request.getRequestDispatcher("modifierObjet.jsp");
        } else if (action.equals("updateObjet")) {
            int idOb = Integer.parseInt(request.getParameter("idObjet"));
            String nomObjet = request.getParameter("nomObjet");
            String type = request.getParameter("type");
            String voltage = request.getParameter("voltage");
            String connectivite = request.getParameter("connectivite");
            mi.modifierObjet(idOb, nomObjet, type, voltage, connectivite);
//             System.out.println("id="+idOb2);
            request.setAttribute("listeObjet", mi.listeObjet());
            rd = request.getRequestDispatcher("listeObjets.jsp");
        } else if (action.equals("rtrOb")) {
            request.setAttribute("listeObjet", mi.listeObjet());
            rd = request.getRequestDispatcher("listeObjets.jsp");
        } else if (action.equals("visualiser")) {
            int id = Integer.parseInt(request.getParameter("id"));
            System.out.println(id);
            User User = mi.selectidUser(id);
            HttpSession session = request.getSession();
            session.setAttribute("idUser", User);
            session.setAttribute("listeObjetUser", mi.listeObjetUser(id));
            rd = request.getRequestDispatcher("objetsUser.jsp");
        } else if (action.equals("supprimerDmd")) {
            int idDmd = Integer.parseInt(request.getParameter("idAbonne"));
            Abonnement ab = mi.selectidAbonnement();
            mi.supprimerDemande(idDmd);
            request.setAttribute("listeDemande", mi.listerAbonnement());
            rd = request.getRequestDispatcher("listeDemande.jsp");
        } // C0nnexion d'un utilisateur
        else if (action.equals("ab")) {
            String login = request.getParameter("login");
            String passe = request.getParameter("passe");
            request.setAttribute("passe", passe);
            request.setAttribute("login", login);
            User us = mi.UserCompte(passe, login);
            int id = us.getIdUser();
            //    Objet ob = mi.listerObjet(id);
            //   request.setAttribute("listeObjet", mi.listeObjets(id));
            //   request.setAttribute("nomObjet", ob.getNomObjet());
            getServletContext().setAttribute("idUser", us.getIdUser());
            getServletContext().setAttribute("prenom", us.getPrenom());
            getServletContext().setAttribute("nom", us.getNom());
            getServletContext().setAttribute("login", us.getLogin());
            getServletContext().setAttribute("adresse", us.getAdresse());
            getServletContext().setAttribute("tel", us.getTel());
            getServletContext().setAttribute("email", us.getEmail());
            request.setAttribute("profil", us.getProfil());
            rd = request.getRequestDispatcher("accueilAbonne.jsp");
        } else if (action.equals("connecte")) {
            HttpSession session = request.getSession();
            String login = request.getParameter("login");
            String passe = request.getParameter("passe");
            String profil = request.getParameter("profil");
            session.setAttribute("passe", passe);
            session.setAttribute("login", login);

            int t = 1;
            System.out.println(login + " " + passe + " " + profil);
            List<User> liste = mi.selectAdmin();
            User us = mi.UserCompte(passe, login);
            int id = us.getIdUser();
            List<Objet> objetEteint = mi.listeObjetAbonneOff(id);
            List<Objet> objetAllumer = mi.listeObjetAbonneOn(id);

            session.setAttribute("idUser", id);
            session.setAttribute("listeObjet", mi.listeObjet(id));
            session.setAttribute("prenom", us.getPrenom());
            session.setAttribute("nom", us.getNom());
            session.setAttribute("login", us.getLogin());
            session.setAttribute("adresse", us.getAdresse());
            session.setAttribute("tel", us.getTel());
            session.setAttribute("email", us.getEmail());
            for (User u1 : liste) {
                if (login.equals(u1.getLogin()) && passe.equals(u1.getPasse()) && u1.getProfil().equalsIgnoreCase("administrateur")) {
                    t = t - 1;
                    rd = request.getRequestDispatcher("accueilAdmin.jsp");
                    break;
                } else if (login.equals(u1.getLogin()) && passe.equals(u1.getPasse()) && u1.getProfil().equals("abonne")) {
                    t = t + 1;
                    getServletContext().setAttribute("passe", passe);
                    getServletContext().setAttribute("login", login);
                    session.setAttribute("objetEteint", objetEteint);
                    session.setAttribute("objetAllumer", objetAllumer);
                    List<Objet> mesObjets = mi.listeObjetAbonne(id);
                    List objets = new ArrayList();
                    for (Objet ob : mesObjets) {
                        objets.add(ob.getNomObjet());
                    }
                    getServletContext().setAttribute("listeObjet", objets);
                    // getServletContext().setAttribute("listeObjet", mi.listeObjet(id));
                    session.setAttribute("idUser", us.getIdUser());
                    session.setAttribute("prenom", us.getPrenom());
                    session.setAttribute("nom", us.getNom());
                    session.setAttribute("login", us.getLogin());
                    session.setAttribute("adresse", us.getAdresse());
                    session.setAttribute("tel", us.getTel());
                    session.setAttribute("email", us.getEmail());
                    rd = request.getRequestDispatcher("accueilAbonne.jsp");
                    break;
                }
            }
            if (t == 1) {
                String test = "login etou mots de passe incorrect";
                request.setAttribute("test", test);
                rd = request.getRequestDispatcher("connexion.jsp");
                JOptionPane.showMessageDialog(null, "login et/ou mot de passe incorrect(s).", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (action.equals("objet")) {
            int id = Integer.parseInt(request.getParameter("id"));;
            HttpSession session = request.getSession();
            session.setAttribute("id", id);
            rd = request.getRequestDispatcher("mesObjets.jsp");
        } else if (action.equals("ObjetOn")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("listeObjet", mi.listeObjetAbonneOn(id));
            rd = request.getRequestDispatcher("objetOn.jsp");
        } else if (action.equals("ObjetOff")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("listeObjet", mi.listeObjetAbonneOff(id));
            rd = request.getRequestDispatcher("objetOff.jsp");
        }

        if (rd != null) {
            rd.forward(request, response);
        }

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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
