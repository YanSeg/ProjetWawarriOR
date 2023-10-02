package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class GouleGlouton extends Sorcier {




    public GouleGlouton() {
        super("Ennemis", "Le Goule Glouton", 5, 10, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monstreflippanbt());
    }
}


