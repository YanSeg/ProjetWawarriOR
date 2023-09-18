package Equipements.EquipementOff;

public abstract class EquipementOffensif {
    public String getOffensifType() {
        return offensifType;
    }

    public void setOffensifType(String offensifType) {
        this.offensifType = offensifType;
    }

    public String getOffensifName() {
        return offensifName;
    }

    public void setOffensifName(String offensifName) {
        this.offensifName = offensifName;
    }

    public int getOffensifStrenght() {
        return offensifStrenght;
    }

    public void setOffensifStrenght(int offensifStrenght) {
        this.offensifStrenght = offensifStrenght;
    }

    protected String offensifType;
    protected String offensifName;
    protected int offensifStrenght;


    protected EquipementOffensif(String offensifType, String offensifName, int offensifStrenght) {
        this.offensifType = offensifType;
        this.offensifName = offensifName;
        this.offensifStrenght = offensifStrenght;
    }


}

