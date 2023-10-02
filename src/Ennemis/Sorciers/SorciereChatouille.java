package Ennemis.Sorciers;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class SorciereChatouille extends Sorcier {

    public SorciereChatouille() {
        super("Ennemis", "La Sorcière à Chatouille", 5, 6, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.girl2());
    }


}