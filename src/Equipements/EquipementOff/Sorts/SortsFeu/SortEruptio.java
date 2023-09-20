package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortEruptio extends Sorts {

    public SortEruptio() {
        super("Feu", "Éruption Infernale", 22);
        Choupi image = new Choupi();
        setImage(image.fire5());
        String description = "Une déferlante de flammes magiques qui engloutit tout sur son passage, laissant la destruction dans son sillage.";
        setDescription(description);
    }
}
