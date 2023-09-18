package Equipements.EquipementOff;

public abstract class EquipementOffensif {

    protected String offensifType;
    protected String offensifName;
    protected int offensifStrenght;


    protected EquipementOffensif(String offensifType, String offensifName, int offensifStrenght) {
        this.offensifType = offensifType;
        this.offensifName = offensifName;
        this.offensifStrenght = offensifStrenght;
    }


}

