package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortTerreCreationGolem extends Sorts {
    public SortTerreCreationGolem() {
        super("Terre", "Création de Golem", 22);
        Choupi image = new Choupi();
        setImage(image.earth3());
        String description = "Un sort qui invoque un golem massif en terre pour combattre aux côtés du lanceur.";
        setDescription(description);
    }

}
