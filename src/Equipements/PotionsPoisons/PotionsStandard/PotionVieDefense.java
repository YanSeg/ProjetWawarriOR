package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;

public class PotionVieDefense extends Potions {


    public PotionVieDefense() {
        super("Potion de Vie/Defense", 10, 10);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "10 pts de force et d'attaque";
        setDescription(description);

    }
}


