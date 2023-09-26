package Equipements;

import Personnages.Personnage;
import PlateuDeJeu.Cases.Cases;
import PlateuDeJeu.PlateauDuJeu;

public abstract class Equipements  implements Cases {
    protected String type;
    protected int strength;
    protected String name;
    protected String image;
    protected int health;
    protected int defensive;
    protected int offensive;
    protected String description;

    public String getType() {
        return type;
    }

    public abstract boolean isUsable(Personnage player);


    public Equipements(int strength, String name, int health, int defensive, int offensive) {
        this.strength = strength;
        this.name = name;
        this.health = health;
        this.defensive = defensive;
        this.offensive = offensive;
    }

    @Override
    public void interact(Personnage player, PlateauDuJeu plateauDuJeu) {

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

    @Override
    public String toString() {
        return "Equipements{" +
                "type='" + type + '\'' +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", health=" + health +
                ", defensive=" + defensive +
                ", offensive=" + offensive +
                ", description='" + description + '\'' +
                '}';
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
