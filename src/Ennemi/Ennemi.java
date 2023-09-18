package Ennemi;

public abstract class Ennemi {


    private String type;

    public int getHealth() {
        return health;
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

    public String getDefensive() {
        return defensive;
    }

    private String name;
    private int health;
    private int strength;
    private String offensive;
    private String defensive;



    public Ennemi (String name, String type, int health, Integer strength, String offensive, String defensive) {

        this.name = name;
        this.type = type;
        this.name = "Ennemi";
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }



    public void setDefensive(String defensive) {
        this.defensive = defensive;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setOffensive(String offensive) {
        this.offensive = offensive;
    }

    public void setName(String name) {
        this.name = name;
    }





    public Ennemi() {

    }


    public Ennemi(String type) {
        this.type = type;
    }

    public Ennemi(String type, String name) {
        this.type = type;
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }

    public Integer gethealth() {
        return health;
    }


}


