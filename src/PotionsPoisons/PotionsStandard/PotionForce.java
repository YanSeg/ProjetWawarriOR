package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;


public class PotionForce extends Potions {

    public PotionForce() {
        super("Potion de Force", 0, 15, 0, 0);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "15 pts de Force";
        setDescription(description);

    }
}
