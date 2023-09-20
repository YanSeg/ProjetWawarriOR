package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortTempete extends Sorts {
    public SortTempete() {
        super("Glace", "Tempête de Glace", 22);
        Choupi image = new Choupi();
        setImage(image.ice6());
        String description = "Une tempête de glace tourbillonnante qui congèle tout sur son passage, créant un paysage gelé.";
        setDescription(description);
    }
}
