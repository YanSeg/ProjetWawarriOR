package Ennemis.Gobelin;

import Images.ASCII_Representations;

public class Vorax extends Gobelin {
    public Vorax() {
        super("Gobelin", "Vorax la Morsure", 3, 8, "Crocs acéré", " Peau écailleuse");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.manchauve());
        String description =
                "Vorax est un gobelin bestial avec des crocs tranchants comme des lames. Sa peau écailleuse le rend résistant.";
        setDescription(description);

    }
}
