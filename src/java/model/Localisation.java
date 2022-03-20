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
public class Localisation {
    private int idLocalisation;
    private int  idZone;
    private int idBatiment;
    private String typeLocalisation;
     private String nomBatiment;
      private String nomZone;
    private String nomLocalisation;

    public Localisation(int idZone, int idBatiment, String typeLocalisation, String nomBatiment, String nomZone, String nomLocalisation) {
        this.idZone = idZone;
        this.idBatiment = idBatiment;
        this.typeLocalisation = typeLocalisation;
        this.nomBatiment = nomBatiment;
        this.nomZone = nomZone;
        this.nomLocalisation = nomLocalisation;
    }

    public Localisation() {
    }

    public int getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(int idLocalisation) {
        this.idLocalisation = idLocalisation;
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

    public String getTypeLocalisation() {
        return typeLocalisation;
    }

    public void setTypeLocalisation(String typeLocalisation) {
        this.typeLocalisation = typeLocalisation;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    public String getNomZone() {
        return nomZone;
    }

    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }

    public String getNomLocalisation() {
        return nomLocalisation;
    }

    public void setNomLocalisation(String nomLocalisation) {
        this.nomLocalisation = nomLocalisation;
    }

    
    
    
    
    
}
