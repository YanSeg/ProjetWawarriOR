package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class GouleGlouton extends Ennemi {


    public GouleGlouton() {
        super("Ennemis", "Le Goule Glouton", 5, 10, "La Griffe du Cauchemar", "Le Bouclier des Ombres");
        Choupi image = new Choupi();
        setImage(image.monstreflippanbt());
    }
}


