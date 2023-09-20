package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class SpectreDeNuit extends Sorcier {
    public SpectreDeNuit() {
        super("Ennemis", "Le Spectre De lui même", 6, 6, "L'Épée de l'Âme Corrompue", "Le Gantelet de la Damnation");
        Choupi image = new Choupi();
        setImage(image.menbaton());


    }
}
