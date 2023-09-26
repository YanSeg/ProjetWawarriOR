package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortTerreMurRoc extends Sorts {

    private final String REPRESENTATION = ASCII_Representations.earth3();



    public SortTerreMurRoc() {
        super("Terre", "Mur de Roc", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Un sort qui crée un mur de rochers massifs pour protéger le lanceur et son équipe des attaques ennemies.";
        setDescription(description);
    }
}
