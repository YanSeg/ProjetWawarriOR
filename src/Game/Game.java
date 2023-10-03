package Game;

import Equipements.EquipementDef.Boucliers.Bouclier;
import Equipements.EquipementDef.Phyltres.Phyltre;
import Equipements.EquipementOff.Armes.Epees.Epee;
import Equipements.EquipementOff.Armes.Epees.EpeeGranit;
import Equipements.EquipementOff.Sorts.SortsTerre.SortBasique;
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

import static PlateuDeJeu.Son.Son.*;


public class Game {
    private Personnage player;
    private int positionPlayer;
    private ArrayList<Cases> plateau;
    private MenuJeu menuJeu;
    private final Scanner scanner = new Scanner(System.in);
    private boolean canPlay = true;
    private boolean playing = true;
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

    private void creerMagicien(String persoName) {
//        String persoType = "Magicien";
        System.out.println("Quel sera votre Nom ?");
        persoName = scanner.nextLine();
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", "Phyltre", 15);
        player = new Magicien(6, 15, "Magicien", persoName);
        player.setEquipemenOf(sort);
        player.setEquipemenOf(phyltre);

    }

    private void creerGuerrier(String persoName) {
//        String persoType = "Guerrier";
        System.out.println("Quel sera votre Nom ?");
        persoName = scanner.nextLine();
        Bouclier bouclier = new Bouclier("De base", 15, "Bouclier");
        Epee epee = new EpeeGranit();
        player = new Guerrier(10, 10, "Guerrier", persoName);
        player.setEquipemenOf(epee);
        player.setEquipementDef(bouclier);
    }

    private void createPersonnage() {
        System.out.println("Tapez 1 : Guerrier | Tapez 2 : Magicien");
        String persoName = " ";
        int choixTypePerso = menuJeu.getIntInput();
        switch (choixTypePerso) {
            case 1 -> creerGuerrier(persoName);
            case 2 -> creerMagicien(persoName);
            default -> menuJeu.affichageErreurMenu();
        }
    }

    private int lancementDuddE() {
        int de = (int) (1 + 6 * Math.random());
        return de;
    }

    private void play() {
        while (positionPlayer < 63) {
            jouerUnTour();
        }
    }

    private boolean exit() {
        return this.playing = false;
    }

    private boolean canPlay() {
        return this.canPlay = false;
    }


    private boolean keepPlaying(String state) {
        return (state == "IN_PROGRESS");
    }

    private void movePlayer() {
        int new_position = positionPlayer + lancementDuddE();
        positionPlayer = new_position;
    }

    private void movebackPlayer() {
        int new_position = positionPlayer - lancementDuddE();
        positionPlayer = new_position;
    }


    public void menuDuJeu() {
        while (playing) {
            while (canPlay) {
                menuJeu.listemenu2();
                int choiceMenu = menuJeu.getIntInput();
                switch (choiceMenu) {
                    case 1 -> createPersonnage();
                    case 2 -> generateWarriorDeflaut();
                    case 3 -> genrateMagicienDefault();
                    case 4 -> changeNamePlayer(player);
                    case 5 -> menuJeu.affichageduPersonnage(player);
                    case 6 -> {
                        if (player != null) {
                            canPlay();
                        } else {
                            menuJeu.affichageErreurMenu();
                        }


                    }
                    case 7 -> exit();
                    default -> menuJeu.affichageErreurMenu();
                }
            }
            while (keepPlaying(state)) {
                play();
            }

        }
        System.out.println("Au revoir");
    }


    public void jouerUnTour() {
        if (positionPlayer == 63) {
            restartAfterWinning();
            menuDuJeu();
        } else if (0 <= positionPlayer && positionPlayer < 63) {
            String state = plateau.get(positionPlayer).interact(player);

            switch (state) {
                case "GAME_OVER" -> {
                    System.out.println("TES MORT");
                    canPlay();
                    exit();
                    menuJeu.ureDead();
                    this.state = "IN_PROGRESS";
                    menuDuJeu();
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
                    this.state = "IN_PROGRESS";
                    jouerUnTour();
                }
                case "EXIT" -> {
                    System.out.println("BYE");
                    canPlay();
                }
                default -> state = "IN_PROGRESS";
            }
        } else {
            restartAfterWinning();
        }
    }

    private void restartAfterWinning() {
        menuJeu.gagnE();
        this.state = "IN_PROGRESS";
        this.canPlay = true;
        this.playing = true;
        menuDuJeu();
    }
}




