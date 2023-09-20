package PotionsPoisons.PotionsStandard;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionAttaqueDefense extends Potions {

    public PotionAttaqueDefense() {
        super("Potion de Attaque/Defense", 0, 0, 15, 15);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "15 pts d'attaque et de Force";
        setDescription(description);

    }
}
