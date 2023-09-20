package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class LeSexyMan extends Sorcier {
    public LeSexyMan() {
        super("Ennemis", "Sexy Man", 5, 5, "Le Slip Des Ténèbres", "Le SIF des Ténèbres");
        Choupi image = new Choupi();
        setImage(image.monsieurToutnu());
    }
}
