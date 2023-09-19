package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Glacius extends Ennemi {
    public Glacius() {
        super("Gobelin", "Le Troll Truculent", 3, 5, "Sceptre de glace", "Armure de givre");
        Choupi image = new Choupi();
        setImage(image.monstergentil());

        String description =
                "Glacius est un gobelin maître de la glace qui utilise son sceptre pour geler ses ennemis. Son armure de givre résiste au froid";
        setDescription(description);
    }

}
