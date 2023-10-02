package Personnages;

import Equipements.Equipements;
import MiseEnPage.MiseEnPage;

//import org.apache.commons.lang3.StringUtils;


public abstract class Personnage {

    private int health;
    private int strength;

    @Override
    public String toString() {
        return
                "health=" + health +
                        ", strength=" + strength +
                        ", type='" + type + '\'' +
                        ", position=" + position +
                        ", equipementDef=" + equipementDef.getName() +
                        ", equipemenOf=" + equipemenOf.getName() +
                        ", name='" + name;
    }


    private String type;

    public Personnage(int health, int strength, String type, String name) {
        this.health = health;
        this.strength = strength;
        this.type = type;
        this.name = name;
    }

    private int position = 0;

    private Equipements equipementDef;

    private Equipements equipemenOf;

    private String name;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Equipements getEquipementDef() {
        return equipementDef;
    }

    public void setEquipementDef(Equipements equipementDef) {
        this.equipementDef = equipementDef;
    }

    public Equipements getEquipemenOf() {
        return equipemenOf;
    }

    public void setEquipemenOf(Equipements equipemenOf) {
        this.equipemenOf = equipemenOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String evolutionPartie() {
        MiseEnPage.space();
        return " Vous en êtes  à la positon " + position + "/n" + "| Force d'attaque : " + strength + " | Vie : " + health + "| Equipement-Offensif : " + equipemenOf.getName() +
                " | Equipement-Defensif : " + equipementDef.getName();

    }


    public String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Retourne la chaîne telle quelle si elle est nulle ou vide
        }
        char firstChar = Character.toUpperCase(input.charAt(0));
        return firstChar + input.substring(1);
    }


    public boolean isAlive(Personnage player) {
     return (player.getHealth()>0);
    }

}





