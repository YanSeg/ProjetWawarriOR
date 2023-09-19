package Equipements.EquipementDef;

public abstract class EquipementDefensif {

    protected String defensifType;
    protected String defensifName;
    protected int defensifStrenght;

    public String getDefensifType() {
        return defensifType;
    }

    public void setDefensifType(String defensifType) {
        this.defensifType = defensifType;
    }

    public String getDefensifName() {
        return defensifName;
    }

    public void setDefensifName(String defensifName) {
        this.defensifName = defensifName;
    }

    public int getDefensifStrenght() {
        return defensifStrenght;
    }

    public void setDefensifStrenght(int defensifStrenght) {
        this.defensifStrenght = defensifStrenght;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    protected String image;

    public EquipementDefensif(String defensifType, String defensifName, int defensifStrenght) {
        this.defensifType = defensifType;
        this.defensifName = defensifName;
        this.defensifStrenght = defensifStrenght;
    }
}



