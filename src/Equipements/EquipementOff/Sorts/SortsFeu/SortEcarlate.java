package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortEcarlate extends Sorts {


    public SortEcarlate() {
        super("Feu", "Inferno Écarlate", 12);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.fire4());
        String description = "Une pluie d'inferno écarlate qui s'abat sur les adversaires, provoquant une incinération totale.";
        setDescription(description);
    }
}
