package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortRage extends Sorts {

    public SortRage() {
        super("Ombre","Rage de l 'Ombre", 13);
        Choupi image = new Choupi();
        setImage(image.eclair2());
        String description = "Une décharge électrique d'ombre enragée qui détruit les ennemis avec une brutalité impitoyable.";
        setDescription(description);
    }

}


