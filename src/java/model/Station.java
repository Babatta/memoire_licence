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
public class Station {
    
    private int idStation;
    private int idReseau;
     private String nomStation;
      private String nomReseau;
    private String typeStation;
    private String connectiviteStation;
     private String alerte;

    public Station() {
    }

    public Station(int idStation, int idReseau, String nomStation, String nomReseau, String typeStation, String connectiviteStation, String alerte) {
        this.idStation = idStation;
        this.idReseau = idReseau;
        this.nomStation = nomStation;
        this.nomReseau = nomReseau;
        this.typeStation = typeStation;
        this.connectiviteStation = connectiviteStation;
        this.alerte = alerte;
    }

    public Station(int idReseau, String nomStation, String nomReseau, String typeStation, String connectiviteStation, String alerte) {
        this.idReseau = idReseau;
        this.nomStation = nomStation;
        this.nomReseau = nomReseau;
        this.typeStation = typeStation;
        this.connectiviteStation = connectiviteStation;
        this.alerte = alerte;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public int getIdReseau() {
        return idReseau;
    }

    public void setIdReseau(int idReseau) {
        this.idReseau = idReseau;
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }

    public String getNomReseau() {
        return nomReseau;
    }

    public void setNomReseau(String nomReseau) {
        this.nomReseau = nomReseau;
    }

    public String getTypeStation() {
        return typeStation;
    }

    public void setTypeStation(String typeStation) {
        this.typeStation = typeStation;
    }

    public String getConnectiviteStation() {
        return connectiviteStation;
    }

    public void setConnectiviteStation(String connectiviteStation) {
        this.connectiviteStation = connectiviteStation;
    }

    public String getAlerte() {
        return alerte;
    }

    public void setAlerte(String alerte) {
        this.alerte = alerte;
    }

    
     
}
