package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortTerreFrappeSismique extends Sorts {

    private final String REPRESENTATION = ASCII_Representations.earth5();


    public SortTerreFrappeSismique() {
        super("Terre", "Frappe Sismique", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Un sort de terre puissant qui provoque une frappe sismique, faisant trembler la terre sous les pieds des ennemis.";
        setDescription(description);
    }

}