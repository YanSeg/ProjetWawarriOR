package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Brulok extends Gobelin {

    public Brulok() {
        super("Gobelin", "Le Troll Truculent", 3, 5, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.magenoir());

        String description =
                " Brûlok est un gobelin pyromane qui manie une lance enflammée. Son bouclier ignifugé le protège des flammes";
        setDescription(description);
    }


}
