package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortTerreEruptionVolcanique extends Sorts {

    private final String REPRESENTATION = ASCII_Representations.earth3();
    public SortTerreEruptionVolcanique() {
        super("Terre", "Éruption Volcanique", 22);
        setImage(REPRESENTATION);
        String description = "Une éruption volcanique cataclysmique qui projette des roches en fusion et des flammes ardentes sur les ennemis.";
        setDescription(description);



    }
}
