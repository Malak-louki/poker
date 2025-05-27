package fr.hb.poker.business;
import java.util.ArrayList;
import java.util.List;
public class Joueur {
    private String prenom;
    private Ville ville;
    private ArrayList<Carte> main = new ArrayList<>();


    public Joueur(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }


    public ArrayList<Carte> getMain() {
        return main;
    }

    public void setMain(ArrayList<Carte> main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "prenom='" + prenom + '\'' +
                ", ville=" + (ville!=null?ville.getNom():"null") +
                ", main=" + main +
                '}';
    }
}
