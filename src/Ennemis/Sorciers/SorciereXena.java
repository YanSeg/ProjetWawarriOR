package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class SorciereXena extends Ennemi {

    public SorciereXena() {
        super("Ennemis", "Xena La Guerriere ", 8, 12, "Le Chakram", "Le Bouclier d'Acier Éternel");
        Choupi image = new Choupi();
        setImage(image.guerriere());
    }
}
