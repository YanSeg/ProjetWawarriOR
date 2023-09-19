package Ennemi;

import Images.Choupi;

public class Kurbi extends Ennemi {
    public Kurbi() {
        super("Ennemi", "kurbi", 8, 7, "L'épée de Morpho Knight", "Eject Punch");
        Choupi image = new Choupi();
        setImage(image.kurbi());
    }
}

