import Personnages.Personnage;
import Personnages.Magiciens.Magicien;
import Personnages.Guerriers.Guerrier;

import java.util.Scanner;


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
        System.out.println("2. Modifier votre personnage");
        System.out.println("3. Afficher les paramètres de votre personnage");
        System.out.println("4. Jouer");
        System.out.println("5. Quitter le jeu");
    }

    public void backtoStartMenu() {
        System.out.println(" _____________________________________________________________.");
    }

    public void changeNameBastard(Personnage player) {
        if (player != null) {
            Scanner question3 = new Scanner(System.in);
            String persoNewName;
            System.out.println("Choisissez un nouveau Nom");
            persoNewName = question3.nextLine();
            player.setName(persoNewName);
        }
    }

    public void secondMenu() {
        boolean lemenu = true;
        while (lemenu) {
            listemenu2();
            int choiceMenu = getIntInput();

            switch (choiceMenu) {
                case 1:
                    player= createPersonnage();
                    break;
                case 2:
                    if (player != null) {
                        space();
                        changeNameBastard(player);
                        space();
                    } else {
                        space();
                        affichageErreurMenu();
                        space();
                    }
                    break;
                case 3:
                    space();
                    affichageduPersonnage(player);
                    space();
                    break;
                case 4:
                    space();
                    Game game = new Game();
                    if (player != null) {
                        game.jouerauJeu(player);
                    } else {
                        affichageErreurMenu();
                        space();
                    }
                    space();
                    break;
                case 5:
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

    public void StartMenu() {
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


    private Personnage creerMagicien(){
        String persoType = "Magicien";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
        return  new Magicien(persoName);

    }

    private Personnage creerGuerrier(){
        String persoType = "Guerrier";
        System.out.println("Quel sera votre Nom ?");
        String persoName = scanner.nextLine();
       return new Guerrier(persoName);

    }


    private Personnage createPersonnage() {
        System.out.println("Tapez 1 : Magicien | Tapez 2 : Guerrier");
        String persoType;
        String persoName;
        Personnage player;
        int choixTypePerso = getIntInput();
        switch (choixTypePerso) {
            case 1:
                player = creerGuerrier();
                break;
            case 2:
                player = creerMagicien();
            default:
                space();
                affichageErreurMenu();
                space();
                player = null;
                //////////////////////// Fonction recursive : Personnage player = choixPersoMenu(); où un truc du genre
                break;
        }
        return player;
    }

    private int getIntInput() {
        try {
            int r = this.scanner.nextInt();
            this.scanner.nextLine();
            return r;
        } catch (Exception e) {
            space();
            Main.Choupi integer = new Main.Choupi();
            System.out.println(integer.integer());
            System.out.println(integer.please());
            space();
            this.scanner.nextLine();
            return getIntInput();
        }
    }

}

