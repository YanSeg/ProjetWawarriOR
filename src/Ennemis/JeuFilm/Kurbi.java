package Ennemis.JeuFilm;

import Ennemis.Ennemi;
import Images.Choupi;

public class Kurbi extends Ennemi {
    public Kurbi() {
        super("Ennemis", "kurbi", 8, 7, "L'épée de Morpho Knight", "Eject Punch");
        Choupi image = new Choupi();
        setImage(image.kurbi());

        String description =
                "C'est une petite boule rose originaire de la planète Popstar et qui aspire ses ennemis pour « copier » leurs pouvoirs";
        setDescription(description);
    }

}

