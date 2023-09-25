package Equipements.PotionsPoisons.GrandesPotions;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;

public class PotionEquilibreMagique extends Potions {

    public PotionEquilibreMagique() {
        super(15,"Potion d'Équilibre Magique", 15, 15, 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion8());
        String description = "Une grande potion équilibrée.";
        setDescription(description);
    }

}