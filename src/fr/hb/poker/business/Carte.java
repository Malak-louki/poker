package fr.hb.poker.business;

import java.util.ArrayList;

public class Carte {
    private int valeur;
    private String nom;
    private ArrayList<Couleur> couleurs = new ArrayList<>();

    public ArrayList<Couleur> getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(ArrayList<Couleur> couleurs) {
        this.couleurs = couleurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
