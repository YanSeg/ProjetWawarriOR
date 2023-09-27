package Ennemis;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.Cases.Cases;
import PlateuDeJeu.BoardFactory;
import java.util.Scanner;
import static MiseEnPage.MiseEnPage.space;


public abstract class Ennemi implements Cases {

    private int choice;
    private String image;
    private String type;
    private String name;
    private int health;
    private int strength;
    private String offensive;

    public int getCasePosition() {
        return casePosition;
    }

    public void setCasePosition(int casePosition) {
        this.casePosition = casePosition;
    }

    private String defensive;

    private int casePosition;
    private String description;

//    private BoardFactory plateauDuJeu;


    @Override
    public void interact(Personnage player) {

      setCasePosition(player.getPosition());

      plateau.set(casePosition, CaseVide())



        if (this.getHealth()<0) {

        }








































        if (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Se battre");
            System.out.println("2. Reculer d'un nombre de cases aléatoires ");
            int choice = getIntInput(scanner);

            this.choice = choice;

            switch (choice) {

                case 1:
                    if (this.getHealth() > 0)
                        while (player.isAlive(player) && this.getHealth() > 0) {
                            int forceAttaquePlayer = player.getEquipemenOf().getStrength() + player.getStrength();
                            int ennemiLife = this.getHealth() - forceAttaquePlayer;
                            this.setHealth(ennemiLife);
                            System.out.println("La vie de " + this.getName() + " est à : " + this.getHealth());
                            space();
                            if (this.getHealth() > 0) {
                                System.out.println("A votre tour d'être attaqué");
                                space();
                                Equipements shield = player.getEquipementDef();
                                int pointDefense = shield.getDefensive();
                                int defenseTotale = pointDefense + player.getHealth();
                                player.setHealth(player.getHealth() + pointDefense - ennemiSurCase.getStrength());
                                System.out.println("Votre vie est de  " + player.getHealth());
                            }
                        }

                    else {
                        System.out.println("L'ennemi est mort");

                    }
                    break;

                case 2:
                    System.out.println(SHAME);
                    int derecul = lancementDuddE();
                    System.out.println(" vous reculé de " + derecul + "case");
                    plateauDuJeu.setPositionPlayer(plateauDuJeu.getPositionPlayer() - derecul);
                    System.out.println("Vous allez arriver à la case " + plateauDuJeu.getPositionPlayer());
                    break;
                default:
                    // Gérez d'autres choix ici si nécessaire.
            }
        } else {
            int avancement = lancementDuddE();
            plateauDuJeu.setPositionPlayer(plateauDuJeu.getPositionPlayer() + avancement);
            System.out.println("L'ennemi qui était sur cette case a été bouillave, vous avancé de " + avancement);
        }

//
//            Cases caseActuelle = plateauDuJeu.getPlateau()[plateauDuJeu.getPositionPlayer()];

            System.out.println("MONTRE MOI QUE TU INTERAGIS");
            System.out.println("MONTRE MOI QUE TU INTERAGIS");
            System.out.println("MONTRE MOI QUE TU INTERAGIS");
            System.out.println("MONTRE MOI QUE TU INTERAGIS");

            if (this.ennemi.getHealth() < 0) {
                this.ennemi = null;
                System.out.println("LA CASE EST VIDE DESORMAIS, ENNEMI MORT");
                plateauDuJeu.getPlateau()[plateauDuJeu.getPositionPlayer()] = new CaseVide();
            }
//        if (caseActuelle instanceof Ennemi && this.choice == 1) {
            else if (this.choice == 1) {
                Ennemi ennemi = (Ennemi) caseActuelle;
                ennemi.setHealth(ennemi.getHealth() - forceAttaquePlayer);
            } else if (this.choice == 2) {
                plateauDuJeu.setPositionPlayer(plateauDuJeu.getPositionPlayer() - this.derecul);
            }
            this.derecul = 0;
        } else {
            int avancement = lancementDuddE();
            plateauDuJeu.setPositionPlayer(plateauDuJeu.getPositionPlayer() + avancement);
            System.out.println("L'ennemi qui était sur cette case a été bouillave, vous avancé de " + avancement);
        }
 }

    // La méthode getIntInput qui gère les entrées entières du scanner.
    private int getIntInput(Scanner scanner) {
        try {
            int r = scanner.nextInt();
            scanner.nextLine(); // Permet d'écraser le scanner pour ne pas avoir une boucle infinie.
            return r;
        } catch (Exception e) {
            space();
            ASCII_Representations integer = new ASCII_Representations();
            System.out.println(integer.integer());
            System.out.println(integer.please());
            space();
            scanner.nextLine();
            return getIntInput(scanner); // Utilisez récursivement getIntInput() en cas d'erreur de saisie.
        }
    }


    @Override
    public String toString() {
        return " " + image + "\n"
                + name + "\n" +
//                description + "\n"
//
                " | Vie: " + health + " | Force : " + strength + " | Attaque : " + offensive + " | Défense : " + defensive + "";
    }


//    private final Scanner scanner = new Scanner(System.in);




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