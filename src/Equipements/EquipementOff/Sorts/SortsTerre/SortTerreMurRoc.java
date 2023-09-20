package Equipements.EquipementOff.Sorts.SortsTerre;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortTerreMurRoc extends Sorts {
    public SortTerreMurRoc() {
        super("Terre", "Mur de Roc", 22);
        Choupi image = new Choupi();
        setImage(image.earth1());
        String description = "Un sort qui crée un mur de rochers massifs pour protéger le lanceur et son équipe des attaques ennemies.";
        setDescription(description);
    }
}
