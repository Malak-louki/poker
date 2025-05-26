package fr.hb.poker.business;

public class Joueur {
    private String prenom;
    private Ville ville;

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    private Joueur joueur;


    public Joueur(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "prenom='" + prenom + '\'' +
                "ville=" + (ville != null ? ville : "null") +
                '}';
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }
}
