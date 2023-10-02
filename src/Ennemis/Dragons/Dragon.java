package Ennemis.Dragons;

import Ennemis.Ennemi;
import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.EquipementOffensif;
import Images.ASCII_Representations;
import Personnages.Guerriers.Guerrier;

public class Dragon extends Ennemi {
    private final String REPRESENTATION = ASCII_Representations.dragonCaseMessage();



    public Dragon(String type, String name, int health, int strength, EquipementDefensif weapon, EquipementOffensif shield) {
        super(type, name, health, strength, weapon, shield);
    }

    public Dragon() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
