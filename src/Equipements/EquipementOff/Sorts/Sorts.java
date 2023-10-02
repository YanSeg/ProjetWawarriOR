package Equipements.EquipementOff.Sorts;

import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

public abstract class Sorts extends EquipementOffensif {
    public Sorts(String type, String name, int strength) {
        super(type, name, strength);
    }
}