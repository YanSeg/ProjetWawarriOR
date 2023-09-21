package Game;

import Personnages.Personnage;
import PlateuDeJeu.Cases.*;

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

    public void jouerauJeu(Personnage player) {

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


        // Création du plateau ici pour l'instant
        Cases[] plateau = new Cases[64];
        for (int i = 0; i < 64; i++) {
            plateau[i] = new CaseVide();
        }
        int[] casesDragonsS = {45, 52, 56, 62};
        for (int caseDragon : casesDragonsS) {
            plateau[caseDragon] = new CaseDragon();
        }
        int[] caseSorciersS = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
        for (int caseSorcier : caseSorciersS) {
            plateau[caseSorcier] = new CaseSorcier();
        }
        int[] caseGobelinsS = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        for (int caseGobelin : caseGobelinsS) {
            plateau[caseGobelin] = new CaseGobelin();
        }
        int[] casesCaissesSurprises = {2, 11, 5, 22, 38, 19, 26, 42, 53, 1, 4, 8, 17, 23, 48, 49, 7, 13, 31, 33, 39, 43, 28, 41};
        for (int caseCaisseSurprise : casesCaissesSurprises) {
            plateau[caseCaisseSurprise] = new CaseEquipement();
        }
///////////////////////////////////////////////////////////////////////////////

        int position = 0;


        while (position < 65) {

            while (player.gethealth() > 0) {
                int de = lancementDuddE();
                position = position + de;
                Cases Test;
                Test = plateau[position];
                Test.interact(player);

            }

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