package Equipements.EquipementDef;

import Equipements.Equipements;

public abstract class EquipementDefensif extends Equipements {

    private String type;
    private int defensive;
    private String description;
    private String image;
    private int health;


    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }


    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getDefensive() {
        return defensive;
    }

}



