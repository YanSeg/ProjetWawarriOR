package Ennemis.JeuFilm;

import Images.ASCII_Representations;

public class LinkLeMagnifique extends SuperHero {
    public LinkLeMagnifique() {
        super("Ennemis", "Link Le Magnifique", 11, 15, "L'épée de la triphorce", "Le bouclier d'Hylia");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.link());

        String description =
                "C'est une petite boule rose originaire de la planète Popstar et qui aspire ses ennemis pour « copier » leurs pouvoirs";
        setDescription(description);
    }
}
