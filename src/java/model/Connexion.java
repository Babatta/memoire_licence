/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class  Connexion {
private static Connection con;
static{
 try{
     try { 
         Class.forName("com.mysql.jdbc.Driver");
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
     }
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/memo", "root", ""); 
   
 
 }  catch (SQLException ex) {
      System.out.println("Error connexion"+ex);
    }}

    public static Connection getCon() {
        return con;
    }
   
   
}
