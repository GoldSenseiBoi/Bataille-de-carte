package cours.exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bataille {
    private joueur joueur1;
    private joueur joueur2;
    private List<carte> paquetDeCartes;

    // Constructeur : Créer une nouvelle partie
    public bataille() {
        joueur1 = new joueur();
        joueur2 = new joueur();
        paquetDeCartes = new ArrayList<>();
        initialiserPaquet();  
        melangerPaquet();  
        distribuerCartes();  
    }

    // Créer un paquet de cartes avec les bonnes valeurs ("2", "3", ... "As")
    private void initialiserPaquet() {
        String[] couleurs = {"Coeur", "Carreau", "Trèfle", "Pique"};
        String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};

        for (String couleur : couleurs) {
            for (String valeur : valeurs) {
                paquetDeCartes.add(new carte(couleur, valeur));  // Créer une carte avec couleur et valeur
            }
        }
    }

    private void melangerPaquet() {
        Collections.shuffle(paquetDeCartes);  // Mélanger les cartes
    }

    private void distribuerCartes() {
        for (int i = 0; i < paquetDeCartes.size(); i++) {
            if (i % 2 == 0) {
                joueur1.ajouterCarte(paquetDeCartes.get(i));  // joueur 1 reçoit une carte
            } else {
                joueur2.ajouterCarte(paquetDeCartes.get(i));  // joueur 2 reçoit une carte
            }
        }
    }

    // Démarrer la partie
    public void jouer() {
        while (!joueur1.getCartes().isEmpty() && !joueur2.getCartes().isEmpty()) {
            carte carte1 = joueur1.tirerCarte();
            carte carte2 = joueur2.tirerCarte();
    
            // Vérifier si une des cartes est null (au cas où un joueur n'a plus de cartes)
            if (carte1 == null || carte2 == null) {
                break;
            }
    
            System.out.println("Joueur 1 tire: " + carte1 + " | Joueur 2 tire: " + carte2);
    
            // Comparaison des cartes tirées
            if (carte1.compareTo(carte2) > 0) {
                joueur1.ajouterPoints(1);  // Joueur 1 gagne ce tour
                System.out.println("Joueur 1 gagne ce tour.");
            } else if (carte1.compareTo(carte2) < 0) {
                joueur2.ajouterPoints(1);  // Joueur 2 gagne ce tour
                System.out.println("Joueur 2 gagne ce tour.");
            } else {
                System.out.println("Égalité ce tour !");
            }
    
            
            System.out.println("Score - Joueur 1: " + joueur1.getPoints() + " | Joueur 2: " + joueur2.getPoints());
        }
    
        
        if (joueur1.getPoints() > joueur2.getPoints()) {
            System.out.println("\n*** Joueur 1 a gagné la partie avec " + joueur1.getPoints() + " points! ***");
        } else if (joueur2.getPoints() > joueur1.getPoints()) {
            System.out.println("\n*** Joueur 2 a gagné la partie avec " + joueur2.getPoints() + " points! ***");
        } else {
            System.out.println("\n*** C'est une égalité ! ***");
        }
    }

    public static void main(String[] args) {
        bataille bataille = new bataille(); 
        bataille.jouer();  
    }
}