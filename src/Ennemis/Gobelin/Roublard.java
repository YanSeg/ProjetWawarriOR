package Ennemis.Gobelin;

import Images.ASCII_Representations;

public class Roublard extends Gobelin {
    public Roublard() {
        super("Gobelin", "Roublard le Sournois", 3, 5, "Arc furtif", " Cape d'ombres");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.gogobelin());

        String description =
                "Roublard est un gobelin qui préfère attaquer à distance avec son arc furtif. Sa cape d'ombres le cache dans les ténèbres";
        setDescription(description);
    }
}
