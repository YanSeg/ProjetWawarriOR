package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class TrollTruculent extends Gobelin {



    public TrollTruculent() {
        super("Gobelin", "Le Troll Truculent", 3, 8, "Gourdin", "Os des cavernes");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.troll2());
    }
}