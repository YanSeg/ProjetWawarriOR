package PotionsPoisons.GrandesPotions;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionHarricotMagique extends Potions {
    public PotionHarricotMagique() {
        super( "Grande Potion d'Harricot Magique'", 15, 15, 15, 15);
        Choupi image = new Choupi();
        setimage(image.sangoku());
        String description = "Tortue géniale vous donne les pleins pouvoirs, une potion apricolante";
        setDescription(description);

    }
}
