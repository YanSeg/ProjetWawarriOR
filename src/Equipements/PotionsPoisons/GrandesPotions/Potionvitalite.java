package Equipements.PotionsPoisons.GrandesPotions;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class Potionvitalite extends Potions {

    public Potionvitalite() {
        super(5,"Grande Potion de Vitalité", 30, 10, 10);
        Choupi image = new Choupi();
        setImage(image.potion1());
        String description = "Une grande potion qui restaure considérablement la vie.";
        setDescription(description);
    }
}
