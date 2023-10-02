package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Furie extends Gobelin {



    public Furie() {
        super("Gobelin", "Furie l'Écumante", 3, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mankrip2());

        String description =
                "Furie est une gobeline impitoyable qui manie un trident empoisonné. Ses écailles émettent un venin mortel";
        setDescription(description);
    }

}
