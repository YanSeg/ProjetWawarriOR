package Ennemis;


import Equipements.Equipements;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.Cases.Cases;
import PlateuDeJeu.Cases.InterfacePlateau;
import PlateuDeJeu.PlateauDuJeu;


import java.awt.*;
import java.util.Scanner;

import static Game.Game.lancementDuddE;
import static MiseEnPage.MiseEnPage.space;



public abstract class Ennemi implements Cases, InterfacePlateau {

    private int choice;

    private int forceAttaquePlayer;

    @Override
    public void interact(Personnage player) {

//        System.out.println();
        String SHAME = ASCII_Representations.puit2();

        Scanner scanner = new Scanner(System.in);
//        boolean fightMenu;
//

        System.out.println(this.toString());


        System.out.println("1. Se battre");
        System.out.println("2. Reculer d'un nombre de cases aléatoires ");

        int choice = scanner.nextInt();
        this.choice= choice;
        switch (choice) {
            case 1:
                while (player.getHealth() > 0 && this.getHealth() > 0) {

                    int a = player.getStrength();
                    Equipements arme = player.getEquipemenOf();
                    int b = arme.getStrength();
                    int forceAttaquePlayer = a + b;
                    this.forceAttaquePlayer = forceAttaquePlayer;
                    int ennemiLife = this.getHealth() - forceAttaquePlayer;
                    this.setHealth(ennemiLife);
                    System.out.println("La vie du " + this.getClass() +" est à : " + this.getHealth());
                    space();
                    System.out.println("A votre tour d'être attaqué");
                    space();
                    Equipements shield = player.getEquipementDef();
                    player.setHealth(((player.getHealth()) + shield.getDefensive()) - this.getStrength());
                    System.out.println(player);
                }
                break;
            case 2:
                System.out.println(SHAME);
                int newposition = (player.getPosition() - lancementDuddE());
                player.setPosition(newposition);

            default:

        }
    }

    @Override
    public void miseAjourPlateau(PlateauDuJeu plateau) {
        Cases caseActuelle = plateau.getPlateau()[plateau.getPositionPlayer()];
        if (caseActuelle instanceof Ennemi && this.choice ==  1){
            Ennemi ennemi = (Ennemi) caseActuelle;
            ennemi.setHealth(ennemi.getHealth()-forceAttaquePlayer);
        }
    }

    @Override
    public String toString() {
        return " " + image + "\n"
                + name + "\n" + description + "\n" +
                " | Vie: " + health + " | Force : " + strength + " | Attaque : " + offensive + " | Défense : " + defensive + "";
    }




//    private final Scanner scanner = new Scanner(System.in);


    private String image;
    private String type;
    private String name;
    private int health;
    private int strength;
    private String offensive;
    private String defensive;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Ennemi() {

    }

    public Ennemi(String type, String name, int health, int strength, String offensive, String defensive) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
    }

    public Ennemi(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        this.image = image;
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.offensive = offensive;
        this.defensive = defensive;
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
}