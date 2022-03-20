/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Reseau {
    private int idReseau;
    private String nomReseau;

    public Reseau(String nomReseau) {
        this.nomReseau = nomReseau;
    }

    public Reseau() {
    }

    public int getIdReseau() {
        return idReseau;
    }

    public void setIdReseau(int idReseau) {
        this.idReseau = idReseau;
    }

    public String getNomReseau() {
        return nomReseau;
    }

    public void setNomReseau(String nomReseau) {
        this.nomReseau = nomReseau;
    }
    
    

   
}
