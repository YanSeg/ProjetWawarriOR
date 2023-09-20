package Equipements.EquipementOff.Armes;

import Equipements.EquipementOff.EquipementOffensif;

public abstract class Armes extends EquipementOffensif {


    public Armes(String offensifType, int offensifStrenght, String offensifName) {
        super(offensifType, offensifStrenght, offensifName);
    }

    public Armes() {
    }

    public Armes(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    public Armes(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    public Armes(String offensifName, int offensifStrenght) {
        super("Arme", offensifName, offensifStrenght);
    }
}
