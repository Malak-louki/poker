package fr.hb.poker;
import fr.hb.poker.business.Carte;
import fr.hb.poker.business.Couleur;
import fr.hb.poker.business.Joueur;
import fr.hb.poker.business.Ville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Couleur> couleurs = new ArrayList<>();
    private static ArrayList<Carte> cartes = new ArrayList<>();
private static ArrayList<Joueur> joueurs = new ArrayList<>();

    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Fx");
         joueurs.add(joueur1);
        Joueur joueur2 = new Joueur("Malak");
        joueurs.add(joueur2);
        Ville ville1 = new Ville("Lyon");
        Ville ville2 = new Ville("Chenôve", "21300");

        String[] tabCouleurs = {"trefle", "pique", "carreau", "coeur"};



        for(String couleur : tabCouleurs) {
           Couleur creatCouleur = new Couleur(couleur);
           couleurs.add(creatCouleur);
        }
        System.out.println(Arrays.toString(tabCouleurs));

        for(Couleur couleur : couleurs) {
            for (int i = 2; i < 14; i++) {

                cartes.add(new Carte(i,couleur));
            }
        }
        Collections.shuffle(cartes);
        for(int i = 0; i< 5; i++){
            for(Joueur joueur: joueurs){
                Carte carteAuSommet = cartes.removeFirst();
                joueur.getMain().add(carteAuSommet);
            }
        }

        System.out.println(joueurs);

        System.out.println(cartes);
        joueur2.setVille(ville1);
        joueur1.setVille(ville2);

        ville2.getJoueurs().add(joueur1);
        ville1.getJoueurs().add(joueur2);
        System.out.println(ville1);
        System.out.println(ville2);

        System.out.println(joueur1);
        System.out.println(joueur2);
        System.out.println();
    }
}