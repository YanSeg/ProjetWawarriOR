package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortBasique extends Sorts {


    private final String REPRESENTATION = ASCII_Representations.earth5();
    public SortBasique() {
        super("Terre", "SortBasique", 10);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Un sort de base pour les personnes basiques.";
        setDescription(description);
    }


}
