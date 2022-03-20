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
public class User {
    private int idUser;
    private String prenom;
    private String nom;
    private String login;
    private String email;
    private String profil;
    private String passe;
    private String adresse;
    private String tel;
    private int blocked;
    private int idObjet;
    
    private int idZone;
    private int idBatiment;
     private int idStation;
    private int idLocalisation;
    private String nomObjet;
    private String type;
    private int voltage;
    private String connectivite;
    private int etat;
    private String nomZone;
    private String nomBatiment;
    private String nomLocalisation;
    private String typeLocalisation;
    private String nomStation;
//    public Object getIdUser;

    public User(int idUser, String prenom, String nom, String login, String email, String profil, String passe,String adresse, String tel, int blocked ) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.profil = profil;
        this.passe = passe;
        this.blocked = blocked;
    }
    public User(int idUser, String prenom, String nom, String login, String email, String passe,String adresse, String tel ) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.passe = passe;
          }

    public User(String prenom, String nom, String login, String email, String profil, String passe,String adresse, String tel,int blocked) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.profil = profil;
        this.passe = passe;
        this.blocked = blocked;
    }

    public User() {
    }

    public User(int idUser, String prenom, String nom, String login, String email, String profil, String passe, String adresse, String tel, int blocked, int idObjet, int idZone, int idBatiment, int idStation, int idLocalisation, String nomObjet, String type, int voltage, String connectivite, int etat, String nomZone, String nomBatiment, String nomLocalisation, String typeLocalisation, String nomStation) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.profil = profil;
        this.passe = passe;
        this.adresse = adresse;
        this.tel = tel;
        this.blocked = blocked;
        this.idObjet = idObjet;
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
    }

    public User(String prenom, String nom, String login, String email, String profil, String passe, String adresse, String tel, int blocked, int idObjet, int idZone, int idBatiment, int idStation, int idLocalisation, String nomObjet, String type, int voltage, String connectivite, int etat, String nomZone, String nomBatiment, String nomLocalisation, String typeLocalisation, String nomStation) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.email = email;
        this.profil = profil;
        this.passe = passe;
        this.adresse = adresse;
        this.tel = tel;
        this.blocked = blocked;
        this.idObjet = idObjet;
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
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getPasse() {
        return passe;
    }

    public void setPasse(String passe) {
        this.passe = passe;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



   public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public int getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
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

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
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

  
}