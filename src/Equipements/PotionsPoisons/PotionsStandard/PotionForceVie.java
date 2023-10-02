package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;

public class PotionForceVie extends Potions {



    public PotionForceVie() {
        super( "Potion de Force/Vie",15,10);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts de force et de vie";
        setDescription(description);

    }
}
