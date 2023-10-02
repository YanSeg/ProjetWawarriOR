package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Sombra extends Gobelin {


    public Sombra() {
        super("Gobelin", "Sombra l'Ombre", 3, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.phantom());

        String description =
                "Sombra est un gobelin furtif qui utilise des dagues empoisonnées pour des attaques sournoises. Son manteau le rend invisible à volonté.";
        setDescription(description);
    }
}
