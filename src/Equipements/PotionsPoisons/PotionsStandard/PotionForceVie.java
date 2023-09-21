package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class PotionForceVie extends Potions {

    public PotionForceVie() {
        super( 15, "Potion de Force/Vie",15,10,0);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "15 pts de force et de vie";
        setDescription(description);

    }
}
