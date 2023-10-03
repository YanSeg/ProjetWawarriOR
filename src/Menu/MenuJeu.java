package Menu;

import Personnages.Personnage;
import Images.ASCII_Representations;
import Ennemis.*;
import Enum.EnnemisEnum.EnumEnnemi;

import java.util.Scanner;

import static PlateuDeJeu.Son.Son.*;

//import static PlateuDeJeu.Son.Son.playSound;


public class MenuJeu {

    private final Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public MenuJeu() {
        this.scanner = new Scanner(System.in);

    }

    public static void space() {
        System.out.println("\033[H\033[2J");
    }


    public void displayWelcomeMessage() {
        EnumEnnemi ennemiEnum = EnumEnnemi.DRAGON;
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
    public void getFightMenu() {
        System.out.println("1. Voulez vous vous battre?");
        System.out.println("2. Voulez-vous fuir?");
        System.out.println("3. Quitter les jeu?");
    }

    public void getEquipementMenu(){
        System.out.println("1. Prendre l'équipement?");
        System.out.println("2. Laisser l'équipement");
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

    public void presentationEnnemmi(Ennemi ennemi){
        System.out.println( "Vous faites face à " +ennemi.getName() +'\n' + '\n' + ennemi.getImage()  +'\n' + '\n' +"Weapon : "+ennemi.getWeapon().getName()+"force|"+ennemi.getWeapon().getStrength()
                +'\n' + "Shield |"+ennemi.getShield().getName()+"force|"+ennemi.getShield().getStrength() +'\n' + '\n');
    }
    public void presentationPlayer(Personnage player){
        System.out.println(player);
    }
    public void printresult(String result){
        System.out.println(result);
    }

    public void etatCombattant (Personnage player ,Ennemi ennemi){
        System.out.println("La vie du joueur est de : " + player.getHealth());
        System.out.println("La vie de l'ennemi est de : " + ennemi.getHealth());
    }
    public void isEnnemiALive(){
        System.out.println("ENNEMI DEAD");
    }
    public void isPlayerDead(){
        System.out.println("GAMEOVER");

    }
    public void gagnE(){
        System.out.println(ASCII_Representations.findupiege());
        System.out.println( '\n' +  "VOUS AVEZ GAGNE" + '\n');
        System.out.println(ASCII_Representations.illuminati());
    }

    public void ureDead(){
        System.out.println(ASCII_Representations.neo());
    }

}
