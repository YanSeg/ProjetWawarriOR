package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Grimmog extends Gobelin {

    public Grimmog() {
        super("Gobelin", "Le Troll Truculent", 3, 5, "Massue à pointes", "Plastron en os");
        Choupi image = new Choupi();
        setImage(image.monstercool());

        String description =
                "Grimmog est un gobelin brutal qui sème la destruction avec sa massue. Son plastron en os le protège des attaques frontales";
        setDescription(description);
    }
}
