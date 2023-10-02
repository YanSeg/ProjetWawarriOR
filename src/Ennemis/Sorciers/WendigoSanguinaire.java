package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class WendigoSanguinaire extends Sorcier {



    public WendigoSanguinaire() {
        super("Ennemis", "Le Wendigo Sanguinaire", 6, 12, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monstreviolent());
    }
}
