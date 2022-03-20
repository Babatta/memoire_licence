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
public class Zone {
    private int idZone;
    private String nomZone;

    public Zone() {
    }

    public Zone(int idZone, String nomZone) {
        this.idZone = idZone;
        this.nomZone = nomZone;
    }

    public Zone(String nomZone) {
        this.nomZone = nomZone;
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
    
    
}
