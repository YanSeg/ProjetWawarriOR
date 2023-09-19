package Equipements.EquipementOff;

public abstract class EquipementOffensif {

    protected String offensifType;
    protected int offensifStrenght;
    protected String offensifName;
    protected String image;


    public EquipementOffensif(String offensifType, int offensifStrenght, String offensifName) {
        this.offensifType = offensifType;
        this.offensifStrenght = offensifStrenght;
        this.offensifName = offensifName;
    }




    public EquipementOffensif() {
    }

    public EquipementOffensif(String offensifType, String offensifName, int offensifStrenght, String image) {
        this.offensifType = offensifType;
        this.offensifName = offensifName;
        this.offensifStrenght = offensifStrenght;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }




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


    protected EquipementOffensif(String offensifType, String offensifName, int offensifStrenght) {
        this.offensifType = offensifType;
        this.offensifName = offensifName;
        this.offensifStrenght = offensifStrenght;
    }


}

