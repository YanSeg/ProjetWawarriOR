package PotionsPoisons.GrandesPotions;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionElixirPuissance extends Potions {

    public PotionElixirPuissance() {
        super("Élixir de Puissance",5, 25, 20, 10);
        Choupi image = new Choupi();
        setimage(image.potion6());
        String description = "Une grande potion qui restaure principalement la force, mais aussi les capacités offensives.";
        setDescription(description);
    }
}
