package Game;

import Ennemis.Ennemi;
import Personnages.Personnage;
import PlateuDeJeu.Cases.*;
import PlateuDeJeu.GenerateurPlateau;

import java.util.ArrayList;

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

    public int lancementDuddE() {
        int de = (int) (1 + 6 * Math.random());
        return de;
    }

    /**
     * @param player
     * @param plateau C'est ma méthode pour jouer au jeu
     */
    public void jouerauJeu(Personnage player, Cases[] plateau)  {

        if (player != null)
            try {
                jouer1tour(player, plateau);
            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Personnage hors plateau : " + e.getMessage());
            }
    }


    public void jouer1tour(Personnage player, Cases[] plateau) throws PersonnageHorsPlateauException {


        System.out.println(plateau.getClass().getSimpleName());




        if ((player.getPosition()) <= 63) {
            int de = lancementDuddE();
            int newpoiton = Math.min(63, player.getPosition() + de);
            player.setPosition(newpoiton);
            System.out.println("_______________________________________________________________________");
            System.out.println("LANCE DE DE " + de);


            System.out.println(" Vous êtes à la position " + newpoiton);
            System.out.println("_______________________________________________________________________");
            plateau[newpoiton].interact(player);

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





