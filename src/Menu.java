import Equipements.EquipementDef.Boucliers.Bouclier;
import Equipements.EquipementDef.Phyltres.Phyltre;
import Equipements.EquipementOff.Armes.Epees.Epee;
import Equipements.EquipementOff.Armes.Epees.EpeeGranit;
import Equipements.EquipementOff.Sorts.SortsTerre.SortBasique;
import Game.Game;
import Personnages.Personnage;
import Personnages.Magiciens.Magicien;
import Personnages.Guerriers.Guerrier;
import Images.ASCII_Representations;
import PlateuDeJeu.PlateauDuJeu;

import java.util.Scanner;

//import static PlateuDeJeu.Son.Son.playSound;


public class Menu {
    private final Scanner scanner;
    private Personnage player;


    public Menu() {

        this.scanner = new Scanner(System.in);
    }

    public void space() {
        System.out.println("\033[H\033[2J");
    }


    public void affichageErreurMenu() {
        space();
        System.out.println("Merci de commencer par créer votre personnage");
    }

    public void affichageduPersonnage(Personnage player) {
        if (player != null) {
            System.out.println(player);
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

    public void backtoStartMenu() {
        System.out.println(" _____________________________________________________________.");
    }

    private Personnage creerMagicien() {
        String persoType = "Magicien";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", 15, "Phyltre");
        Magicien player = new Magicien(6, 15, "Magicien", persoName);
        player.setEquipemenOf(sort);
        player.setEquipemenOf(phyltre);
        return player;


    }

    private Personnage creerGuerrier() {
        String persoType = "Guerrier";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
        Bouclier bouclier = new Bouclier("De base", 15, "Bouclier");
        Epee epee = new EpeeGranit();
        Guerrier player = new Guerrier(10, 10, "Guerrier", persoName);
        player.setEquipemenOf(epee);
        player.setEquipementDef(bouclier);
        return player;
    }

    public void changeNamePlayer(Personnage player) {
        if (player != null) {
            Scanner question3 = new Scanner(System.in);
            String persoNewName;
            System.out.println("Choisissez un nouveau Nom");
            persoNewName = question3.nextLine();
            player.setName(persoNewName);
        }
    }

    private Personnage createPersonnage() {
        System.out.println("Tapez 1 : Guerrier | Tapez 2 : Magicien");
        String persoType;
        String persoName;
        //Personnage player;
        int choixTypePerso = getIntInput();
        switch (choixTypePerso) {
            case 1:
                player = creerGuerrier();
                break;
            case 2:
                player = creerMagicien();
                break;
            default:
                space();
                affichageErreurMenu();
                space();
                player = null;
                //////////////////////// Fonction recursive : Personnage player = choixPersoMenu(); où un truc du genre
                // break;
        }
        return player;
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


// Les menus approprement dit _________________________________________________________________________________


    public void startMenu() {
        boolean menuDisplay = true;
        while (menuDisplay) {
            System.out.println("1. Accéder au Menu");
            System.out.println("2. Quitter");
            int choice = getIntInput();
            switch (choice) {
                case 1:
                    secondMenu();
                    break;
                case 2:
                    menuDisplay = false;
                    break;
                default:
                    affichageErreurMenu();
                    break;
            }
        }
    }


    public void secondMenu() {


        boolean lemenu = true;
        while (lemenu) {
            listemenu2();
            int choiceMenu = getIntInput();

            switch (choiceMenu) {
                case 1:
                    player = createPersonnage();
                    break;
                case 2:
                    generateWarriorDeflaut();
                    break;
                case 3:
                    genrateMagicienDefault();
                    break;
                case 4:
                    if (player != null) {
                        space();
                        changeNamePlayer(player);
                        space();
                    } else {
                        space();
                        affichageErreurMenu();
                        space();
                    }
                    break;
                case 5:
                    space();
                    affichageduPersonnage(player);
                    space();
                    break;
                case 6:
                    space();
                    Game game = new Game(); // Pas là
                    if (player != null) {

                        //Cases[] plateau = GenerateurPlateau.plateaClassique();
                        PlateauDuJeu plateauDuJeu = new PlateauDuJeu(0);
                        System.out.println(plateauDuJeu.getClass().getSimpleName());
                        while (isOver(player, plateauDuJeu)) {
                            game.jouerauJeu(player, plateauDuJeu);
                        }
                    } else {
                        affichageErreurMenu();
                        space();
                    }
                    space();
                    //   player = null;
                    break;
                case 7:
                    lemenu = false;
                    space();
                    break;

                default:
                    space();
                    affichageErreurMenu();
                    space();
                    break;
            }
        }

        backtoStartMenu();

    }


    // private Boolean isOver(){
//
//        return(player.gethealth()<=0 || positon
// }
    public static void runOrfight() {

    }

    public Personnage generateWarriorDeflaut() {
        player = new Guerrier(100, 100, "Guerrier", "Eric Cantona");
        Bouclier bouclier = new Bouclier("De base", 15, "Bouclier");
        Epee epee = new EpeeGranit();
        player.setEquipementDef(bouclier);
        player.setEquipemenOf(epee);
        return player;
    }

    public Personnage genrateMagicienDefault() {
        player = new Magicien(100, 100, "Magicien", "David Copperfield");
        SortBasique sort = new SortBasique();
        Phyltre phyltre = new Phyltre("De Base", 15, "Phyltre");
        player.setEquipementDef(phyltre);
        player.setEquipemenOf(sort);
        return player;
    }

    public boolean isOver(Personnage player, PlateauDuJeu plateauDuJeu) {
        return ((plateauDuJeu.getPositionPlayer() < 63) && (player.getHealth() > 0));
    }
}
