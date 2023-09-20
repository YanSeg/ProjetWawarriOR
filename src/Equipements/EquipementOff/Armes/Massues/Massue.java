package Equipements.EquipementOff.Armes.Massues;

import Equipements.EquipementOff.Armes.Armes;

public abstract class Massue extends Armes {
    public Massue(String offensifType, int offensifStrenght, String offensifName) {
        super(offensifType, offensifStrenght, offensifName);
    }

    public Massue() {
    }

    public Massue(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    public Massue(String offensifName, int offensifStrenght) {
        super(offensifName, offensifStrenght);
    }
}
