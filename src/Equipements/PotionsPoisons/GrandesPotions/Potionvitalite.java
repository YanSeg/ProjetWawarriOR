package Equipements.PotionsPoisons.GrandesPotions;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;

public class Potionvitalite extends Potions {

    public Potionvitalite() {
        super(5,"Grande Potion de Vitalité", 30, 10, 10);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "Une grande potion qui restaure considérablement la vie.";
        setDescription(description);
    }
}
