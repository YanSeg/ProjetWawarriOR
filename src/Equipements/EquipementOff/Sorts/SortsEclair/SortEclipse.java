package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortEclipse extends Sorts {

    public SortEclipse() {
        super("Ombre","Courroux de l'Éclipse", 15);
        Choupi image = new Choupi();
        setImage(image.eclair4());
        String description = "Une manifestation du courroux de l'obscurité, libérant un éclair noir qui engloutit tout sur son passage.";
        setDescription(description);
    }
}
