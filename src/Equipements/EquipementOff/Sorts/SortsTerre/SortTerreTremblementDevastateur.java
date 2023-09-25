package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;

public class SortTerreTremblementDevastateur extends Sorts {
    public SortTerreTremblementDevastateur() {
        super("Terre", "Tremblement de Terre Dévastateur", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.earth4());
        String description = "Un sort terrifiant qui provoque un tremblement de terre dévastateur, renversant les ennemis et causant des dégâts massifs.";
        setDescription(description);
    }

}

