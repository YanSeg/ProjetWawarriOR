package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class GouleGlouton extends Sorcier {


    @Override
    public void interact(Personnage player) {

    }

    public GouleGlouton() {
        super("Ennemis", "Le Goule Glouton", 5, 10, "La Griffe du Cauchemar", "Le Bouclier des Ombres");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monstreflippanbt());
    }
}


