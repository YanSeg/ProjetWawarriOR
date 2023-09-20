package Equipements.EquipementDef.Philtres;

import Equipements.EquipementDef.EquipementDefensif;

public abstract class Philtres extends EquipementDefensif {


    public Philtres(String defensifType, String defensifName, int defensifStrenght) {
        super(defensifType, defensifName, defensifStrenght);
    }

    public Philtres(String defensifType, String defensifName, Integer defensifStrenght) {
        super("Philtre", defensifName, defensifStrenght);
    }
}
