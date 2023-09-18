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


    public void jeuDe(Personnage player) throws PersonnageHorsPlateauException {


        Cases[] plateau = new Cases[4];

        plateau[0] = new CaseVide();
        plateau[1] = new CaseEnnemi();
        plateau[2] = new CaseArme();
        plateau[3] = new CasePotion();


        for (position = 0; position < plateau.length; position++) {
            System.out.println("Vous êtes à la position : " + position + "\r\n");
            Cases Test;
            Test = plateau[position];
            Test.interact(player);

            System.out.println(player);
            System.out.println(player.gethealth());
        }


    }
}
