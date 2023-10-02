package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class SpectreDeNuit extends Sorcier {


    public SpectreDeNuit() {
        super("Ennemis", "Le Spectre De lui même", 6, 6, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.menbaton());


    }
}
