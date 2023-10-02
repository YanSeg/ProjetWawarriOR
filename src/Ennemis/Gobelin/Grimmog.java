package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Grimmog extends Gobelin {


    public Grimmog() {
        super("Gobelin", "Le Troll Truculent", 3, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.monstercool());

        String description =
                "Grimmog est un gobelin brutal qui sème la destruction avec sa massue. Son plastron en os le protège des attaques frontales";
        setDescription(description);
    }
}
