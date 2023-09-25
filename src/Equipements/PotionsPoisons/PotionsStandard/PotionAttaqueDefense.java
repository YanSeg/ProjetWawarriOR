package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;

public class PotionAttaqueDefense extends Potions {

    public PotionAttaqueDefense() {
        super(15, "Potion de Attaque/Defense", 0, 0, 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts d'attaque et de Force";
        setDescription(description);

    }
}
