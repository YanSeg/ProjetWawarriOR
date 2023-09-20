package PotionsPoisons;

public abstract class Potions {

    public Potions(String potionName, int potionhealth, int potionstrength, int potionoffensive, int potiondefensive) {
        this.potionName = potionName;
        this.potionhealth = potionhealth;
        this.potionstrength = potionstrength;
        this.potionoffensive = potionoffensive;
        this.potiondefensive = potiondefensive;
    }

    private String potionName;
    private int potionhealth;
    private int potionstrength;

    public int getPotionoffensive() {
        return potionoffensive;
    }

    public int getPotiondefensive() {
        return potiondefensive;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String description;

    public String getPotionName() {
        return potionName;
    }

    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }

    public int getPotionhealth() {
        return potionhealth;
    }

    public void setPotionhealth(int potionhealth) {
        this.potionhealth = potionhealth;
    }

    public int getPotionstrength() {
        return potionstrength;
    }

    public void setPotionstrength(int potionstrength) {
        this.potionstrength = potionstrength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getimage() {
        return image;
    }

    public void setimage(String potionimage) {
        this.image = potionimage;
    }

    private int potionoffensive;
    private int potiondefensive;
    private String image;

    public Potions() {
    }



    public Potions(int potionhealth, int potionstrength, int potionoffensive, int potiondefensive) {
        this.potionhealth = potionhealth;
        this.potionstrength = potionstrength;
        this.potionoffensive = potionoffensive;
        this.potiondefensive = potiondefensive;
    }

    public void setPotionoffensive(int potionoffensive) {
        this.potionoffensive = potionoffensive;
    }



    public void setPotiondefensive(int potiondefensive) {
        this.potiondefensive = potiondefensive;
    }

    public Potions(int potionhealth) {
        this.potionhealth = potionhealth;
    }

    public Potions(int potionhealth, int potionstrength) {
        this.potionhealth = potionhealth;
        this.potionstrength = potionstrength;
    }
}
