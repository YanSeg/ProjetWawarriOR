package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortAvalanche extends Sorts {

    public SortAvalanche() {
        super("Glace", "Avalanche Dévastatrice", 22);
        Choupi image = new Choupi();
        setImage(image.ice2());
        String description = "Une avalanche dévastatrice de glace et de neige qui ensevelit tout sur son passage, créant un chaos total.";
        setDescription(description);
    }
}
