package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;

public class SortTerreCreationGolem extends Sorts {
    public SortTerreCreationGolem() {
        super("Terre", "Création de Golem", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.earth3());
        String description = "Un sort qui invoque un golem massif en terre pour combattre aux côtés du lanceur.";
        setDescription(description);
    }

}
