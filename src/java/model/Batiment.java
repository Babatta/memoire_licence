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
public class Batiment{
      private int idBatiment;
      private int idZone;
      private String nomZone;
     private String nomBatiment;

    public Batiment(int idBatiment, int idZone, String nomZone, String nomBatiment) {
        this.idBatiment = idBatiment;
        this.idZone = idZone;
        this.nomZone = nomZone;
        this.nomBatiment = nomBatiment;
    }

    public Batiment(int idZone, String nomZone, String nomBatiment) {
        this.idZone = idZone;
        this.nomZone = nomZone;
        this.nomBatiment = nomBatiment;
    }

    public Batiment() {
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
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



    
    
}
