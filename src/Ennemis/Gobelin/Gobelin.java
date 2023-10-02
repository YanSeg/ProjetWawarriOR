package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Personnage;

public class Gobelin extends Ennemi {
    public Gobelin() {
    }


    public Gobelin(String type, String name, int health, int strength, EquipementDefensif weapon, EquipementOffensif shield) {
        super(type, name, health, strength, weapon, shield);
    }
}
