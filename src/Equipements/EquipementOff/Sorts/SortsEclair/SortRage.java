package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortRage extends Sorts {


    public SortRage() {
        super("Ombre","Rage de l 'Ombre", 13);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.eclair2());
        String description = "Une décharge électrique d'ombre enragée qui détruit les ennemis avec une brutalité impitoyable.";
        setDescription(description);
    }

}


