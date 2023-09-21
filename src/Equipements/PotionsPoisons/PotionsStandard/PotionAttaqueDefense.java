package Equipements.PotionsPoisons.PotionsStandard;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class PotionAttaqueDefense extends Potions {

    public PotionAttaqueDefense() {
        super(15, "Potion de Attaque/Defense", 0, 0, 15);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "15 pts d'attaque et de Force";
        setDescription(description);

    }
}
