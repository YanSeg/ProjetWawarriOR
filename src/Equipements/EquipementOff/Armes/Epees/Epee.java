package Equipements.EquipementOff.Armes.Epees;

import Equipements.EquipementOff.Armes.Armes;

public class Epee extends Armes {
    public Epee(String offensifType, int offensifStrenght, String offensifName) {
        super(offensifType, offensifStrenght, offensifName);
    }

    public Epee() {
    }

    public Epee(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    public Epee(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    public Epee(String offensifName, int offensifStrenght) {
        super(offensifName, offensifStrenght);
    }


}
