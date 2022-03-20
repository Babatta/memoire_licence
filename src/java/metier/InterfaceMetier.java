/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import model.Abonnement;
import model.User;
import model.Zone;
import model.Batiment;
import model.Localisation;

public interface InterfaceMetier {

    public List<User> selectAdmin();

    public User selectidUser();

    public Abonnement selectidAbonnement();

    public List<Zone> ListerZone();

    public List<Abonnement> listerAbonnement();

    public List<Localisation> ListerInfoLocalisation();

    public List<Batiment> ListerBatiment1();

    ////////Ajouter/////////////
    public void ajouterUser(String nom, String prenom, String login, String passe, String email, String profil, String adresse, String tel);

    public void ajouterAdmin(int idUser);

    public void ajouterZone(String nomObjet);

    public void ajouterAbonne(int idUser);

    public void ajouterDemande(String nom, String prenom, String email, String adresse, String tel);

    public int ajouterObjet(int idZone, int idBatiment, int idLocalisation, int idStation, int idUser, String nomObjet, String type, String voltage, String connec, int etat);
//public void ajouterObjetConnecte(int idZone, int idBatiment, int idLocalisation, int idStation, int idUser, String nomObjetConnecte, String type, float voltage, String connectivite) ;

//////////////////////Suppression//////////////////////
    public void supprimerDemande(int idAbonne);

    public void supprimerAbonne(int idUser);

    public void supprimerZone(int idZone);

}
