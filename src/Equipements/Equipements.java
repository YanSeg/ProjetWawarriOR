package Equipements;

public abstract class Equipements {
    private String type;
    private int strength;
    private String name;
    private String image;
    private int health;
    private int defensive;
    private int offensive;
    private String description;

    @Override
    public String toString() {
        return " " + image + "\n"
                + name + "\n" + description + "\n" +
                " | Vie: " + health + " | Force : " + strength + " | Attaque : " + offensive + " | Défense : " + defensive + "";
    }

    public String getType() {
        return type;
    }

    public Equipements(int strength, String name, int health, int defensive, int offensive) {
        this.strength = strength;
        this.name = name;
        this.health = health;
        this.defensive = defensive;
        this.offensive = offensive;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }


    public Equipements(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefensive() {
        return defensive;
    }

    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }

    public int getOffensive() {
        return offensive;
    }

    public void setOffensive(int offensive) {
        this.offensive = offensive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public Equipements() {
    }
}
