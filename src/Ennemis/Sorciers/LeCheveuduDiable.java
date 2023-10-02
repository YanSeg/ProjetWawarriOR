package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class LeCheveuduDiable extends Sorcier {

    public LeCheveuduDiable() {
        super("Ennemis", "L'Écorcheur de Chair", 5, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.scaryman());
    }


}
