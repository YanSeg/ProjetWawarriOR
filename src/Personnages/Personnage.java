package Personnages;

import Equipements.Equipements;
import MiseEnPage.MiseEnPage;
import PlateuDeJeu.Cases.Cases;

import java.util.*;
//import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public abstract class Personnage {


    private String name;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    private int health;
    private int strength;

    private String type;
    private int position = 0;

    private String offensive;
    private String defensive;


    @Override
    public String toString() {

        return "Vous êtes un " + getClass().getSimpleName() + " nommé : " + name + "\n" +
                "| Force d'attaque : " + strength + " | Vie : " + health + "| Equipement-Offensif : " + offensive +
                " | Equipement-Defensif : " + defensive;

    }

    public Personnage(String name, int health, int strength, String offensive, String defensive) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }

    // Attributs


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public Personnage(String type, String name, int health, int strength, String offensive, String defensive) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }


    // Constructeurs


    // Methodes
//    public abstract void useObject(Equipements equipements);




    public Personnage(String name, String type, int health, Integer strength, String offensive, String defensive) {
        this.name = name;
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }

    public Personnage() {

    }

    public Personnage(String type) {
        this.type = type;
    }

    public Personnage(String type, String name) {
        this.type = type;
        this.name = name;
    }


    public String evolutionPartie() {
        MiseEnPage.space();
        return " Vous en êtes  à la positon " + position  +  "/n" + "| Force d'attaque : " + strength + " | Vie : " + health + "| Equipement-Offensif : " + offensive +
                " | Equipement-Defensif : " + defensive;

    }


    public String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Retourne la chaîne telle quelle si elle est nulle ou vide
        }
        char firstChar = Character.toUpperCase(input.charAt(0));
        return firstChar + input.substring(1);
    }


//
//
//    String input = "bonjour";
//    String capitalized = capitalizeFirstLetter(input);
//System.out.println(capitalized); // Cela affichera "Bonjour"


}






