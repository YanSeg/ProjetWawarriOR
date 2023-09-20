package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortDrakoFeu extends Sorts {

    public SortDrakoFeu() {
        super("Feu", "Déflagration Infernale", 12);
        Choupi image = new Choupi();
        setImage(image.fire1());
        String description = "Un sort de feu élémentaire qui crée une boule de flammes ardentes, dévorant tout sur son passage.";
        setDescription(description);
    }
}
