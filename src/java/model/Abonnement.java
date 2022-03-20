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
public class Abonnement {
    private int idDmd;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String email;
     private String etat;

    public Abonnement(int idAbonne,String nom, String prenom, String adresse, String tel, String email,String etat) {
        this.idDmd = idAbonne;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.etat = etat;
    }


 
    public Abonnement() {
    }

    public int getIdDmd() {
        return idDmd;
    }

    public void setIdDmd(int idDmd) {
        this.idDmd = idDmd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
    
}
