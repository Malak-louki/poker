package fr.hb.poker;
import fr.hb.poker.business.Joueur;
import fr.hb.poker.business.Ville;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Fx");
        Joueur joueur2 = new Joueur("Malak");
        Ville ville1 = new Ville("Lyon");
        Ville ville2 = new Ville("Chenôve", "21300");

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