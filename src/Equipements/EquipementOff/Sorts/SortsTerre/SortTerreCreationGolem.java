package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortTerreCreationGolem extends Sorts {

    private final String REPRESENTATION = ASCII_Representations.earth2();

    public SortTerreCreationGolem() {
        super("Terre", "Création de Golem", 22);

        setImage(REPRESENTATION);
        String description = "Un sort qui invoque un golem massif en terre pour combattre aux côtés du lanceur.";
        setDescription(description);
    }


}
