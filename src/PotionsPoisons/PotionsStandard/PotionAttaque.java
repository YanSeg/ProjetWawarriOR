package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;


public class PotionAttaque extends Potions {

    public PotionAttaque() {
        super("Potion d'attaque", 0, 0, 15, 0);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "15 pts d'attaque";
        setDescription(description);

    }
}


