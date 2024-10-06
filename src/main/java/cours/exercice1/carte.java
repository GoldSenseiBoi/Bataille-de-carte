package cours.exercice1;

import java.util.Arrays;

public class carte {
    private String couleur;
    private String valeur;  

    
    private static final String[] VALEURS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};

    
    public carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

   
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

   
    public int compareTo(carte autreCarte) {
        
        int positionThis = Arrays.asList(VALEURS).indexOf(this.valeur);
        int positionAutre = Arrays.asList(VALEURS).indexOf(autreCarte.valeur);
        
        
        return Integer.compare(positionThis, positionAutre);
    }

    
    @Override
    public String toString() {
        return "Carte{" + "couleur='" + couleur + '\'' + ", valeur='" + valeur + '\'' + '}';
    }
}
