package fr.hb.poker.business;

import java.util.ArrayList;

public class Couleur {
    private String nom;
    private ArrayList<Carte> cartes = new ArrayList<>();


    public Couleur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
