package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortElec extends Sorts {
    public SortElec() {
        super("Ombre","Furie Électrique", 0);
        Choupi image = new Choupi();
        setImage(image.eclair3());
        String description = "Une attaque électrique imprégnée d'ombre qui frappe l'ennemi avec une violence inouïe, déchaînant les forces obscures.";
        setDescription(description);
    }
}
