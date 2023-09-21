package Equipements.EquipementOff;

import Equipements.Equipements;

public abstract class EquipementOffensif extends Equipements {

    private String type;
    private int strenght;
    private String name;
    private String image;
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public EquipementOffensif(String offensifType, int offensifStrenght, String offensifName) {
        this.type = offensifType;
        this.strenght = offensifStrenght;
        this.name = offensifName;
    }


    public EquipementOffensif() {
    }

    public EquipementOffensif(String offensifType, String offensifName, int offensifStrenght, String image) {
        this.type = offensifType;
        this.name = offensifName;
        this.strenght = offensifStrenght;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }


    protected EquipementOffensif(String offensifType, String offensifName, int offensifStrenght) {
        this.type = offensifType;
        this.name = offensifName;
        this.strenght = offensifStrenght;
    }


}

