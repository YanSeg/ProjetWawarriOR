package Ennemis.Dragons;

import Ennemis.Ennemi;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.Cases.Cases;

public abstract class Dragon extends Ennemi {
    private final String REPRESENTATION = ASCII_Representations.dragonCaseMessage();



    public Dragon() {
    }

    @Override
    public void interact(Personnage player) {

    }

    public Dragon(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }
}
//    public Dragon(String name) {
//        super("Dragon", nanme)
//
//            public Terramor() {
//            super("Terre", "Terramor le Terre-Briseur", 20, 20, "Manipulation des roches",  "Capacité à se fondre dans le sol");
//            ASCII_Representations image = new ASCII_Representations();
//            setImage(image.dragon1());
//
//            String description =
//                    "Terramor, géant de pierre, secoue la terre sous son passage. Il est presque indestructible grâce à son armure rocheuse et à sa capacité à disparaître dans le sol.";
//            setDescription(description);
//        }
//    }
//}

//    private String image;
//    private String type;
//    private String name;
//    private int health;
//    private int strength;
//    private String offensive;
//    private String description;
//
//    private String defensive;
//
//    @Override
//    public void interact(Personnage player) {
//        System.out.println(REPRESENTATION);
//
//
//    }
//    @Override
//    public String toString() {
//        return " " + image + "\n"
//                + name + "\n" + description + "\n" +
//                " | Vie: " + health + " | Force : " + strength + " | Attaque : " + offensive + " | Défense : " + defensive + "";
//    }
//
//
//
//
//    public Dragon(String type, String name, int health, int strength, String offensive, String defensive) {
//        this.type = type;
//        this.name = name;
//        this.health = health;
//        this.strength = strength;
//        this.offensive = offensive;
//        this.defensive = defensive;
//    }
//
//
//
//    public Dragon(String image) {
//        this.image = image;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public void setHealth(int health) {
//        this.health = health;
//    }
//
//    public int getStrength() {
//        return strength;
//    }
//
//    public void setStrength(int strength) {
//        this.strength = strength;
//    }
//
//    public String getOffensive() {
//        return offensive;
//    }
//
//    public void setOffensive(String offensive) {
//        this.offensive = offensive;
//    }
//
//    public String getDefensive() {
//        return defensive;
//    }
//
//    public void setDefensive(String defensive) {
//        this.defensive = defensive;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//
//
//    public Dragon(String type, String name, int health, int strength, String offensive, String defensive, String description) {
//        this.type = type;
//        this.name = name;
//        this.health = health;
//        this.strength = strength;
//        this.offensive = offensive;
//        this.defensive = defensive;
//        this.description = description;
//    }


