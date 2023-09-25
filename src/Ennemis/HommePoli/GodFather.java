package Ennemis.HommePoli;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class GodFather extends HommePo {

    @Override
    public void interact(Personnage player) {

    }

    public GodFather() {
        super("Ennemis", "Le Parrain", 5, 10, "La Lupara", "La vendetta");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.thegod());
    }
}
