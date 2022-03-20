/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Abonnement;
import model.Connexion;
import model.User;
import model.Zone;
import model.Batiment;
import model.Localisation;
import model.Reseau;
import model.Station;
import model.Objet;

/**
 *
 * @author LENOVO
 */
public class MetierImp implements InterfaceMetier {

    public void OnEtatObjet(int idObjet) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update objet set etat=" + 1 + " where idObjet=" + idObjet + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void OffEtatObjet(int idObjet) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update objet set etat=" + 0 + " where idObjet=" + idObjet + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public boolean selectMDP(String log) {
        String mdp = null;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM user where login='" + log + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                mdp = resultat.getString("login");
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        if (mdp == null) {
            return true;
        } else {
            return false;
        }
    }

    public User UserCompte(String passe, String login) {
        User ad = new User();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM user where passe='" + passe + "' and login='" + login + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                ad.setIdUser(resultat.getInt("idUser"));
                ad.setPrenom(resultat.getString("prenom"));
                ad.setNom(resultat.getString("nom"));
                ad.setLogin(resultat.getString("login"));
                ad.setPasse(resultat.getString("passe"));
                ad.setAdresse(resultat.getString("adresse"));
                ad.setTel(resultat.getString("tel"));
                ad.setEmail(resultat.getString("email"));
                ad.setProfil(resultat.getString("profil"));
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return ad;

    }

    public void ajoutabonne(int idUser, String blocked) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into abonne(idUser,blocked) values('" + idUser + "','" + blocked + "' where idUser='" + idUser + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public void ajouterUser(String nom, String prenom, String login, String passe, String email, String profil, String adresse, String tel) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into user(nom,prenom,login,passe,email,profil,adresse,tel) values('" + nom + "','" + prenom + "','" + login + "','" + passe + "','" + email + "','" + profil + "','" + adresse + "','" + tel + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public void ajouterAdmin(int idUser) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into administrateur(idUser) values(" + idUser + ")";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }

    @Override
    public void ajouterAbonne(int idUser) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into abonne(idUser) values(" + idUser + ")";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override

