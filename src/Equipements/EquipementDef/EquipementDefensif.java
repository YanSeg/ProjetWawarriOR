package Equipements.EquipementDef;

public abstract class EquipementDefensif {

    protected String defensifType;
    protected String defensifName;
    protected Integer defensifStrenght;

    public EquipementDefensif(String defensifType, String defensifName, Integer defensifStrenght) {
        this.defensifType = defensifType;
        this.defensifName = defensifName;
        this.defensifStrenght = defensifStrenght;
    }
}



