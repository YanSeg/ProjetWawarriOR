package Game;

import Ennemis.Ennemi;
import Equipements.EquipementDef.Boucliers.Bouclier;
import Equipements.EquipementDef.Phyltres.Phyltre;
import Equipements.EquipementOff.Armes.Epees.Epee;
import Equipements.EquipementOff.Armes.Epees.EpeeGranit;
import Equipements.EquipementOff.Sorts.SortsTerre.SortBasique;
import Images.ASCII_Representations;
import Personnages.Personnage;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import PlateuDeJeu.CaseEmpty;
import PlateuDeJeu.Cases;
import PlateuDeJeu.BoardFactory;
import Menu.MenuJeu;

import java.lang.*;
import java.util.Scanner;
import java.util.*;

import Game.PersonnageHorsPlateauException;

import static PlateuDeJeu.Son.Son.*;


public class Game {
    private Personnage player;
    private int positionPlayer;
    private ArrayList<Cases> plateau;
    private MenuJeu menuJeu;
    private final Scanner scanner = new Scanner(System.in);
    private boolean canPlay = true;
    private boolean quitterJeu = true;

    private String state = "IN_PROGRESS";


    public Game() {
        this.plateau = BoardFactory.createPlateauList();
        this.positionPlayer = 0;
        this.menuJeu = new MenuJeu();
    }

    public void init() {
        MenuJeu menu = new MenuJeu();
        playIntro();
        menuDuJeu();
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

    public void genrateMagicienDefault() {
        player = new Magicien(100, 100, "Magicien", "David Copperfield");
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", "Phyltre", 15);
        player.setEquipementDef(phyltre);
        player.setEquipemenOf(sort);
    }

    private void creerMagicien() {
        String persoType = "Magicien";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", "Phyltre", 15);
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

    public boolean isOver(Personnage player, BoardFactory plateau) {
        return (this.positionPlayer < 63) && (player.getHealth() > 0);
    }

    private int lancementDuddE() {
        int de = (int) (1 + 6 * Math.random());
        return de;
    }



    private void play() {
        while (positionPlayer < 63) {
            try {
                jouerUnTour();
            } catch (PersonnageHorsPlateauException e) {
            }
        }
    }
    private boolean exit() {
        return this.quitterJeu = false;
    }

    private boolean canPlay() {
        return this.canPlay = false;
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
            while (gameState(state)) {
                play();
            }
            System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        }

        System.out.println("Au revoir");
    }

    private boolean gameState(String state) {
        boolean boobl = true;
        if (state == "IN_PROGRESS" || state == "GAME_OVER") {
            boobl = true;
        }
        if (state == "EXIT" || state == "BYE") {
            boobl = false;
        }
        return boobl;
    }

    private void movePlayer() {
        int new_position = positionPlayer + lancementDuddE();
        positionPlayer = new_position;
    }

    private void movebackPlayer() {
        int new_position = positionPlayer - lancementDuddE();
        positionPlayer = new_position;
    }


    public void jouerUnTour() throws PersonnageHorsPlateauException {

        if (positionPlayer == 63) {
            String REPRESENTATION = ASCII_Representations.men();
            System.out.println(REPRESENTATION);
            System.out.println("GAGNE");

        } else if (0 <= positionPlayer && positionPlayer <63) {
            String state = plateau.get(positionPlayer).interact(player);
            switch (state) {
                case "GAME_OVER" -> {
                    System.out.println("TES MORT");
                    exit();
                }
                case "IN_PROGRESS" -> {
                    System.out.println("LA POSITION DU JOUEUR : " + positionPlayer);
                    movePlayer();
                    System.out.println("LA POSITION DU JOUEUR : " + positionPlayer);
                    jouerUnTour();
                }
                case "RECUL" -> {
                    System.out.println("LA POSITION DU JOUEUR : " + positionPlayer);
                    System.out.println("TU RECULS, T'ENTENDS");
                    movebackPlayer();
                    System.out.println("LA POSITION DU JOUEUR : " + positionPlayer);
                    this.state = "IN_PROGRESS";
                }
                case "ENNEMI_DEAD" -> {
                    plateau.set(positionPlayer, new CaseEmpty());
                }
                case "EXIT" -> {
                    System.out.println("BYE");
                    exit();
                }
                default -> state = "IN_PROGRESS";
            }


        } else{
            throw new PersonnageHorsPlateauException();
        }
    }

}




