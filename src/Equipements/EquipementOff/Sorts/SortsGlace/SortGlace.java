package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortGlace extends Sorts {


    public SortGlace() {
        super("Glace", "Prison de Cristal", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.ice3());
        String description = "Un sort puissant qui emprisonne l'ennemi dans une cage de cristal impénétrable, le laissant vulnérable aux attaques.";
        setDescription(description);
    }
}
