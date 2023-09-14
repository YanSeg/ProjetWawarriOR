import Personnages.Personnage;
import Personnages.Magiciens.Magicien;
import Personnages.Guerriers.Guerrier;
import images.Choupi;

import java.util.InputMismatchException;

import java.util.Scanner;


public class Menu {

    private final Scanner scanner;

    public Menu() {
        // System.out.println("Je suis le constructeur");
        this.scanner = new Scanner(System.in);
    }

    public void space() {
//
        System.out.println("\033[H\033[2J");
//
    }


    public void affichageErreurMenu() {
        space();
        System.out.println("Merci de commencer par créer votre personnage");

    }


//    public void jouerauJeu(Personnage player) {
//
//        if (player != null) {
//            jeuDe();
//        } else {
//            affichageErreurMenu();
//        }
//
//
//    }

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


    public void findugameMessage() {

        System.out.println(" __Fin du jeu__.");
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


    public void menu2() {

        boolean lemenu = true;

//        Scanner scanner = new Scanner(System.in);

        Personnage player = null;

        while (lemenu) {

            System.out.println("1. Créer votre personnage");

            System.out.println("2. Modifier votre personnage");
            System.out.println("3. Afficher les paramètres de votre personnage");
            System.out.println("4. Jouer");
            System.out.println("5. Quitter le menu du jeu");

            boolean entierValide = false;
            while (!entierValide) {

                try {
                    int choiceMenu = scanner.nextInt();
                    switch (choiceMenu) {

                        case 1:

                            System.out.println("Tapez 1 : Magicien | Tapez 2 : Guerrier");
                            int choixTypePerso = scanner.nextInt();
                            String persoType;
                            String persoName;
                            switch (choixTypePerso) {
                                case 1:
                                    Scanner question = new Scanner(System.in);
                                    persoType = "Magicien";
                                    System.out.println("Quel sera votre Nom ?");
                                    persoName = question.nextLine();
                                    player = new Magicien(persoName, persoType, 10, 15, "sort", "philtre");
                                    break;
                                case 2:
                                    Scanner question2 = new Scanner(System.in);
                                    persoType = "Guerrier";
                                    System.out.println("Quel sera votre Nom ?");
                                    persoName = question2.nextLine();
                                    player = new Guerrier(persoName, persoType, 10, 6, "arme", "bouclier");
                                    break;

                                default:
                                    space();
                                    affichageErreurMenu();
                                    space();
                                    break;
                            }
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
                            // Là il y a la logique du jeu ce qui est à revoir, je pense que je vais le sortir de là (mettre un retrun par exemple pour que le programme continue)
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
                } catch (InputMismatchException e) {
                    space();
                    System.out.println("Vous devez entrer un entier.");
                    scanner.next(); // Permet d'ignorer la saisie incorrecte
                    space();
                }
                entierValide = true;
            }

        }
    }

    public void strartRestart() {
        boolean menuDisplay = true;
//        Scanner scanner = new Scanner(System.in);

        while (menuDisplay) {

            System.out.println("1. Accéder au Menu");
            System.out.println("2. Quitter");

            int choice = getIntInput();
          //  System.out.println("You chose "+choice);
            switch (choice) {
                case 1:
                    menu2();
                    break;
                case 2:
                    menuDisplay = false;
                    break;
                default:
                    affichageErreurMenu();
                    break;
            }

            //            boolean entierValide = false;
//            while (!entierValide) {
//
//                try {
//                    int displayMenu = scanner.nextInt();
//                    // recupere un entier
//                    scanner.next(); // vide les données restantes
//                    switch (displayMenu) {
//                        case 1:
//                            menu2();
//                            menuDisplay = false;
//                            break;
//                        case 2:
//                            menuDisplay = false;
//                            break;
//                        default:
//                            affichageErreurMenu();
//                            break;
//                    }
//                } catch (InputMismatchException e) {
//
//                    System.out.println("Vous devez entrer un entier.");
//                    scanner.next(); // Permet d'ignorer la saisie incorrecte sans faire une boucle infinie de *****
//                }
//                entierValide = true;
//            }
        }
    }

    private int getIntInput() {
        try {
            int r = this.scanner.nextInt();
            this.scanner.nextLine();
            return r;
        } catch (Exception e) {
            space();
            Choupi integer = new Choupi();
            System.out.println(integer.integer());
            System.out.println(integer.please());
            space();
            this.scanner.nextLine();
            return getIntInput();
        }
    }

}
