package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortElec extends Sorts {
    public SortElec() {
        super("Ombre","Furie Électrique", 23);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.eclair3());
        String description = "Une attaque électrique imprégnée d'ombre qui frappe l'ennemi avec une violence inouïe, déchaînant les forces obscures.";
        setDescription(description);
    }


}
