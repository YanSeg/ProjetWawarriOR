package Equipements.EquipementDef;

import Equipements.Equipements;

public abstract class EquipementDefensif extends Equipements {

    private String type;
    private int defensive;
    private String description;

    @Override
    public String toString() {
        return super.toString();
    }

    private String image;
    private int health;
    private String name;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getDefensive() {
        return defensive;
    }

    @Override
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public EquipementDefensif(int strength, String name, int health, int defensive, int offensive, String type, int defensive1, String name1) {
        super(strength, name, health, defensive, offensive);
        this.type = type;
        this.defensive = defensive1;
        this.name = name;
    }

    public EquipementDefensif(String name, String type, int defensive, String name1) {
        super(name);
        this.type = type;
        this.defensive = defensive;
        this.name = name1;
    }

    public EquipementDefensif(String type, int defensive, String name) {
        this.type = type;
        this.defensive = defensive;
        this.name = name;
    }
}



