package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;


public class PotionDefensive extends Potions {


    public PotionDefensive() {
        super( "Potion de défense",15,15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts de force et vie";
        setDescription(description);

    }
}
