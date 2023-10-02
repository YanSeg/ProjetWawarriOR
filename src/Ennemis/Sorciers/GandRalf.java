package Ennemis.Sorciers;

import Images.ASCII_Representations;
import PlateuDeJeu.EquipementFactory;

public class GandRalf extends Sorcier {


    public GandRalf() {
        super("Ennemis", "Le Goule Glouton", 5, 10, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.morty());
    }
}
