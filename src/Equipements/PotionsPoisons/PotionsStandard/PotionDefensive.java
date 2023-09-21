package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;


public class PotionDefensive extends Potions {

    public PotionDefensive() {
        super( 0,"Potion de défense",0,15,0);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "15 pts de défense";
        setDescription(description);

    }
}
