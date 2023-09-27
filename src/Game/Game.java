package Game;

import Equipements.EquipementDef.Boucliers.Bouclier;
import Equipements.EquipementDef.Phyltres.Phyltre;
import Equipements.EquipementOff.Armes.Epees.Epee;
import Equipements.EquipementOff.Armes.Epees.EpeeGranit;
import Equipements.EquipementOff.Sorts.SortsTerre.SortBasique;
import Images.ASCII_Representations;
import Personnages.Personnage;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import PlateuDeJeu.Cases.Cases;
import PlateuDeJeu.BoardFactory;
import Menu.MenuJeu;

import java.lang.*;
import java.util.Scanner;
import java.util.*;

import static PlateuDeJeu.Son.Son.*;


public class Game {
    private Personnage player;
    private int positionPlayer;
    private ArrayList<Cases> plateau;
    private MenuJeu menuJeu;
    private final Scanner scanner = new Scanner(System.in);

    private boolean canPlay = true;

    private boolean quitterJeu = true;

    public Game() {
        this.plateau = BoardFactory.createPlateauList();
        this.positionPlayer = 0;
        this.menuJeu = new MenuJeu();
    }


    public void changeNamePlayer(Personnage player) {
        if (player != null) {
            menuJeu.displayChangePersoName();
            String persoNewName = scanner.nextLine();
            player.setName(persoNewName);
        } else {
            menuJeu.affichageErreurMenu();
        }
    }

    private void generateWarriorDeflaut() {
        player = new Guerrier(100, 100, "Guerrier", "Eric Cantona");
        Bouclier bouclier = new Bouclier("De base", 15, "Bouclier");
        Epee epee = new EpeeGranit();
        player.setEquipementDef(bouclier);
        player.setEquipemenOf(epee);
    }


    private void creerMagicien() {
        String persoType = "Magicien";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", 15, "Phyltre");
        player = new Magicien(6, 15, "Magicien", persoName);
        player.setEquipemenOf(sort);
        player.setEquipemenOf(phyltre);

    }

    private void creerGuerrier() {
        String persoType = "Guerrier";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
        Bouclier bouclier = new Bouclier("De base", 15, "Bouclier");
        Epee epee = new EpeeGranit();
        player = new Guerrier(10, 10, "Guerrier", persoName);
        player.setEquipemenOf(epee);
        player.setEquipementDef(bouclier);
    }

    public void genrateMagicienDefault() {
        player = new Magicien(100, 100, "Magicien", "David Copperfield");
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", 15, "Phyltre");
        player.setEquipementDef(phyltre);
        player.setEquipemenOf(sort);
    }

    public boolean isOver(Personnage player, BoardFactory plateau) {
        return (this.positionPlayer < 63) && (player.getHealth() > 0);
    }

    private void createPersonnage() {
        System.out.println("Tapez 1 : Guerrier | Tapez 2 : Magicien");
        String persoType;
        String persoName;
        int choixTypePerso = menuJeu.getIntInput();
        switch (choixTypePerso) {
            case 1 -> creerGuerrier();
            case 2 -> creerMagicien();
            default -> menuJeu.affichageErreurMenu();
        }
    }


    public void menuDuJeu() {
        while (quitterJeu) {
            while (canPlay) {
                menuJeu.listemenu2();
                int choiceMenu = menuJeu.getIntInput();
                switch (choiceMenu) {
                    case 1 -> createPersonnage();
                    case 2 -> generateWarriorDeflaut();
                    case 3 -> genrateMagicienDefault();
                    case 4 -> changeNamePlayer(player);
                    case 5 -> menuJeu.affichageduPersonnage(player);
                    case 6 -> canPlay();
                    case 7 -> exit();
                    default -> menuJeu.affichageErreurMenu();
                }
            }
            play();
        }
    }

    private void exit() {
        this.quitterJeu = false;
    }


    private boolean canPlay() {
        return this.canPlay = false;
    }

    private int lancementDuddE() {
        int de = (int) (1 + 6 * Math.random());
        return de;
    }

    public void jouerUnTour() {

        movePlayer();

        if (positionPlayer == 63) {
            String REPRESENTATION = ASCII_Representations.men();
            System.out.println(REPRESENTATION);
            System.out.println("GAGNE");
        }
        else if (0 <= positionPlayer && positionPlayer < 63) {
            plateau.get(positionPlayer).interact(player);               // ici c'est cool
        } else {
            playExplosed();
            playEpee();
            throw new PersonnageHorsPlateauException();
        }

    }

