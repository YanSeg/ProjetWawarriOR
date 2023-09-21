package Equipements.PotionsPoisons.GrandesPotions;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class PotionEquilibreMagique extends Potions {

    public PotionEquilibreMagique() {
        super(15,"Potion d'Équilibre Magique", 15, 15, 15);
        Choupi image = new Choupi();
        setImage(image.potion8());
        String description = "Une grande potion équilibrée.";
        setDescription(description);
    }

}
