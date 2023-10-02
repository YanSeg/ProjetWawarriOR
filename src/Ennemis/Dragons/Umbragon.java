package Ennemis.Dragons;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Umbragon extends Dragon{





    public Umbragon() {
        super("Obscurité", "Umbragon le Sombre-Mystique", 20, 20, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.dragon4());

        String description =
                "Umbragon, l'incarnation des ombres, joue avec la peur de ses ennemis grâce à ses illusions terrifiantes. Son corps obscur le rend insaisissable.";
        setDescription(description);
    }

}
