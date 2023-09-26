package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class SorciereXena extends Sorcier {

    public SorciereXena() {
        super("Ennemis", "Xena La Guerriere ", 8, 12, "Le Chakram", "Le Bouclier d'Acier Éternel");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.guerriere());
    }


}
