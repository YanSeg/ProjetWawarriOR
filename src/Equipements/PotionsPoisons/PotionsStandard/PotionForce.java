package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;


public class PotionForce extends Potions {

    public PotionForce() {
        super(15, "Potion de Force",15, 0, 0);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "15 pts de Force";
        setDescription(description);

    }
}
