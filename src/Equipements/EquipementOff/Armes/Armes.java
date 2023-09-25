package Equipements.EquipementOff.Armes;

import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

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
        return "Armes{" +
                "type='" + type + '\'' +
                ", strenght=" + strenght +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
    @Override
    public boolean isUsable(Personnage player) {
        return player instanceof Guerrier;
    }


}
