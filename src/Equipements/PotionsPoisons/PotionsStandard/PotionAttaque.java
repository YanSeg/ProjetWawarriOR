package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;


public class PotionAttaque extends Potions {

    public PotionAttaque() {


        super(0, "Potion d'attaque", 0,0, 15);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "15 pts d'attaque";
        setDescription(description);

    }
}


