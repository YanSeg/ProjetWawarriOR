package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionForceAttaque extends Potions {

    public PotionForceAttaque() {
        super( "Potion de Force/Attaque", 0,10,10,0);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "10 pts de force et d'attaque";
        setDescription(description);

    }
}
