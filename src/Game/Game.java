package Game;

import Ennemis.Ennemi;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.Cases.*;
import PlateuDeJeu.GenerateurPlateau;
import PlateuDeJeu.PlateauDuJeu;

import java.util.ArrayList;

import java.util.*;


public class Game {


    private Personnage player;
    private ArrayList<Cases> plateau;

    //ArrayList<Cases> plateau = new ArrayList<Cases>();

    //private Map descases = new HashMap <String, String>();

    public Game() {
    }


    public void jouerUnTour() {
        ;
    }


    /**
     * @return un entier compris entre 1 et 6
     */

    public static int lancementDuddE() {
        int de = (int) (1 + 6 * Math.random());
        return de;
    }

    /**
     * @param player
     * @param plateau C'est ma méthode pour jouer au jeu
     */
    public void jouerauJeu(Personnage player, PlateauDuJeu plateauDuJeu) {

        if (player != null)

            try {
                jouer1tour(player, plateauDuJeu);
            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Personnage hors plateau : " + e.getMessage());
                System.out.println("VOUS AVEZ GAGNE");


            }
    }


    public void jouer1tour(Personnage player, PlateauDuJeu plateauDuJeu) throws PersonnageHorsPlateauException {

//for (int i = 0; i < plateauDuJeu.getPlateau().length; i++) {
  //          System.out.print(plateauDuJeu.getPlateau()[i] + " "); // Affiche l'élément du plateau
    //        if ((i + 1) % 8 == 0) {
      //          System.out.println(); // Passe à une nouvelle ligne après chaque ligne de 8 éléments
        //    }
        //}

        int de = lancementDuddE();
        plateauDuJeu.setPositionPlayer(plateauDuJeu.getPositionPlayer()+de);
        if ((plateauDuJeu.getPositionPlayer()) < 63) {

           plateauDuJeu.getPlateau()[plateauDuJeu.getPositionPlayer()].interact(player);
            System.out.println(plateauDuJeu.getClass());
           int newpoiton = Math.min(63, player.getPosition() + de);
            player.setPosition((player.getPosition()));
            System.out.println("_______________________________________________________________________");
            System.out.println("LANCE DE DE " + de);

            System.out.println(" Vous êtes à la position " + (player.getPosition()));
            System.out.println("_______________________________________________________________________");
        } else if ((player.getPosition()) >= 63) {
            String REPRESENTATION = ASCII_Representations.men();
            System.out.println(REPRESENTATION);
            System.out.println("GAGNE");

        } else {
            throw new PersonnageHorsPlateauException();
        }

    }
}

//        Cases[] plateau = new Cases[4];
//
//        plateau[0] = new CaseVide();
//        plateau[1] = new CaseEnnemi();
//        plateau[2] = new CaseArme();
//        plateau[3] = new CasePotion();
//
//
//        for (position = 0; position < plateau.length; position++) {
//            System.out.println("Vous êtes à la position : " + position + "\r\n");
//            Cases Test;
//            Test = plateau[position];
//            Test.interact(player);
//            System.out.println(player);
//            System.out.println(player.gethealth());
//        }
//    }





