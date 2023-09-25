package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;

public class PotionForceAttaque extends Potions {

    public PotionForceAttaque() {
        super( 10, "Potion de Force/Attaque",10,10,0);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "10 pts de force et d'attaque";
        setDescription(description);

    }
}
