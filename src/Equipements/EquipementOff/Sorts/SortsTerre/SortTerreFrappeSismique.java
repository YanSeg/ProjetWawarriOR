package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;

public class SortTerreFrappeSismique extends Sorts {

    public SortTerreFrappeSismique() {
        super("Terre", "Frappe Sismique", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.earth5());
        String description = "Un sort de terre puissant qui provoque une frappe sismique, faisant trembler la terre sous les pieds des ennemis.";
        setDescription(description);
    }

}