package Ennemis;

import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.EquipementOffensif;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.Cases;
import Menu.MenuJeu;

import java.awt.*;


public abstract class Ennemi implements Cases {
    private final String REPRESENTATION = ASCII_Representations.messageEnnemi();

    @Override
    public String interact(Personnage player) {
        System.out.println(REPRESENTATION);
        System.out.println(player);
        MenuJeu menufight = new MenuJeu();
        menufight.presentationEnnemmi(this);
        menufight.getFightMenu();
        int choice = menufight.getIntInput();

        String action = switch (choice) {
            case 1 -> new Fight(player, this).getResultRecursive();
            case 2 -> "RECUL";
            case 3 -> "EXIT";
            default -> interact(player);
        };
        return action;
    }


    private String image;
    private String type;
    private String name;
    private int health;
    private int strength;
    private EquipementDefensif weapon;
    private EquipementOffensif shield;
    private String description;


    @Override
    public String toString() {
        return image;
    }

    public Ennemi(String type, String name, int health, int strength, EquipementDefensif weapon, EquipementOffensif shield) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.shield = shield;
    }


    public Ennemi() {
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

    public EquipementDefensif getWeapon() {
        return weapon;
    }

    public void setWeapon(EquipementDefensif weapon) {
        this.weapon = weapon;
    }

    public EquipementOffensif getShield() {
        return shield;
    }

    public void setShield(EquipementOffensif shield) {
        this.shield = shield;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}













