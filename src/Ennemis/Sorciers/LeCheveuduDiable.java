package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class LeCheveuduDiable extends Sorcier {

    public LeCheveuduDiable() {
        super("Ennemis", "L'Écorcheur de Chair", 5, 5, "La Harpie Sanguinaire", "Le Masque de l'Éclipse");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.scaryman());
    }

    @Override
    public void interact(Personnage player) {

    }
}
