package Ennemis.JeuFilm;

import Images.ASCII_Representations;

public class Kurbi extends SuperHero {
    public Kurbi() {
        super("Ennemis", "kurbi", 8, 7, "L'épée de Morpho Knight", "Eject Punch");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.kurbi());

        String description =
                "C'est une petite boule rose originaire de la planète Popstar et qui aspire ses ennemis pour « copier » leurs pouvoirs";
        setDescription(description);
    }

}

