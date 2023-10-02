package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Zigzag extends Gobelin {



    public Zigzag() {
        super("Gobelin", "Zigzag l'Éclair", 3, 8, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monsterblup());
        String description =
                "Zigzag est un gobelin espiègle qui lance des éclairs avec sa baguette. Sa cape électrique le protège des attaques.";
        setDescription(description);

    }
}
