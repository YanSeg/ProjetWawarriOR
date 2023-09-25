package Ennemis.Gobelin;

import Images.ASCII_Representations;

public class Sombra extends Gobelin {
    public Sombra() {
        super("Gobelin", "Sombra l'Ombre", 3, 5, "Dagues empoisonnées", "Manteau d'invisibilité");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.phantom());

        String description =
                "Sombra est un gobelin furtif qui utilise des dagues empoisonnées pour des attaques sournoises. Son manteau le rend invisible à volonté.";
        setDescription(description);
    }
}
