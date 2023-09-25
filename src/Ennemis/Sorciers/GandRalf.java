package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class GandRalf extends Sorcier {
    @Override
    public void interact(Personnage player) {

    }

    public GandRalf() {
        super("Ennemis", "Le Goule Glouton", 5, 10, "La Griffe du Cauchemar", "Le Bouclier des Ombres");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.morty());
    }
}
