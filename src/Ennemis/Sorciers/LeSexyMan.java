package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class LeSexyMan extends Sorcier {
    public LeSexyMan() {
        super("Ennemis", "Sexy Man", 5, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monsieurToutnu());
    }


}
