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
public class Objet {
  private int idObjet;
    private int idUser;
    private int idZone;
    private int idBatiment;
     private int idStation;
    private int idLocalisation;
    private String nomObjet;
    private String type;
    private float voltage;
    private String connectivite;
    private int etat;
    private String nomZone;
    private String nomBatiment;
    private String nomLocalisation;
    private String typeLocalisation;
    private String nomStation;
    private String nom;
     private String prenom;
      private String email;

    public Objet() {
    }

    public Objet(int idObjet, int idUser, int idZone, int idBatiment, int idStation, int idLocalisation, String nomObjet, String type, float voltage, String connectivite, int etat, String nomZone, String nomBatiment, String nomLocalisation, String typeLocalisation, String nomStation, String nom, String prenom, String email) {
        this.idObjet = idObjet;
        this.idUser = idUser;
        this.idZone = idZone;
        this.idBatiment = idBatiment;
        this.idStation = idStation;
        this.idLocalisation = idLocalisation;
        this.nomObjet = nomObjet;
        this.type = type;
        this.voltage = voltage;
        this.connectivite = connectivite;
        this.etat = etat;
        this.nomZone = nomZone;
        this.nomBatiment = nomBatiment;
        this.nomLocalisation = nomLocalisation;
        this.typeLocalisation = typeLocalisation;
        this.nomStation = nomStation;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Objet(int idUser, int idZone, int idBatiment, int idStation, int idLocalisation, String nomObjet, String type, float voltage, String connectivite, int etat, String nomZone, String nomBatiment, String nomLocalisation, String typeLocalisation, String nomStation, String nom, String prenom, String email) {
        this.idUser = idUser;
        this.idZone = idZone;
        this.idBatiment = idBatiment;
        this.idStation = idStation;
        this.idLocalisation = idLocalisation;
        this.nomObjet = nomObjet;
        this.type = type;
        this.voltage = voltage;
        this.connectivite = connectivite;
        this.etat = etat;
        this.nomZone = nomZone;
        this.nomBatiment = nomBatiment;
        this.nomLocalisation = nomLocalisation;
        this.typeLocalisation = typeLocalisation;
        this.nomStation = nomStation;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public int getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public int getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(int idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    public String getNomObjet() {
        return nomObjet;
    }

    public void setNomObjet(String nomObjet) {
        this.nomObjet = nomObjet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public String getConnectivite() {
        return connectivite;
    }

    public void setConnectivite(String connectivite) {
        this.connectivite = connectivite;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getNomZone() {
        return nomZone;
    }

    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    public String getNomLocalisation() {
        return nomLocalisation;
    }

    public void setNomLocalisation(String nomLocalisation) {
        this.nomLocalisation = nomLocalisation;
    }

    public String getTypeLocalisation() {
        return typeLocalisation;
    }

    public void setTypeLocalisation(String typeLocalisation) {
        this.typeLocalisation = typeLocalisation;
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

   

   

}
