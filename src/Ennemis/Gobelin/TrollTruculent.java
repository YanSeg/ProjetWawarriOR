package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class TrollTruculent extends Gobelin {

    public TrollTruculent() {
        super("Gobelin", "Le Troll Truculent", 3, 8, "Gourdin", "Os des cavernes");
        Choupi image = new Choupi();
        setImage(image.troll2());
    }
}