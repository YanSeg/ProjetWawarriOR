package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class WendigoSanguinaire extends Sorcier {



    public WendigoSanguinaire() {
        super("Ennemis", "Le Wendigo Sanguinaire", 6, 12, "Le Sceptre de l'Abysse", "L'Armure Infernale");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monstreviolent());
    }
}
