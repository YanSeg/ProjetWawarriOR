package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;


public class PotionDefensive extends Potions {

    public PotionDefensive() {
        super( "Potion de défense",0,0,0,15);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "15 pts de défense";
        setDescription(description);

    }
}
