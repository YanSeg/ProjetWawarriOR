package Menu;

import Personnages.Personnage;
import Images.ASCII_Representations;
import Ennemis.*;
import Enum.EnnemisEnum.enumEnnemi;

import java.util.Scanner;

import static PlateuDeJeu.Son.Son.*;

//import static PlateuDeJeu.Son.Son.playSound;


public class MenuJeu {

    private final Scanner scanner;



    public MenuJeu() {

        this.scanner = new Scanner(System.in);

    }

    public static void space() {
        System.out.println("\033[H\033[2J");
    }


    public void displayWelcomeMessage() {
        enumEnnemi ennemiEnum = enumEnnemi.DRAGON;
        Ennemi randomSorcier = ennemiEnum.getRandomEnnemi();
        ennemiEnum.displayrandomEnum(randomSorcier);
        playIntro();

    }

    public void affichageErreurMenu() {
        System.out.println("Merci de commencer par créer votre personnage");
    }

    public void affichageduPersonnage(Personnage player) {
        if (player != null) {
            space();
            System.out.println(player);
            space();
        } else {
            affichageErreurMenu();
        }
    }

    public void listemenu2() {
        System.out.println("1. Créer votre personnage");
        System.out.println("2. Guerrier par defaut");
        System.out.println("3. Magicien par defaut");
        System.out.println("4. Modifier votre personnage");
        System.out.println("5. Afficher les paramètres de votre personnage");
        System.out.println("6. Jouer");
        System.out.println("7. Quitter le menu du jeu");
    }





    public int getIntInput() {
        try {
            int r = this.scanner.nextInt();
            this.scanner.nextLine(); // Permet d'écraser le scanner pour ne pas avoir une boucle infinie.
            return r;
        } catch (Exception e) {
            space();
            ASCII_Representations integer = new ASCII_Representations();
            System.out.println(integer.integer());
            System.out.println(integer.please());
            space();
            this.scanner.nextLine();
            return getIntInput();
        }
    }

    public void displayChangePersoName() {
        System.out.println("Choisissez un nouveau Nom");
    }


// Les menus approprement dit _________________________________________________________________________________





}
