package PotionsPoisons.GrandesPotions;

import Images.Choupi;
import PotionsPoisons.Potions;

public class Potionvitalite extends Potions {

    public Potionvitalite() {
        super("Grande Potion de Vitalité",30, 10, 10, 10);
        Choupi image = new Choupi();
        setimage(image.potion1());
        String description = "Une grande potion qui restaure considérablement les points de vie.";
        setDescription(description);
    }
}
