package Equipements.EquipementOff.Armes.Massues;

import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Guerriers.Guerrier;
import Personnages.Personnage;

public abstract class Massue extends EquipementOffensif {
    public Massue(String type, String name, int strength) {
        super(type, name, strength);
    }
}
