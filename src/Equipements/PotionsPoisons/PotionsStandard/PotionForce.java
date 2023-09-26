package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;


public class PotionForce extends Potions {


    public PotionForce() {
        super(15, "Potion de Force",15, 0, 0);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts de Force";
        setDescription(description);

    }
}