    private void movePlayer() {
        int new_position = positionPlayer + lancementDuddE();
        positionPlayer = new_position;
    }

    private void play() {

        BoardFactory plateau = new BoardFactory();
        ArrayList<Cases> pff = plateau.getPlateau();
        System.out.println(plateau);
        for (Cases s : pff) {
            System.out.println(s);
        }

        while (positionPlayer < 63) {
            System.out.println("LA POSITION DU JOUEUR est de " + positionPlayer + "vous jouez un autre tour");
            jouerUnTour();

        }


        this.quitterJeu = false;


    } else if(0<=position &&position< 63)

    {
//
//

        plateauDuJeu.getPlateau()[position].interact(player, plateauDuJeu);

        System.out.println(plateauDuJeu.getClass().getSimpleName());
//            int newpoiton = Math.min(63, player.getPosition() + de);
        player.setPosition(position);
        System.out.println("_______________________________________________________________________");
//            System.out.println("LANCE DE DE " + de);

        System.out.println(" Vous êtes à la position " + plateauDuJeu.getPositionPlayer());
        System.out.println("_______________________________________________________________________");
    } else if(position ==63)

    {
        String REPRESENTATION = ASCII_Representations.men();
        System.out.println(REPRESENTATION);
        System.out.println("GAGNE");
//            this.player = null;
    } else

    {
        playExplosed();
        playEpee();
        throw new PersonnageHorsPlateauException();
    }

}


//
//        if (player != null) {
//            System.out.println(plateau.getClass().getSimpleName());
//
//            while (isOver(player, plateau)) {
//                jouerauJeu(player, plateau);
//            }
//        } else {
//            menuJeu.affichageErreurMenu();
//
//        }


    public void init() {
        MenuJeu menu = new MenuJeu();
        playIntro();
        menuDuJeu();
    }


    public void jouerauJeu(Personnage player, BoardFactory plateauDuJeu) {

        if (player != null || plateauDuJeu.getPositionPlayer() == 63)

            try {
                jouer1tour(player, plateauDuJeu);
            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Personnage hors plateau : " + e.getMessage());
//                player = null;
            }

    }

    public int movePlayer(BoardFactory plateauDuJeu) {
        int de = lancementDuddE();
        int postionRelle = plateauDuJeu.getPositionPlayer();
        int r = de + postionRelle;
        return de + postionRelle;
    }

    public void jouer1tour(Personnage player, BoardFactory plateauDuJeu) throws PersonnageHorsPlateauException {

////        String choice = inGameMenu.getUserInput();
////        switch (choice) {
////            case "MOVE" -> movePlayer();
////            case "QUIT" ->
////        }
////
//
//        System.out.println("LA POSITION DU JOUEUR est de " + plateauDuJeu.getPositionPlayer());
//        System.out.println("____________________________________________________");
//        int position = movePlayer(plateauDuJeu);
//        plateauDuJeu.setPositionPlayer(position);
//        System.out.println("Vous avancez à la case " + plateauDuJeu.getPositionPlayer());
//
//
//        if (position < 0) {
//            plateauDuJeu.setPositionPlayer(0);
//        } else if (0 <= position && position < 63) {
////
////
//
//            plateauDuJeu.getPlateau()[position].interact(player, plateauDuJeu);
//
//            System.out.println(plateauDuJeu.getClass().getSimpleName());
////            int newpoiton = Math.min(63, player.getPosition() + de);
//            player.setPosition(position);
//            System.out.println("_______________________________________________________________________");
////            System.out.println("LANCE DE DE " + de);
//
//            System.out.println(" Vous êtes à la position " + plateauDuJeu.getPositionPlayer());
//            System.out.println("_______________________________________________________________________");
//        } else if (position == 63) {
//            String REPRESENTATION = ASCII_Representations.men();
//            System.out.println(REPRESENTATION);
//            System.out.println("GAGNE");
////            this.player = null;
//        } else {
//            playExplosed();
//            playEpee();
//            throw new PersonnageHorsPlateauException();
//        }
//
//    }
//}
//
////        Cases[] plateau = new Cases[4];
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

    }
}



