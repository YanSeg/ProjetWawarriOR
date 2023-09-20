package PotionsPoisons.GrandesPotions;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionEquilibreMagique extends Potions {

    public PotionEquilibreMagique() {
        super("Potion d'Équilibre Magique",15, 15, 15, 15);
        Choupi image = new Choupi();
        setimage(image.potion8());
        String description = "Une grande potion équilibrée.";
        setDescription(description);
    }

}
