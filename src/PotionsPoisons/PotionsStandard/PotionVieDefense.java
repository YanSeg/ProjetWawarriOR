package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionVieDefense extends Potions {

    public PotionVieDefense() {
        super( "Potion de Vie/Defense", 0,10,10,0);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "10 pts de force et d'attaque";
        setDescription(description);

    }
}


