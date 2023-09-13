import Personnages.Personnage;
import Personnages.Magiciens.Magicien;
import Personnages.Guerriers.Guerrier;
import java.util.Scanner;

public class Menu {


    public Menu() {
        // System.out.println("Je suis le constructeur");
    }

    public void space() {
//
        System.out.println("\033[H\033[2J");
//
    }

    public void jeuDe() {

        int position = 1;

        while (position < 64) {
            int de = (int) (1 + 6 * Math.random());
            position = position + de;

            System.out.println("Vous êtes à la position ;" + position);
            System.out.println("Votre lancé est de " + de);

        }
    }

    public void affichageErreurMenu() {
        space();
        System.out.println("Merci de commencer par créer votre personnage");

    }


    public void jouerauJeu(Personnage player) {

        if (player != null) {
            jeuDe();
        } else {
            affichageErreurMenu();
        }


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


    public void findugameMessage() {
        System.out.println("Fin du jeu.");
    }


    public void menu2() {

        boolean lemenu = true;
        Scanner scanner = new Scanner(System.in);
        Personnage player = null;
        while (lemenu) {

            System.out.println("1. Créer votre personnage");
            System.out.println("2. Modifier votre personnage");
            System.out.println("3. Afficher les paramètres de votre personnage");
            System.out.println("4. Jouer");
            System.out.println("5. Quitter le jeu");

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
                            player = new Magicien (persoName, persoType, 10, 15, "sort", "philtre");
                            break;
                        case 2:
                            Scanner question2 = new Scanner(System.in);
                            persoType = "Guerrier";
                            System.out.println("Quel sera votre Nom ?");
                            persoName = question2.nextLine();
                            player = new Guerrier (persoName, persoType, 10, 6, "arme", "bouclier");
                            break;

                        default:
                            space();
                            affichageErreurMenu();
                            break;
                    }
                    break;


                case 2:
                    if (player != null) {
                        Scanner question3 = new Scanner(System.in);
                        String persoNewName;
                        System.out.println("Choisissez un nouveau Nom");
                        persoNewName = question3.nextLine();
                        player.setName(persoNewName);

                    } else {
                        affichageErreurMenu();
                    }
                    break;
                case 3:
                    affichageduPersonnage(player);
                    break;
                case 4:
                    jouerauJeu(player);
                    break;

                case 5:
                    lemenu = false;
                    space();
                    break;

                default:
                    affichageErreurMenu();
            }

        }

    }


    public void strartRestart() {

        boolean menuDisplay = true;
        Scanner scanner = new Scanner(System.in);

        while (menuDisplay) {
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");
            int displayMenu = scanner.nextInt();
            switch (displayMenu) {
                case 1:
                    menuDisplay = false;
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


}
