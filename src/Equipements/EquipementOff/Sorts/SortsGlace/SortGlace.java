package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortGlace extends Sorts {

    public SortGlace() {
        super("Glace", "Prison de Cristal", 22);
        Choupi image = new Choupi();
        setImage(image.ice3());
        String description = "Un sort puissant qui emprisonne l'ennemi dans une cage de cristal impénétrable, le laissant vulnérable aux attaques.";
        setDescription(description);
    }
}
