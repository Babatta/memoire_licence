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
public class Testconnexion {
    private String eml;
     private String psw;
      private String vid;

    public Testconnexion(String eml, String psw, String vid) {
        this.eml = eml;
        this.psw = psw;
        this.vid = vid;
    }

   

    public Testconnexion() {
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getEml() {
        return eml;
    }

    public void setEml(String eml) {
        this.eml = eml;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
     
    
}
