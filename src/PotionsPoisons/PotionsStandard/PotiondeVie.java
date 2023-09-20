package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotiondeVie extends Potions {

    public PotiondeVie() {
        super( "Potion de vie", 15,0,0,0);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "15 pts de vie";
        setDescription(description);

    }
}
