package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class SpectreDeNuit extends Sorcier {


    public SpectreDeNuit() {
        super("Ennemis", "Le Spectre De lui même", 6, 6, "L'Épée de l'Âme Corrompue", "Le Gantelet de la Damnation");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.menbaton());


    }
}
