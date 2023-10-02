package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class SorciereXena extends Sorcier {

    public SorciereXena() {
        super("Ennemis", "Xena La Guerriere ", 8, 12, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.guerriere());
    }


}
