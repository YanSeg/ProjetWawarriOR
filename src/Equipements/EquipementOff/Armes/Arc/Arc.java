package Equipements.EquipementOff.Armes.Arc;

import Equipements.EquipementOff.Armes.Armes;

public class Arc extends Armes {
    public Arc(String offensifType, int offensifStrenght, String offensifName) {
        super(offensifType, offensifStrenght, offensifName);
    }

    public Arc() {
    }

    public Arc(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    public Arc(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    public Arc(String offensifName, int offensifStrenght) {
        super(offensifName, offensifStrenght);
    }
}
