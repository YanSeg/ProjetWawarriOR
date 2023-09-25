package Ennemis.Sorciers;

import Images.ASCII_Representations;

public class LeSexyMan extends Sorcier {
    public LeSexyMan() {
        super("Ennemis", "Sexy Man", 5, 5, "Le Slip Des Ténèbres", "Le SIF des Ténèbres");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monsieurToutnu());
    }
}
