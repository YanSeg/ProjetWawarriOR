package Equipements.EquipementOff.Sorts;

import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

public abstract class Sorts extends EquipementOffensif {

    public Sorts() {
    }

    public Sorts(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    public Sorts(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    @Override
    public boolean isUsable(Personnage player) {
        return player instanceof Magicien;
    }

    @Override
    public void interact(Personnage player) {

    }
}
