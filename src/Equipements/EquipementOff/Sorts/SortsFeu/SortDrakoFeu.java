package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortDrakoFeu extends Sorts {



    public SortDrakoFeu() {
        super("Feu", "Déflagration Infernale", 12);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.fire1());
        String description = "Un sort de feu élémentaire qui crée une boule de flammes ardentes, dévorant tout sur son passage.";
        setDescription(description);
    }
}
