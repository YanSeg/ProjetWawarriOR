package PotionsPoisons.GrandesPotions;

import Images.Choupi;
import PotionsPoisons.Potions;

public class PotionRegain extends Potions {
    public PotionRegain() {
        super("Potion de Regain Élémentaire",15, 10, 25, 10);
        Choupi image = new Choupi();
        setimage(image.potion10());
        String description = "Une grande potion qui restaure principalement l'attaque', mais aussi un peu de points de vie.";
        setDescription(description);
    }

}
