package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class PotionVieDefense extends Potions {

    public PotionVieDefense() {
        super( 0, "Potion de Vie/Defense",10,10,0);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "10 pts de force et d'attaque";
        setDescription(description);

    }
}


