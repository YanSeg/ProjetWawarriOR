package Ennemis.HommePoli;

import Ennemis.Ennemi;
import Images.Choupi;

public class GodFather extends Ennemi {

    public GodFather() {
        super("Ennemis", "Le Parrain", 5, 10, "La Lupara", "La vendetta");
        Choupi image = new Choupi();
        setImage(image.thegod());
    }
}
