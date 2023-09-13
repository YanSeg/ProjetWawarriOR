package Equipements.equipementOff;

abstract class EquipementOffensif {

    protected String offensifType;
    protected String offensifName;
    protected Integer offensifStrenght;


    protected EquipementOffensif(String offensifType, String offensifName, Integer offensifStrenght) {
        this.offensifType = offensifType;
        this.offensifName = offensifName;
        this.offensifStrenght = offensifStrenght;
    }


}

