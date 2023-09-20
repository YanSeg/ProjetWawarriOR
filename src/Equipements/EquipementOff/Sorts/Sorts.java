package Equipements.EquipementOff.Sorts;

import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.EquipementOffensif;

public abstract class Sorts extends Armes {
    public Sorts(String offensifType, int offensifStrenght, String offensifName) {
        super(offensifType, offensifStrenght, offensifName);
    }

    public Sorts() {
    }

    public Sorts(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    public Sorts(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }
}
