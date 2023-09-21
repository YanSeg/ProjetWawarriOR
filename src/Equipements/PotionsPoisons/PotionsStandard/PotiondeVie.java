package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class PotiondeVie extends Potions {

    public PotiondeVie() {
        super( 0,"Potion de vie",0,0,0);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "15 pts de vie";
        setDescription(description);

    }
}
