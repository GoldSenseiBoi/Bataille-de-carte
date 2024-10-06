package cours.exercice1;

import java.util.ArrayList;
import java.util.List;

public class joueur {
    private List<carte> cartes;
    private int points;

    public joueur() {
        this.cartes = new ArrayList<>();
        this.points = 0;
    }

    public void ajouterCarte(carte carte) {
        cartes.add(carte);
    }

    public carte tirerCarte() {
        return cartes.isEmpty() ? null : cartes.remove(0);
    }

    public int getPoints() {
        return points;
    }

    public void ajouterPoints(int points) {
        this.points += points;
    }

    public List<carte> getCartes() {
        return cartes;
    }
}
