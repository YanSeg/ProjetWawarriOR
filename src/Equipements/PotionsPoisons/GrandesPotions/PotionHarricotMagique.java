package Equipements.PotionsPoisons.GrandesPotions;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;

public class PotionHarricotMagique extends Potions {


    public PotionHarricotMagique() {
        super( "Grande Potion d'Harricot Magique", 25, 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.sangoku());
        String description = "Tortue géniale vous donne les pleins pouvoirs, une potion apricolante";
        setDescription(description);

    }
}
