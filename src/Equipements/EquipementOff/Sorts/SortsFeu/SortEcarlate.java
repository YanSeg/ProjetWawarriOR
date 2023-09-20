package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortEcarlate extends Sorts {

    public SortEcarlate() {
        super("Feu", "Inferno Écarlate", 12);
        Choupi image = new Choupi();
        setImage(image.fire4());
        String description = "Une pluie d'inferno écarlate qui s'abat sur les adversaires, provoquant une incinération totale.";
        setDescription(description);
    }
}
