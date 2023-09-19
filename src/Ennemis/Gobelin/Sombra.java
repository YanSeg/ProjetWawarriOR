package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Sombra extends Ennemi {
    public Sombra() {
        super("Gobelin", "Sombra l'Ombre", 3, 5, "Dagues empoisonnées", "Manteau d'invisibilité");
        Choupi image = new Choupi();
        setImage(image.phantom());

        String description =
                "Sombra est un gobelin furtif qui utilise des dagues empoisonnées pour des attaques sournoises. Son manteau le rend invisible à volonté.";
        setDescription(description);
    }
}
