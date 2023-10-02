package Equipements.EquipementOff.Armes;

import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

public abstract class Armes extends EquipementOffensif {




    @Override
    public String toString() {
        return super.toString();
    }
    public Armes(String type, String name, int strength) {
        super(type, name, strength);
    }
}
