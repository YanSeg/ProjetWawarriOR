package Equipements.EquipementOff.Armes;

import Equipements.EquipementOff.EquipementOffensif;

public abstract class Armes extends EquipementOffensif {
    public Armes(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    public Armes() {
    }

    public Armes(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    @Override
    public String toString() {
        return "Armes{}";
    }
}
