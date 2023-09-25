package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;


public class PotionDefensive extends Potions {

    public PotionDefensive() {
        super( 0,"Potion de défense",0,15,0);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts de défense";
        setDescription(description);

    }
}
