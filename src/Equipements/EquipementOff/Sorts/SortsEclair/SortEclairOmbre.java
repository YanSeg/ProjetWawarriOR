package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortEclairOmbre extends Sorts {

    public SortEclairOmbre() {
        super("Ombre","Éclair d'Ombre", 15);
        Choupi image = new Choupi();
        setImage(image.eclair1());
        String description = "Un sort sombre qui libère un éclair d'ombre dévastateur, engloutissant l'ennemi dans les ténèbres.";
        setDescription(description);
    }

}

