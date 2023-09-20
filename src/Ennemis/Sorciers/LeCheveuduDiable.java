package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class LeCheveuduDiable extends Sorcier {

    public LeCheveuduDiable() {
        super("Ennemis", "L'Écorcheur de Chair", 5, 5, "La Harpie Sanguinaire", "Le Masque de l'Éclipse");
        Choupi image = new Choupi();
        setImage(image.scaryman());
    }
}
