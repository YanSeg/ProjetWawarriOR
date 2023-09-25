package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;


public class PotionAttaque extends Potions {

    @Override
    public void interact(Personnage player) {

    }

    public PotionAttaque() {


        super(0, "Potion d'attaque", 0,0, 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts d'attaque";
        setDescription(description);

    }
}


