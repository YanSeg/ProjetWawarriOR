package Ennemi;

import Images.Choupi;

public class LinkLeMagnifique extends Ennemi{
    public LinkLeMagnifique() {
        super("Ennemi", "Link Le Magnifique", 11, 15, "L'épée de la triphorce", "Le bouclier d'Hylia");
        Choupi image = new Choupi();
        setImage(image.link());
    }
}
