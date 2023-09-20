package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionForceVie extends Potions {

    public PotionForceVie() {
        super( "Potion de Force/Vie", 15,15,10,0);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "15 pts de force et de vie";
        setDescription(description);

    }
}
