package Ennemi;

import Images.Choupi;

public class WendigoSanguinaire extends Ennemi {

    public WendigoSanguinaire() {
        super("Ennemi", "Le Wendigo Sanguinaire", 6, 12, "Le Sceptre de l'Abysse", "L'Armure Infernale");
        Choupi image = new Choupi();
        setImage(image.monstreviolent());
    }
}
