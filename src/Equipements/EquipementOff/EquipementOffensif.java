package Equipements.EquipementOff;

import Equipements.Equipements;
import Personnages.Personnage;

public abstract class EquipementOffensif extends Equipements {
    private String description;



    protected String type;
    protected int strenght;
    protected String name;
    protected String image;

    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "type='" + type + '\'' +
                ", strenght=" + strenght +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean isUsable(Personnage player) {
        return false;
    }








    public EquipementOffensif() {
    }
    protected EquipementOffensif(String offensifType, String offensifName, int offensifStrenght) {
        this.type = offensifType;
        this.name = offensifName;
        this.strenght = offensifStrenght;
    }
    public EquipementOffensif(String offensifType, String offensifName, int offensifStrenght, String image) {
        this.type = offensifType;
        this.name = offensifName;
        this.strenght = offensifStrenght;
        this.image = image;
    }

    public EquipementOffensif(String offensifType, int offensifStrenght, String offensifName) {
        this.type = offensifType;
        this.strenght = offensifStrenght;
        this.name = offensifName;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }








}

