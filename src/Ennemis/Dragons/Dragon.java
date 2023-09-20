package Ennemis.Dragons;

import Ennemis.Ennemi;

public abstract class Dragon extends Ennemi {
    private String image;
    private String type;
    private String name;
    private int health;
    private int strength;
    private String offensive;
    private String description;



    public Dragon(String type, String name, int health, int strength, String offensive, String defensive) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }



    public Dragon(String image) {
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getOffensive() {
        return offensive;
    }

    public void setOffensive(String offensive) {
        this.offensive = offensive;
    }

    public String getDefensive() {
        return defensive;
    }

    public void setDefensive(String defensive) {
        this.defensive = defensive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String defensive;

    public Dragon(String type, String name, int health, int strength, String offensive, String defensive, String description) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
        this.description = description;
    }



}