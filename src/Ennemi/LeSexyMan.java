package Ennemi;

import Images.Choupi;

public class LeSexyMan extends Ennemi{
    public LeSexyMan() {
        super("Ennemi", "Sexy Man", 5, 5, "Le Slip Des Ténèbres", "Le SIF des Ténèbres");
        Choupi image = new Choupi();
        setImage(image.monsieurToutnu());
    }
}
