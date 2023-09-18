package Game;

import Personnages.Personnage;
import PlateuDeJeu.Cases.*;
import java.util.*;

import java.util.ArrayList;

public class Game {


    private int position;
    private Personnage player;
    private ArrayList<Cases> plateau;

    //ArrayList<Cases> plateau = new ArrayList<Cases>();

    //private Map descases = new HashMap <String, String>();

    public Game() {
    }


    public void jouerUnTour() {
        ;
    }

    public int lancementDuddE() {
        int de = (int) (1 + 6 * Math.random());
        return de;
    }

//    public void plateauDuJeuDef(){
//
//        ArrayList <Cases> = new ArrayList<Cases>();
//
//    }
    // public void  jouer_un_tour()  qui sera en charge de lancer le dé, faire avancer le joueur, le
    //faire interagir avec le plateau de jeu (s’équiper d’un bonus, lancer un combat, etc.), mettre à
    //jour le statut d’avancement du jeu (en cours, quitter la partie, personnage mort, etc.). Et
    //plus tard, de gérer plusieurs joueurs.


    public void jouerauJeu (Personnage player) {
        if (player != null) {
            try {
                jeuDe(player);
            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Personnage hors plateau : " + e.getMessage());
                // et là ben .... on verra plus tard !!!!
            } finally {
                System.out.println(" FINALLY ");
            }
        }
    }


    // ICI JE VAIS RANGER MES EXCEPTIONS DE Jeu


    // Là le consctucteur de mon exception
//    public class PersonnageHorsPlateauException extends Exception {
//        public PersonnageHorsPlateauException(String message) {
//
//            super(message);
//        }
//    }


    public void jeuDe (Personnage player) throws PersonnageHorsPlateauException {


        Cases[] plateau = new Cases[4];
        plateau[0]  = new CaseVide();
        plateau[1] = new CaseEnnemi();
        plateau[2] = new CaseArme();
        plateau[3] = new CasePotion();


        for (position = 0; position < plateau.length; position++) {

            System.out.println("Vous êtes à la position : " + position +  "\r\n");
            Cases Test;
             Test = plateau[position];
             Test.interact(player);

            System.out.println(player);
           System.out.println(player.gethealth());
        }


    }
}


//
//        while (position < 64) {
//            int de = lancementDuddE();
//            position = position + de;
//
//            System.out.println("Vous êtes à la position : " + position);
//            System.out.println("Votre lancé est de " + de);
//
//            if (position > 64) {
//                throw new PersonnageHorsPlateauException();
//            }


//    Cases[] plateau = new Cases[3];
//        System.out.println("Vous êtes à la position : " + position);
//
//                plateau[0] = new CaseVide();
//                plateau[1] = new CaseEnnemi();