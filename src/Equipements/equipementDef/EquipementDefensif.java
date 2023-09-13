package Equipements.equipementDef;

public abstract class EquipementDefensif {

    protected String defensifType;
    protected String defensifName;
    protected Integer defensifStrenght;

    protected EquipementDefensif(String defensifType, String defensifName, Integer defensifStrenght) {
        this.defensifType = defensifType;
        this.defensifName = defensifName;
        this.defensifStrenght = defensifStrenght;
    }
}



