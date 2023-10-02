package Ennemis.Dragons;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Aurorath extends Dragon {

    public Aurorath() {
        super("Glace", "Aurorath la Glace-Éternelle", 20, 20, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.dragon2());

        String description =
                "Aurorath, la créature de glace aux yeux perçants, peut plonger son environnement dans le froid absolu. Sa peau glacée la rend impénétrable aux assauts.";
        setDescription(description);
    }
}

