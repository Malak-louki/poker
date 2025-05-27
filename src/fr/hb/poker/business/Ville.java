package fr.hb.poker.business;

import java.util.ArrayList;
import java.util.List;

public class Ville {
    private String nom;
    private String codePostal;
    private double latitude;
    private double longitude;
    private ArrayList<Joueur> joueurs = new ArrayList<>();

    public Ville(String nom) {
        this.nom = nom;
    }
    public Ville(String nom, String codePostal) {
        this.nom = nom;
        this.codePostal = codePostal;
    }
    public Ville(String nom, String codePostal, double latitude, double longitude) {
        this.nom = nom;
        this.codePostal = codePostal;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Ville(ArrayList<Joueur> joueurs,String nom, String codePostal, double latitude, double longitude) {
        this.joueurs = joueurs;
        this.nom = nom;
        this.codePostal = codePostal;
        this.latitude = latitude;
        this.longitude = longitude;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
