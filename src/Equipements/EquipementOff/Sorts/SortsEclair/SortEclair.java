package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortEclair extends Sorts {


    public SortEclair() {
        super("Ombre","Éclair d'Ombre", 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.eclair1());
        String description = "Un sort sombre qui libère un éclair d'ombre dévastateur, engloutissant l'ennemi dans les ténèbres.";
        setDescription(description);
    }

}

