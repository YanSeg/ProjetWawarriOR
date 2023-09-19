package Ennemi;

import Images.Choupi;

public class GodFather extends Ennemi{

    public GodFather() {
        super("Ennemi", "Le Parrain", 5, 10, "La Lupara", "La vendetta");
        Choupi image = new Choupi();
        setImage(image.thegod());
    }
}
