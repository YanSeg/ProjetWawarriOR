package Ennemi;

import Images.Choupi;

public class TrollTruculent extends Ennemi{

    public TrollTruculent() {
        super("Ennemi", "Le Troll Truculent", 3, 8, "Gourdin", "Os des cavernes");
        Choupi image = new Choupi();
        setImage(image.troll2());
    }
}