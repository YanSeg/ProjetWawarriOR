package Personnages;
import PlateuDeJeu.Cases.Cases;

import java.util.*;
//import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public abstract class Personnage {

    private String type;

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private String name;
    private int health;
    private int strength;
    private String offensive;
    private String defensive;

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public String getOffensive() {
        return offensive;
    }

    public String getDefensive() {
        return defensive;
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





    public Personnage (String name,String type, int health, Integer strength, String offensive, String defensive) {

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


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer gethealth() {
        return health;
    }

    public String toString(){

        return "Vous avez choisi un " + type + " qui s'appelle : " + capitalizeFirstLetter(name.toLowerCase()) +  "\n" +
                "| Force d'attaque : " + strength + " | Vie : " + health +  "\n" + "| Equipement-Offensif : " + offensive +
                " | Equipement-Defensif : " + defensive;
    }






    public  String capitalizeFirstLetter(String input) {
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






