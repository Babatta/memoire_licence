/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TOSHIBA
 */
public class Consommation {
     private int idConsommation;
    private int idObjet;
    private long dateDebut;
    private long dateFin;
    private float energie;

    public Consommation(int idConsommation, int idObjet, long dateDebut, long dateFin, float energie) {
        this.idConsommation = idConsommation;
        this.idObjet = idObjet;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.energie = energie;
    }

    public Consommation() {
    }

    public int getIdConsommation() {
        return idConsommation;
    }

    public void setIdConsommation(int idConsommation) {
        this.idConsommation = idConsommation;
    }

    public int getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
    }

    public long getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(long dateDebut) {
        this.dateDebut = dateDebut;
    }

    public long getDateFin() {
        return dateFin;
    }

    public void setDateFin(long dateFin) {
        this.dateFin = dateFin;
    }

    public float getEnergie() {
        return energie;
    }

    public void setEnergie(float energie) {
        this.energie = energie;
    }

    
}