    public User selectidUser() {
        User u1 = new User();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *  from user ");


            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                u1.setIdUser(resultat.getInt("idUser"));
                u1.setPrenom(resultat.getString("prenom"));
                u1.setNom(resultat.getString("nom"));
                u1.setLogin(resultat.getString("login"));
                u1.setPasse(resultat.getString("passe"));
                u1.setEmail(resultat.getString("email"));
                u1.setProfil(resultat.getString("profil"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return u1;
    }

    public User selectidUser(String log, String passe) {
        User u1 = new User();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *  from user where login='" + log + "' and passe='" + passe + "' ");


            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                u1.setIdUser(resultat.getInt("idUser"));
                u1.setPrenom(resultat.getString("prenom"));
                u1.setNom(resultat.getString("nom"));
                u1.setLogin(resultat.getString("login"));
                u1.setPasse(resultat.getString("passe"));
                u1.setEmail(resultat.getString("email"));
                u1.setProfil(resultat.getString("profil"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return u1;
    }

    public Zone selectnomZone(int idBatiment) {
        Zone z = new Zone();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("select *from  batiment b, zone z where z.idZone=b.idZone and b.idBatiment=" + idBatiment + " ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                z.setIdZone(resultat.getInt("idZone"));
                z.setNomZone(resultat.getString("nomZone"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
        return z;
    }//    public List<Zone> nomZones(int idZone) {

    public List<Zone> selectZone(String nomZone) {
        List liste = new ArrayList();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("select *from  zone where nomZone='" + nomZone + "' ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Zone z = new Zone();
                z.setIdZone(resultat.getInt("idZone"));
                z.setNomZone(resultat.getString("nomZone"));
                liste.add(z);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
        return liste;
    }

    @Override
    public Abonnement selectidAbonnement() {
        Abonnement ab = new Abonnement();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM abonnement ");


            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                ab.setIdDmd(resultat.getInt("idDmd"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setNom(resultat.getString("nom"));
                ab.setEtat(resultat.getString("etat"));
                ab.setEmail(resultat.getString("email"));
                ab.setTel(resultat.getString("tel"));
                ab.setAdresse(resultat.getString("adresse"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return ab;
    }

    @Override
    public void ajouterZone(String nomZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into zone (nomZone) values( '" + nomZone + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void ajouterReseau(String nomReseau) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into reseau(nomReseau) values('" + nomReseau + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public void ajouterDemande(String nom, String prenom, String email, String adresse, String tel) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into abonnement(nom,prenom,email,adresse,tel) values('" + nom + "','" + prenom + "','" + email + "','" + adresse + "','" + tel + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public int ajouterObjet(int idZone, int idBatiment, int idLocalisation, int idStation, int idUser, String nomObjet, String type, String voltage, String connec, int etat) {

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into objet (idZone,idBatiment,idLocalisation ,idStation,idUser,nomObjet,type,voltage,connectivite,etat) values(" + idZone + "," + idBatiment + "," + idLocalisation + "," + idStation + "," + idUser + ",'" + nomObjet + "','" + type + "','" + voltage + "','" + connec + "'," + etat + ")";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
            return 1;
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
        return 0;
    }

    public void ajouterStation(int idReseau, String nom, String type, String connec, String alerte) {

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into station (idReseau,nomStation,typeStation,connectiviteStation,alerte) values('" + idReseau + "','" + nom + "','" + type + "','" + connec + "','" + alerte + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void ajouterBatiment(int idZone, String nomBatiment) {

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into batiment (idZone,nomBatiment) values('" + idZone + "','" + nomBatiment + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void ajouterLocalisation(int idZone, int idBatiment, String typeLoca, String nomLoca) {

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into localisation (idZone,idBatiment,typeLocalisation,nomLocalisation) values('" + idZone + "','" + idBatiment + "','" + typeLoca + "','" + nomLoca + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }
public void ajouterConsommation(int idObjet, long dateDebut, long dateFin, float energie) {

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "insert into consommation (idObjet,dateDebut,dateFin,energie) values('" + idObjet + "','" + dateDebut + "','" + dateFin + "','" + energie + "')";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }
    ///////////////////Modification//////////////////////
    public void modifierABonne(int idUser, String nom, String prenom, String login, String passe, String email, String profil, String adresse, String tel) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update User set prenom='" + prenom + "', nom='" + nom + "', adresse='" + adresse + "', email='" + email + "', tel='" + tel + "', login='" + login + "', passe='" + passe + "'  where idUser=" + idUser + " ";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void modifierObjet(int idObjet, String nomObjet, String type, String voltage, String connectivite) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update objet set nomObjet='" + nomObjet + "', type='" + type + "', voltage=" + voltage + ", connectivite='" + connectivite + "' where idObjet=" + idObjet;

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void modifierZone(int idZone, String nomZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update zone set nomZone='" + nomZone + "' where idZone=" + idZone;

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void modifierBatiment(int idBat, int idZone, String nomBat) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update batiment set nomBatiment='" + nomBat + "' where idBatiment=" + idBat + " and idZone=" + idZone;

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void modifierUser(int idUser, String nom, String prenom, String login, String email, String passe, String adresse, String tel) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update User set nom='" + nom + "', prenom='" + prenom + "',login='" + login + "',email='" + email + "',passe='" + passe + "',adresse='" + adresse + "',tel='" + tel + "' where idUser=" + idUser + " ";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void modifierLocalisation(int idLoca, int idBat, int idZone, String nomLoca, String type) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update Localisation set  nomLocalisation='" + nomLoca + "', typeLocalisation='" + type + "' where  idLocalisation=" + idLoca + " and  idBatiment=" + idBat + " and idZone=" + idZone;

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void validerDemande(int idabonne) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update abonnement set etat=1 where idAbonne=" + idabonne + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }

    public void modifierReseau(int idReseau, String nom) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update reseau set nomReseau='" + nom + "' where idReseau=" + idReseau + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }

    public void modifierStation(int idReseau, int idSta, String type, String connec, String alerte, String nomSta) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "update station set nomStation='" + nomSta + "', typeStation='" + type + "',alerte='" + alerte + "',connectiviteStation='" + connec + "' where idReseau=" + idReseau + " and  idStation=" + idSta + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }

    ///////////////////////SUPPRESSION///////////////////////////////
    public void supprimerUser(int idUser) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from User where idUser=" + idUser + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public void supprimerZone(int idZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from zone where idZone=" + idZone + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }

    public void supprimerObjet(int idOb) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from objet where idObjet=" + idOb + " ";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public void supprimerDemande(int idAbonne) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete FROM Abonnement where idAbonne=" + idAbonne + "";
            // update abonnement set etat = 1 where idAbonne = " + idabonne + "
            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @Override
    public void supprimerAbonne(int idUser) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from abonne where idUser=" + idUser + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerLocalisation(int idLoca) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from abonne where localisation=" + idLoca + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerLocalisationZone(int idZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from localisation where localisation=" + idZone + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerLocaBat(int idbat, int idZone, int idLoca) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from localisation where idBatiment=" + idbat + " and idZone=" + idZone + " and idLocalisation=" + idLoca + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerLocaBatiment(int idLoca, int idbat, int idZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from Localisation where idBatiment=" + idbat + " and idZone=" + idZone + " and idLocalisation=" + idLoca + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerLocaBatiment(int idbat, int idZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from Localisation where idBatiment=" + idbat + " and idZone=" + idZone + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerBatiment(int idbat, int idZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from batiment where idBatiment=" + idbat + " and idZone=" + idZone + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerBatimentZone(int idZone) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from batiment where idZone=" + idZone + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerStation(int idSta, int idReseau) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from Station where idReseau=" + idReseau + " and idStation=" + idSta + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void deleteStation(int idSta) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from Station where idStation" + idSta + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    public void supprimerReseau(int idReseau) {
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            String r = "delete from reseau where idReseau=" + idReseau + "";

            int i = st.executeUpdate(r);
            System.out.println("rows affected by insert " + i);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    //////////////////LISTER/////////////////////
    public List<Objet> listeObjetAbonne(int id) {

        List<Objet> listeOb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u, objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone and  u.idUser=" + id + "");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,objet o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdObjet(resultat.getInt("idObjet"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setNomZone(resultat.getString("nomZone"));
                ob.setIdLocalisation(resultat.getInt("idLocalisation"));
                ob.setNomLocalisation(resultat.getString("nomLocalisation"));
                ob.setNomStation(resultat.getString("nomStation"));
                ob.setTypeLocalisation(resultat.getString("typeLocalisation"));
                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setNomBatiment(resultat.getString("nomBatiment"));
                ob.setIdStation(resultat.getInt("idStation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setType(resultat.getString("type"));
                ob.setVoltage(resultat.getInt("voltage"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setEtat(resultat.getInt("etat"));
                listeOb.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeOb;

    }

    public List<Objet> RechercheObjet(String nomObjet) {

        List<Objet> listeOb = new ArrayList<>();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from User u,abonne a, objet o,station s, localisation l,batiment b,zone z where u.idUser=a.idUser and o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone and o.nomObjet='" + nomObjet + "' order by o.idObjet ");
            // ResultSet resultat = st.executeQuery( " select *FROMselect *from User u, objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzonegroup by u.idUser  OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,objet o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdObjet(resultat.getInt("idObjet"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setNomZone(resultat.getString("nomZone"));
                ob.setNom(resultat.getString("nom"));
                ob.setPrenom(resultat.getString("prenom"));
                ob.setEmail(resultat.getString("email"));
                ob.setIdLocalisation(resultat.getInt("idLocalisation"));
                ob.setNomLocalisation(resultat.getString("nomLocalisation"));
                ob.setNomStation(resultat.getString("nomStation"));
                ob.setTypeLocalisation(resultat.getString("typeLocalisation"));
                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setNomBatiment(resultat.getString("nomBatiment"));
                ob.setIdStation(resultat.getInt("idStation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setType(resultat.getString("type"));
                ob.setVoltage(resultat.getInt("voltage"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setEtat(resultat.getInt("etat"));
                listeOb.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeOb;

    }

    public List<Batiment> RechercheBatiment(String nomBatiment) {

        List<Batiment> listeBat = new ArrayList<>();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from zone z, batiment b where z.idZone=b.idZone and nomBatiment='" + nomBatiment + "' order by idBatiment ");

            while (resultat.next()) {
                Batiment ba = new Batiment();

                ba.setIdZone(resultat.getInt("idZone"));
                ba.setIdBatiment(resultat.getInt("idBatiment"));
                ba.setNomBatiment(resultat.getString("nomBatiment"));
                ba.setNomZone(resultat.getString("nomZone"));

                listeBat.add(ba);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeBat;

    }

    public List<Localisation> RechercheLocalisation(String nomLoca) {

        List<Localisation> listeLoca = new ArrayList<>();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from zone z, batiment b, localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment and z.idZone=l.idZone and nomLocalisation='" + nomLoca + "' order by idLocalisation ");

            while (resultat.next()) {

                Localisation loca = new Localisation();
                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                loca.setIdZone(resultat.getInt("idZone"));
                loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
                loca.setNomZone(resultat.getString("nomZone"));
                loca.setNomBatiment(resultat.getString("nomBatiment"));
                listeLoca.add(loca);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeLoca;

    }

    public List<Objet> listeObjet() {

        List<Objet> listeOb = new ArrayList<>();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from User u,abonne a, objet o,station s, localisation l,batiment b,zone z where u.idUser=a.idUser and o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone order by o.idObjet ");
            // ResultSet resultat = st.executeQuery( " select *FROMselect *from User u, objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzonegroup by u.idUser  OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,objet o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdObjet(resultat.getInt("idObjet"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setNomZone(resultat.getString("nomZone"));
                ob.setNom(resultat.getString("nom"));
                ob.setPrenom(resultat.getString("prenom"));
                ob.setEmail(resultat.getString("email"));
                ob.setIdLocalisation(resultat.getInt("idLocalisation"));
                ob.setNomLocalisation(resultat.getString("nomLocalisation"));
                ob.setNomStation(resultat.getString("nomStation"));
                ob.setTypeLocalisation(resultat.getString("typeLocalisation"));
                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setNomBatiment(resultat.getString("nomBatiment"));
                ob.setIdStation(resultat.getInt("idStation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setType(resultat.getString("type"));
                ob.setVoltage(resultat.getInt("voltage"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setEtat(resultat.getInt("etat"));
                listeOb.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeOb;

    }

    @Override
    public List<Abonnement> listerAbonnement() {
        List<Abonnement> listeAb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM abonnement where etat=0");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Abonnement ad = new Abonnement();
                ad.setIdDmd(resultat.getInt("idDmd"));
                ad.setPrenom(resultat.getString("prenom"));
                ad.setNom(resultat.getString("nom"));
                ad.setEmail(resultat.getString("email"));
                ad.setAdresse(resultat.getString("adresse"));
                ad.setTel(resultat.getString("tel"));
                listeAb.add(ad);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeAb;

    }

    @Override
    public List<Zone> ListerZone() {

        List<Zone> liste = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();

            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("Select *from  zone z,batiment b, localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment Group By z.idZone");
            //Select *from  zone z,batiment b, localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment Group By z.idZone
            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Zone zo = new Zone();
                zo.setIdZone(resultat.getInt("idZone"));
                zo.setNomZone(resultat.getString("nomZone"));
                liste.add(zo);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Zone> ListerZone1() {

        List<Zone> liste = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();

            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("Select *from  zone z Group By z.idZone");
            while (resultat.next()) {
                Zone zo = new Zone();
                zo.setIdZone(resultat.getInt("idZone"));
                zo.setNomZone(resultat.getString("nomZone"));
                liste.add(zo);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    @Override
    public List<Batiment> ListerBatiment1() {

        List<Batiment> listeb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM batiment");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Batiment bat = new Batiment();
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));
                listeb.add(bat);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeb;

    }

    public List<Batiment> ListerBatiment(int idZone) {

        List<Batiment> listeb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT idBatiment,nomBatiment FROM batiment where idBatiment=" + idZone + "");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Batiment bat = new Batiment();
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));
                listeb.add(bat);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeb;

    }

    public Batiment ListeBatiment(int idZone) {
        Batiment bat = new Batiment();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("Select *from  zone z,batiment b, localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment and z.idZone=" + idZone + " GROUP BY nomBatiment ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                bat.setIdZone(resultat.getInt("idZone"));
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return bat;

    }

    public List<Localisation> ListerLocalisation() {

        List<Localisation> liste = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery(" SELECT *FROM  Localisation");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Localisation loca = new Localisation();
                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                loca.setIdZone(resultat.getInt("idZone"));
                loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
//                loca.setNomZone(resultat.getString("nomZone"));
//                loca.setNomBatiment(resultat.getString("nomBatiment"));
                liste.add(loca);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public Localisation SelectLocalisation(int idBatiment, int idZone, int idLoca) {
        Localisation loca = new Localisation();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery(" SELECT *FROM  localisation where idBatiment=" + idBatiment + " and idZone=" + idZone + " and idLocalisation=" + idLoca + "");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                loca.setIdZone(resultat.getInt("idZone"));
                loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return loca;

    }

    @Override
    public List<Localisation> ListerInfoLocalisation() {

        List<Localisation> liste = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery(" SELECT *FROM zone z, batiment b, localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment and z.idZone=l.idZone order by l.idLocalisation");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Localisation loca = new Localisation();
                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                loca.setIdZone(resultat.getInt("idZone"));
                loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
                loca.setNomZone(resultat.getString("nomZone"));
                loca.setNomBatiment(resultat.getString("nomBatiment"));
                liste.add(loca);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Localisation> listerInfoLocalisation() {

        List<Localisation> liste = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery(" SELECT *FROM localisation");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Localisation loca = new Localisation();
                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
//   loca.setIdZone(resultat.getInt("idZone"));
//   loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
//   loca.setNomZone(resultat.getString("nomZone"));
//   loca.setNomBatiment(resultat.getString("nomBatiment"));
                liste.add(loca);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Station> ListerStation() {

        List<Station> listSta = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM  station");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Station sta = new Station();
                sta.setIdStation(resultat.getInt("idStation"));
                sta.setIdReseau(resultat.getInt("idReseau"));
                sta.setNomStation(resultat.getString("nomStation"));
                sta.setTypeStation(resultat.getString("typeStation"));
                sta.setConnectiviteStation(resultat.getString("connectiviteStation"));
                sta.setAlerte(resultat.getString("alerte"));
                listSta.add(sta);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listSta;

    }

    public List<Station> ListerStation1() {

        List<Station> listSta = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM  station s ,Reseau r where s.idReseau=r.idReseau order by s.idStation");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Station sta = new Station();
                sta.setIdStation(resultat.getInt("idStation"));
                sta.setIdReseau(resultat.getInt("idReseau"));
                sta.setNomStation(resultat.getString("nomStation"));
                sta.setNomReseau(resultat.getString("nomReseau"));
                sta.setTypeStation(resultat.getString("typeStation"));
                sta.setConnectiviteStation(resultat.getString("connectiviteStation"));
                sta.setAlerte(resultat.getString("alerte"));
                listSta.add(sta);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listSta;

    }

    public List<Batiment> ListeBatiment() {

        List<Batiment> listeb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM  batiment  GROUP BY idBatiment");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Batiment bat = new Batiment();
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));
                listeb.add(bat);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeb;

    }

    public List<Zone> listeZone() {

        List<Zone> liste = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();

            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM zone z, batiment b where z.idZone=b.idZone group by nomZone");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Zone zo = new Zone();
                zo.setIdZone(resultat.getInt("idZone"));
                zo.setNomZone(resultat.getString("nomZone"));
                liste.add(zo);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public Zone listerZone(int idZone) {

        Zone zo = new Zone();
        try {
            Connection con = Connexion.getCon();

            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM zone z where idZone=" + idZone + " order by idZone");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                zo.setIdZone(resultat.getInt("idZone"));
                zo.setNomZone(resultat.getString("nomZone"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return zo;

    }

    public Batiment listeBatiment(int idZone) {

        Batiment bat = new Batiment();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM batiment where idZone=" + idZone + "");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return bat;

    }

    public Batiment listerBatiment(int idZone, int idBat) {

        Batiment bat = new Batiment();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM batiment where idZone=" + idZone + " and idZone=" + idZone + "");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return bat;

    }

    public List<Batiment> listeBatiment1(int idZone) {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("Select *from  zone z,batiment b, localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment and z.idZone=" + idZone + "  ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Batiment bat = new Batiment();
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));
                liste.add(bat);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Localisation> listeLocalisation1() {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT  *from localisation where idLocalisation");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Localisation loca = new Localisation();
                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
                loca.setIdZone(resultat.getInt("idZone"));
                loca.setIdBatiment(resultat.getInt("idBatiment"));

                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                liste.add(loca);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Batiment> nomBat() {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM batiment b, zone z,localisation l where z.idZone=b.idZone and b.idBatiment=l.idBatiment group by b.idBatiment");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Batiment bat = new Batiment();
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));
                bat.setNomZone(resultat.getString("nomZone"));
                liste.add(bat);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Batiment> listeBatiment() {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM batiment b, zone z where z.idZone=b.idZone  order by b.idBatiment");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Batiment bat = new Batiment();
                bat.setIdZone(resultat.getInt("idZone"));
                bat.setIdBatiment(resultat.getInt("idBatiment"));
                bat.setNomBatiment(resultat.getString("nomBatiment"));
                bat.setNomZone(resultat.getString("nomZone"));
                liste.add(bat);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Zone> nomZone() {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM  zone  order by idZone");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Zone zo = new Zone();
                zo.setIdZone(resultat.getInt("idZone"));
                zo.setNomZone(resultat.getString("nomZone"));
                // loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                liste.add(zo);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Localisation> nomLoca(int idZone, int idBatiment, int idLocalisation) {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM localisation where idBatiment=" + idBatiment + " and idZone=" + idZone + " and idLocalisation=" + idLocalisation + "");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Localisation loca = new Localisation();
                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                // loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                //    loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                liste.add(loca);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Zone> nomZones(int idZone) {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM zone where idZone=" + idZone + " ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Zone z = new Zone();
                z.setIdZone(resultat.getInt("idZone"));
                // loca.setIdBatiment(resultat.getInt("idBatiment"));
                z.setNomZone(resultat.getString("nomZone"));
                //loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                liste.add(z);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List listeObjet(int id) {

        List liste = new ArrayList();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM objet where idUser=" + id + " ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setIdLocalisation(resultat.getInt("idLocalisation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setVoltage(resultat.getFloat("voltage"));
                ob.setType(resultat.getString("type"));
                liste.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return liste;

    }

    public List<Reseau> ListerReseau() {

        List<Reseau> listeReseau = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM reseau");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Reseau re = new Reseau();

                re.setIdReseau(resultat.getInt("idReseau"));
                re.setNomReseau(resultat.getString("nomReseau"));
                listeReseau.add(re);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeReseau;

    }

    public List<User> ListerUserAbonne() {

        List<User> listeus = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM user u, abonne a where u.idUser=a.idUser ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User us = new User();
                us.setIdUser(resultat.getInt("idUser"));

                us.setPrenom(resultat.getString("prenom"));
                us.setNom(resultat.getString("nom"));
                us.setAdresse(resultat.getString("adresse"));
                us.setEmail(resultat.getString("email"));
                us.setLogin(resultat.getString("login"));
                us.setPasse(resultat.getString("passe"));
                us.setTel(resultat.getString("tel"));
                us.setBlocked(resultat.getInt("blocked"));
                listeus.add(us);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeus;

    }

    public int nbrObjetAbonne(int idUser) {
        int i = 0;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT idUser,COUNT(*)as NombreObjet from Objet  Group by idUser where idUser='" + idUser + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                i++;
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return i;

    }

    public List<User> ListerAbonne(String prenom) {

        List<User> listeus = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM user u, abonne a where u.idUser=a.idUser and prenom='" + prenom + "' ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User us = new User();

                us.setIdUser(resultat.getInt("idUser"));
                us.setPrenom(resultat.getString("prenom"));
                us.setNom(resultat.getString("nom"));
                us.setAdresse(resultat.getString("adresse"));
                us.setEmail(resultat.getString("email"));
                us.setLogin(resultat.getString("login"));
                us.setPasse(resultat.getString("passe"));
                us.setTel(resultat.getString("tel"));
                listeus.add(us);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeus;

    }

    public List<User> resultatRecherche(String rech) {
        String abonne = "abonne";
        List<User> listeus = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM user where profil='" + abonne + "' and nom='" + rech + "' or prenom='" + rech + "' or adresse='" + rech + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User us = new User();

                us.setIdUser(resultat.getInt("idUser"));
                us.setPrenom(resultat.getString("prenom"));
                us.setNom(resultat.getString("nom"));
                us.setAdresse(resultat.getString("adresse"));
                us.setEmail(resultat.getString("email"));
                us.setLogin(resultat.getString("login"));
                us.setPasse(resultat.getString("passe"));
                us.setTel(resultat.getString("tel"));
                listeus.add(us);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeus;

    }

    public List<User> ListerAbonne2(String adresse) {

        List<User> listeus = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM user u, abonne a where u.idUser=a.idUser and adresse='" + adresse + "' ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User us = new User();

                us.setIdUser(resultat.getInt("idUser"));
                us.setPrenom(resultat.getString("prenom"));
                us.setNom(resultat.getString("nom"));
                us.setAdresse(resultat.getString("adresse"));
                us.setEmail(resultat.getString("email"));
                us.setLogin(resultat.getString("login"));
                us.setPasse(resultat.getString("passe"));
                us.setTel(resultat.getString("tel"));
                listeus.add(us);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeus;

    }

    public List<User> ListeAbonne4(String Zone) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u,abonne a,objet o,station s,batiment b,zone z where u.idUser=a.idUser and u.idUser=o.idUser and o.idStation=s.idStation and o.idzone=z.idzone and o.idbatiment=b.idbatiment and z.idZone=b.idZone and z.nomZone='" + Zone + "' group by z.idZone");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();
                ab.setIdUser(resultat.getInt("idUser"));
                ab.setIdObjet(resultat.getInt("idObjet"));
                ab.setIdZone(resultat.getInt("idZone"));
                ab.setNomZone(resultat.getString("nomZone"));

                ab.setNomStation(resultat.getString("nomStation"));

                ab.setIdBatiment(resultat.getInt("idBatiment"));
                ab.setNomBatiment(resultat.getString("nomBatiment"));
                ab.setIdStation(resultat.getInt("idStation"));
                ab.setNomObjet(resultat.getString("nomObjet"));
                ab.setType(resultat.getString("type"));
                ab.setVoltage(resultat.getInt("voltage"));
                ab.setConnectivite(resultat.getString("connectivite"));
                ab.setEtat(resultat.getInt("etat"));

                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    public List<User> ListeAbonne5(String batiment) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u,abonne a,objet o,station s,batiment b,zone z where u.idUser=a.idUser and u.idUser=o.idUser and o.idStation=s.idStation and o.idzone=z.idzone and o.idbatiment=b.idbatiment and z.idZone=b.idZone and b.nomBatiment='" + batiment + "' group by b.nomBatiment");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();
                ab.setIdUser(resultat.getInt("idUser"));
                ab.setIdObjet(resultat.getInt("idObjet"));
                ab.setIdZone(resultat.getInt("idZone"));
                ab.setNomZone(resultat.getString("nomZone"));

                ab.setNomStation(resultat.getString("nomStation"));

                ab.setIdBatiment(resultat.getInt("idBatiment"));
                ab.setNomBatiment(resultat.getString("nomBatiment"));
                ab.setIdStation(resultat.getInt("idStation"));
                ab.setNomObjet(resultat.getString("nomObjet"));
                ab.setType(resultat.getString("type"));
                ab.setVoltage(resultat.getInt("voltage"));
                ab.setConnectivite(resultat.getString("connectivite"));
                ab.setEtat(resultat.getInt("etat"));

                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("Login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    public List<User> ListeAbonne6(String localisation) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u,objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone and l.nomLocalisation=" + localisation + " ");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();
                ab.setIdUser(resultat.getInt("idUser"));
                ab.setIdObjet(resultat.getInt("idObjet"));
                ab.setIdZone(resultat.getInt("idZone"));
                ab.setNomZone(resultat.getString("nomZone"));
                ab.setIdLocalisation(resultat.getInt("idLocalisation"));
                ab.setNomLocalisation(resultat.getString("nomLocalisation"));
                ab.setNomStation(resultat.getString("nomStation"));
                ab.setTypeLocalisation(resultat.getString("typeLocalisation"));
                ab.setIdBatiment(resultat.getInt("idBatiment"));
                ab.setNomBatiment(resultat.getString("nomBatiment"));
                ab.setIdStation(resultat.getInt("idStation"));
                ab.setNomObjet(resultat.getString("nomObjet"));
                ab.setType(resultat.getString("type"));
                ab.setVoltage(resultat.getInt("voltage"));
                ab.setConnectivite(resultat.getString("connectivite"));
                ab.setEtat(resultat.getInt("etat"));

                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("Login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    public List<User> ListeAbonne7(String station) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u,abonne a,objet o,station s,batiment b,zone z where u.idUser=a.idUser and u.idUser=o.idUser and o.idStation=s.idStation and o.idzone=z.idzone and o.idbatiment=b.idbatiment and z.idZone=b.idZone and s.nomStation='" + station + "' group by s.nomStation ");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();
                ab.setIdUser(resultat.getInt("idUser"));
                ab.setIdObjet(resultat.getInt("idObjet"));
                ab.setIdZone(resultat.getInt("idZone"));
                ab.setNomZone(resultat.getString("nomZone"));

                ab.setNomStation(resultat.getString("nomStation"));

                ab.setIdBatiment(resultat.getInt("idBatiment"));
                ab.setNomBatiment(resultat.getString("nomBatiment"));
                ab.setIdStation(resultat.getInt("idStation"));
                ab.setNomObjet(resultat.getString("nomObjet"));
                ab.setType(resultat.getString("type"));
                ab.setVoltage(resultat.getInt("voltage"));
                ab.setConnectivite(resultat.getString("connectivite"));
                ab.setEtat(resultat.getInt("etat"));

                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("Login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    @Override
    public List<User> selectAdmin() {
        List<User> lisad = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM user ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ad = new User();
                ad.setPrenom(resultat.getString("prenom"));
                ad.setNom(resultat.getString("nom"));
                ad.setLogin(resultat.getString("login"));
                ad.setPasse(resultat.getString("passe"));
                ad.setAdresse(resultat.getString("adresse"));
                ad.setTel(resultat.getString("tel"));
                ad.setEmail(resultat.getString("email"));
                ad.setProfil(resultat.getString("profil"));
                lisad.add(ad);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return lisad;
    }

    public List<Reseau> selectReseau() {
        List<Reseau> lisReseau = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM reseau ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Reseau ad = new Reseau();

                ad.setNomReseau(resultat.getString("nomReseau"));

                lisReseau.add(ad);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return lisReseau;
    }

    public Reseau selectReseau(int idReseau) {
        Reseau ad = new Reseau();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM reseau where idReseau=" + idReseau + " ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                ad.setIdReseau(resultat.getInt("idReseau"));
                ad.setNomReseau(resultat.getString("nomReseau"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return ad;
    }

    public Station selectStation(int idStation, int idReseau) {
        Station sta = new Station();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM station  s, reseau r  where r.idReseau=s.idReseau and s.idStation=" + idStation + " and s.idReseau=" + idReseau + "");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                sta.setIdReseau(resultat.getInt("idReseau"));
                sta.setNomReseau(resultat.getString("nomReseau"));
                sta.setIdStation(resultat.getInt("idStation"));
                sta.setNomStation(resultat.getString("nomStation"));
                sta.setTypeStation(resultat.getString("typeStation"));
                sta.setConnectiviteStation(resultat.getString("connectiviteStation"));
                sta.setAlerte(resultat.getString("alerte"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return sta;
    }

    public List<Reseau> recherReseau(String nom) {
        List<Reseau> lisReseau = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM reseau where nomReseau='" + nom + "' ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Reseau ad = new Reseau();
                ad.setIdReseau(resultat.getInt("idReseau"));
                ad.setNomReseau(resultat.getString("nomReseau"));

                lisReseau.add(ad);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return lisReseau;
    }
public List<Station> recherStation(String nom) {
        List<Station> lisStat = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM station where nomStation='" + nom + "' ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Station sta = new Station();
                sta.setIdStation(resultat.getInt("idStation"));
                sta.setNomStation(resultat.getString("nomStation"));

                lisStat.add(sta);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return lisStat;
    }
    public String Login() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder pass = new StringBuilder();
        for (int x = 0; x < 10; x++) {
            int i = (int) Math.floor(Math.random() * (10 - 1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }

    public String Passe() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890*/&#";
        StringBuilder pass = new StringBuilder();
        for (int x = 0; x < 10; x++) {
            int i = (int) Math.floor(Math.random() * (10 - 1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }

    public void envoiMail(String recepient, String login, String mdp, String lien) throws Exception {

        System.out.println("Preparation de l envoi du message");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        String monCompte = "java123Examen@gmail.com";
        String password = "ExamJava123";
        String l = login;
        String p = mdp;
        String lienC = lien;

        Session session = Session.getDefaultInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(monCompte, password);
            }

        });
        Message message = prepareMessage(session, monCompte, recepient, l, p, lienC);
        Transport.send(message);
        System.out.println("Message envoye avec succes");
    }

    private static Message prepareMessage(Session session, String monCompte, String recepient, String l, String p, String lienC) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(monCompte));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Validation Abonnement");
            String login;
            message.setText("Bonjour votre demande a ete validee. \n votre login est: " + l + "  votre mot de passe " + p + "\n Veuillez changer vos informations de connexion lors de votre première connexion avec ce lien:" + lienC);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(MetierImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<User> ListeAbonne1(String prenom) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select  distinct u.idUser,u.tel,u.prenom, u.nom,u.adresse,u.login,u.passe,u.email,u.adresse ,a.blocked from User u,abonne a,objet o,station s,batiment b,zone z where u.idUser=a.idUser and u.idUser=o.idUser and o.idStation=s.idStation and o.idzone=z.idzone and o.idbatiment=b.idbatiment and z.idZone=b.idZone and and u.prenom='" + prenom + "'");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();
                ab.setIdUser(resultat.getInt("idUser"));
                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("Login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
//                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    public List<User> ListeAbonne2(String nom) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select  distinct u.idUser,u.tel,u.prenom, u.nom,u.adresse,u.login,u.passe,u.email,u.adresse ,a.blocked from User u,abonne a,objet o,station s,batiment b,zone z where u.idUser=a.idUser and u.idUser=o.idUser and o.idStation=s.idStation and o.idzone=z.idzone and o.idbatiment=b.idbatiment and z.idZone=b.idZone and u.nom='" + nom + "'");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();
                ab.setIdUser(resultat.getInt("idUser"));
                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("Login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
//                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    public List<User> ListeAbonne3(String adresse) {

        List<User> listeUser = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select  distinct u.idUser,u.tel,u.prenom, u.nom,u.adresse,u.login,u.passe,u.email,u.adresse ,a.blocked from User u,abonne a,objet o,station s,batiment b,zone z where u.idUser=a.idUser and u.idUser=o.idUser and o.idStation=s.idStation and o.idzone=z.idzone and o.idbatiment=b.idbatiment and z.idZone=b.idZone and and u.adresse='" + adresse + "' ");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,abonne o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                User ab = new User();

                ab.setIdUser(resultat.getInt("idUser"));
                ab.setNom(resultat.getString("nom"));
                ab.setPrenom(resultat.getString("prenom"));
                ab.setLogin(resultat.getString("Login"));
                ab.setEmail(resultat.getString("email"));
                ab.setPasse(resultat.getString("passe"));
//                ab.setProfil(resultat.getString("profil"));
                ab.setAdresse(resultat.getString("adresse"));
                ab.setTel(resultat.getString("tel"));
                ab.setBlocked(resultat.getInt("blocked"));
                listeUser.add(ab);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeUser;

    }

    public User listeCompteAbonne(String login, String passe) {

        User us = new User();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM user u , abonne a and where u.login='" + login + "' and u.passe='" + passe + "'");

            /* Récupération des données du résultat  de la requête de lecture */
            while (resultat.next()) {

                us.setIdUser(resultat.getInt("idUser"));
                us.setPrenom(resultat.getString("prenom"));
                us.setNom(resultat.getString("nom"));
                us.setAdresse(resultat.getString("adresse"));
                us.setEmail(resultat.getString("email"));
                us.setLogin(resultat.getString("login"));
                us.setPasse(resultat.getString("passe"));
                us.setTel(resultat.getString("tel"));
                us.setBlocked(resultat.getInt("blocked"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return us;

    }

    public List<Objet> listeObjetAbonneOn(int id) {

        List<Objet> listeOb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u, objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone and  o.idUser=" + id + " and o.etat=1 ");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,objet o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdObjet(resultat.getInt("idObjet"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setNomZone(resultat.getString("nomZone"));

                ob.setNomStation(resultat.getString("nomStation"));

                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setNomBatiment(resultat.getString("nomBatiment"));
                ob.setIdStation(resultat.getInt("idStation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setType(resultat.getString("type"));
                ob.setVoltage(resultat.getInt("voltage"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setEtat(resultat.getInt("etat"));
                listeOb.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeOb;

    }

    public List<Objet> listeObjetAbonneOff(int id) {

        List<Objet> listeOb = new ArrayList<>();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u, objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone and  o.idUser=" + id + " and o.etat=0 ");
            // ResultSet resultat = st.executeQuery( " select *FROM OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,objet o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdObjet(resultat.getInt("idObjet"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setNomZone(resultat.getString("nomZone"));

                ob.setNomStation(resultat.getString("nomStation"));

                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setNomBatiment(resultat.getString("nomBatiment"));
                ob.setIdStation(resultat.getInt("idStation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setType(resultat.getString("type"));
                ob.setVoltage(resultat.getInt("voltage"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setEtat(resultat.getInt("etat"));
                listeOb.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeOb;

    }

    public Objet listerObjet(int id) {
        Objet ob = new Objet();

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM objet where idObjet=" + id + " ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                ob.setIdObjet(id);
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setIdLocalisation(resultat.getInt("idLocalisation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setVoltage(resultat.getFloat("voltage"));
                ob.setType(resultat.getString("type"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return ob;
    }

    public Localisation listerLoca(int idLoca) {
        Localisation loca = new Localisation();

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *FROM Localisation where idLocalisation=" + idLoca + " ");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {

                loca.setIdLocalisation(resultat.getInt("idLocalisation"));
                loca.setIdZone(resultat.getInt("idZone"));
                loca.setIdBatiment(resultat.getInt("idBatiment"));
                loca.setNomLocalisation(resultat.getString("nomLocalisation"));
                loca.setTypeLocalisation(resultat.getString("typeLocalisation"));
                loca.setNomZone(resultat.getString("nomZone"));
                loca.setNomBatiment(resultat.getString("nomBatiment"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return loca;
    }

    public User UserId(int id) {
        User ad = new User();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM user where idUser='" + id + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                ad.setIdUser(resultat.getInt("idUser"));
                ad.setPrenom(resultat.getString("prenom"));
                ad.setNom(resultat.getString("nom"));
                ad.setLogin(resultat.getString("login"));
                ad.setPasse(resultat.getString("passe"));
                ad.setAdresse(resultat.getString("adresse"));
                ad.setTel(resultat.getString("tel"));
                ad.setEmail(resultat.getString("email"));
                ad.setProfil(resultat.getString("profil"));
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return ad;

    }

    public boolean selectMDP(int id, String log) {
        int ident = 0;
        String logUser = null;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT login FROM user where idUser!=" + id);

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                logUser = resultat.getString("login");
                if (logUser.equalsIgnoreCase(log)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return false;
    }

    public User UserId1(int id) {
        User ad = new User();
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM user where idUser='" + id + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                ad.setIdUser(resultat.getInt("idUser"));
                ad.setPrenom(resultat.getString("prenom"));
                ad.setNom(resultat.getString("nom"));
                ad.setLogin(resultat.getString("login"));
                ad.setPasse(resultat.getString("passe"));
                ad.setAdresse(resultat.getString("adresse"));
                ad.setTel(resultat.getString("tel"));
                ad.setEmail(resultat.getString("email"));
                ad.setProfil(resultat.getString("profil"));
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return ad;

    }

    public float CalculEnergie(long temps, float intensite, float voltage) {
        float energie = voltage * temps * intensite;
        return energie;

    }

    public User selectidUser(int id) {
        User u1 = new User();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT *  from user where idUser=" + id + " ");


            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                u1.setIdUser(resultat.getInt("idUser"));
                u1.setPrenom(resultat.getString("prenom"));
                u1.setNom(resultat.getString("nom"));
                u1.setLogin(resultat.getString("login"));
                u1.setPasse(resultat.getString("passe"));
                u1.setEmail(resultat.getString("email"));
                u1.setProfil(resultat.getString("profil"));

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return u1;
    }

    public List<Objet> listeObjetUser(int id) {

        List<Objet> listeOb = new ArrayList<>();
        try {

            Connection con = Connexion.getCon();
            Statement st = con.createStatement();

            ResultSet resultat = st.executeQuery("select *from user u,abonne a, objet o,station s, localisation l,batiment b,zone z where u.idUser=a.idUser and o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzone and u.idUser=" + id + " order by o.idObjet ");
            // ResultSet resultat = st.executeQuery( " select *FROMselect *from User u, objet o,station s, localisation l,batiment b,zone z where o.idUser=u.idUser and o.idStation=s.idStation and o.idLocalisation=l.idLocalisation and o.idzone=l.idzone and o.idbatiment=l.idbatiment and o.idlocalisation=l.idlocalisation and l.idzone=b.idzone and l.idbatiment=b.idbatiment and b.idzone=z.idzonegroup by u.idUser  OBJET ");
            //select nom,nomBatiment,idUser,nomObjet from zone z,batiment b,objet o where z.idZone=b.idZone and b.idBatiment=o.idBatiment;and u.idUser="+id+"
/* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                Objet ob = new Objet();
                ob.setIdUser(resultat.getInt("idUser"));
                ob.setIdObjet(resultat.getInt("idObjet"));
                ob.setIdZone(resultat.getInt("idZone"));
                ob.setNomZone(resultat.getString("nomZone"));
                ob.setNom(resultat.getString("nom"));
                ob.setPrenom(resultat.getString("prenom"));
                ob.setEmail(resultat.getString("email"));
                ob.setIdLocalisation(resultat.getInt("idLocalisation"));
                ob.setNomLocalisation(resultat.getString("nomLocalisation"));
                ob.setNomStation(resultat.getString("nomStation"));
                ob.setTypeLocalisation(resultat.getString("typeLocalisation"));
                ob.setIdBatiment(resultat.getInt("idBatiment"));
                ob.setNomBatiment(resultat.getString("nomBatiment"));
                ob.setIdStation(resultat.getInt("idStation"));
                ob.setNomObjet(resultat.getString("nomObjet"));
                ob.setType(resultat.getString("type"));
                ob.setVoltage(resultat.getInt("voltage"));
                ob.setConnectivite(resultat.getString("connectivite"));
                ob.setEtat(resultat.getInt("etat"));
                listeOb.add(ob);
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        return listeOb;
    }

    public boolean verifZone(String nom) {
        String recup = null;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM zone where nomZone='" + nom + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                recup = resultat.getString("nomZone");
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        if (recup == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifBatiment(int id, String nom) {
        String recup = null;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM batiment where nomBatiment='" + nom + "' and idZone='" + id + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                recup = resultat.getString("nomBatiment");
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        if (recup == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifReseau(String nom) {
        String recup = null;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM reseau where nomReseau='" + nom + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                recup = resultat.getString("nomReseau");
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        if (recup == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifStation(int id, String nom) {
        String recup = null;

        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT * FROM station where nomStation='" + nom + "' and idReseau='" + id + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                recup = resultat.getString("nomStation");
            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
        if (recup == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean selectLog(String log) {
        String logUser = null;
        try {
            Connection con = Connexion.getCon();
            Statement st = con.createStatement();
            ResultSet resultat = st.executeQuery("SELECT login FROM user where login='" + log + "'");

            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                logUser = resultat.getString("login");

            }
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }
        if (logUser == null) {
            return true;
        } else {
            return false;
        }
    }
}
