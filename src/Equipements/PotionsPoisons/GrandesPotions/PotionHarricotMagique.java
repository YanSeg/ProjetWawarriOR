package Equipements.PotionsPoisons.GrandesPotions;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;

public class PotionHarricotMagique extends Potions {
    public PotionHarricotMagique() {
        super( 25, "Grande Potion d'Harricot Magique", 25, 15, 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.sangoku());
        String description = "Tortue géniale vous donne les pleins pouvoirs, une potion apricolante";
        setDescription(description);

    }
}
