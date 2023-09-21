package Equipements.PotionsPoisons.GrandesPotions;

import Images.Choupi;
import Equipements.PotionsPoisons.Potions;

public class PotionElixirPuissance extends Potions {

    public PotionElixirPuissance() {
        super(15,"Élixir de Puissance", 25, 20, 10);
        Choupi image = new Choupi();
        setImage(image.potion6());
        String description = "Une grande potion qui restaure principalement la force, mais aussi les capacités offensives.";
        setDescription(description);
    }
}
