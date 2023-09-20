package PotionsPoisons.GrandesPotions;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionDuSage extends Potions {

    public PotionDuSage() {
        super(15, 8, 5, 15);
        Choupi image = new Choupi();
        setimage(image.potion12());
        String description = "Une grande potion qui restaure principalement le vie, mais aussi un peu de points de défence.";
        setDescription(description);
    }
}