package Equipements.EquipementDef;

import Equipements.Equipements;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;

public abstract class EquipementDefensif extends Equipements {

    @Override
    public String toString() {
        return super.toString();
    }

    public EquipementDefensif(String type, String name, int strength) {
        super(type, name, strength);
    }




}