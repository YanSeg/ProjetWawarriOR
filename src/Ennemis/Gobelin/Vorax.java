package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Vorax extends Gobelin {
    public Vorax() {
        super("Gobelin", "Vorax la Morsure", 3, 8, "Crocs acéré", " Peau écailleuse");
        Choupi image = new Choupi();
        setImage(image.manchauve());
        String description =
                "Vorax est un gobelin bestial avec des crocs tranchants comme des lames. Sa peau écailleuse le rend résistant.";
        setDescription(description);

    }
}
