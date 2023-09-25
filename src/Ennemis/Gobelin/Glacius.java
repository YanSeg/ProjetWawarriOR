package Ennemis.Gobelin;

import Images.ASCII_Representations;

public class Glacius extends Gobelin {
    public Glacius() {
        super("Gobelin", "Le Troll Truculent", 3, 5, "Sceptre de glace", "Armure de givre");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monstergentil());

        String description =
                "Glacius est un gobelin maître de la glace qui utilise son sceptre pour geler ses ennemis. Son armure de givre résiste au froid";
        setDescription(description);
    }

}
