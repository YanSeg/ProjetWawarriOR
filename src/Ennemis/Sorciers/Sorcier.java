package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.EquipementOffensif;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

public abstract class Sorcier extends Ennemi {


    public Sorcier(String type, String name, int health, int strength, EquipementDefensif weapon, EquipementOffensif shield) {
        super(type, name, health, strength, weapon, shield);
    }

    public Sorcier() {
        super();
    }
}
