package Equipements.EquipementDef.Boucliers;

import Equipements.EquipementDef.EquipementDefensif;

public abstract class Boucliers extends EquipementDefensif {

    public Boucliers(String defensifType, String defensifName, Integer defensifStrenght) {
        super("Bouclier", defensifName, defensifStrenght);
    }
}
