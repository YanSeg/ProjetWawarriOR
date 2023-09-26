package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortBrasier extends Sorts {



    public SortBrasier() {
        super("Feu", "Brasier Infernal", 12);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.fire2());
        String description = "Une déflagration de feu infernal qui engloutit la zone, laissant des cendres fumantes.";
        setDescription(description);
    }
}
