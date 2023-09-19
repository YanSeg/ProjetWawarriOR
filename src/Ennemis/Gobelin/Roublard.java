package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Roublard extends Ennemi {
    public Roublard() {
        super("Gobelin", "Roublard le Sournois", 3, 5, "Arc furtif", " Cape d'ombres");
        Choupi image = new Choupi();
        setImage(image.gogobelin());

        String description =
                "Roublard est un gobelin qui préfère attaquer à distance avec son arc furtif. Sa cape d'ombres le cache dans les ténèbres";
        setDescription(description);
    }
}
