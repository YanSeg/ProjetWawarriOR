package Equipements.PotionsPoisons.GrandesPotions;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;

public class PotionRegain extends Potions {
    public PotionRegain() {
        super(5,"Potion de Regain Élémentaire", 15, 5, 25);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion10());
        String description = "Une grande potion qui augment principalement l'attaque, mais aussi un peu de points de vie.";
        setDescription(description);
    }

}
