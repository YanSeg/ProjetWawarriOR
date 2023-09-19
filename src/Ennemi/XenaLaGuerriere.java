package Ennemi;

import Images.Choupi;

public class XenaLaGuerriere extends Ennemi{

    public XenaLaGuerriere() {
        super("Ennemi", "Xena La Guerriere ", 8, 12, "Le Chakram", "Le Bouclier d'Acier Éternel");
        Choupi image = new Choupi();
        setImage(image.guerriere());
    }
}
