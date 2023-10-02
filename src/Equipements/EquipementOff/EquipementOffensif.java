package Equipements.EquipementOff;

import Equipements.Equipements;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

public abstract class EquipementOffensif extends Equipements {


    @Override
    public String toString() {
        return super.toString();
    }

    public EquipementOffensif(String type, String name, int strength) {
        super(type, name, strength);
    }




}

