package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class WendigoSanguinaire extends Ennemi {

    public WendigoSanguinaire() {
        super("Ennemis", "Le Wendigo Sanguinaire", 6, 12, "Le Sceptre de l'Abysse", "L'Armure Infernale");
        Choupi image = new Choupi();
        setImage(image.monstreviolent());
    }
}
