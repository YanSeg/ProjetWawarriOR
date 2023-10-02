package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class TrollTruculent extends Gobelin {



    public TrollTruculent() {
        super("Gobelin", "Le Troll Truculent", 3, 8, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.troll2());
    }
}