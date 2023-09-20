package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortTerreEruptionVolcanique extends Sorts {
    public SortTerreEruptionVolcanique() {
        super("Terre", "Éruption Volcanique", 22);
        Choupi image = new Choupi();
        setImage(image.earth2());
        String description = "Une éruption volcanique cataclysmique qui projette des roches en fusion et des flammes ardentes sur les ennemis.";
        setDescription(description);
    }

}
