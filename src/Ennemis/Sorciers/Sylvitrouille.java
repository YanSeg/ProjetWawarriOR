package Ennemis.Sorciers;


import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Sylvitrouille extends Sorcier {


    public Sylvitrouille() {


        super("Ennemis", "Sylvitrouille", 5, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.citrouille());
    }

}
