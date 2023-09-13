/*import java.util.Scanner;

public class brouillonMenu {


    Boolean menuDisplay = true;
    Boolean lemenu = false;


    // while(menuDisplay)


      while (menuDisplay) {
        System.out.println("1. Afficher le menu");
        System.out.println("2. Quitter");

        int displayMenu = scanner.nextInt();


        switch (displayMenu) {
            case 1:
                menu = true;
                break;
            case 2:
                menuDisplay = false;
            case 3:
            default:
                System.out.println(" Essaye encore");
                break;
        }


// Là ça lance le menu qui vient en dessous


        while (lemenu) {

            Personnage player = null;
            String persoType;
            String persoName;
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Créer votre personnage");
            System.out.println("2. Modifier votre personnage");
            System.out.println("3. Afficher les paramètres de votre personnage");
            System.out.println("4. Jouer");
            System.out.println("5. Quitter le jeu");


            int choiceMenu = scanner.nextInt();

            switch (choiceMenu) {
                case 1:

                    Scanner createPerso = new Scanner(System.in);
                    int choixTypePerso = scanner.nextInt();

                    switch (choixTypePerso) {


                        System.out.println("1. Magicien");
                        System.out.println("2. Guerrier");
                        case 1:
                            persoType = "Magicien";
                            System.out.println("Quel sera votre Nom ?");
                            persoName = createPerso.nextLine();
                            player = new Personnage(persoType, persoName, 10, 10, "sort", "philtre");

                            break;
                        case 2:

                            persoType = "Guerrier";
                            System.out.println("Quel sera votre Nom ?");
                            persoName = createPerso.nextLine();
                            player = new Personnage(persoType, persoName, 10, 15, "arme", "bouclier");
                            break;

                        default:
                            System.out.println(" Essaye encore");
                            break;
                    }
//


                case 2:
                    if (player != null) {
                        Scanner modifPerso = new Scanner(System.in);
                        int modifPerso = scanner.nextInt();

                        switch (modifPerso) {
                            String persoNewType;
                            String persoNewName;

                            System.out.println("1. Magicien");
                            System.out.println("2. Guerrier");
                            case 1:
                                persoNewType = "Magicien";
                                System.out.println("Quel sera votre Nom ?");
                                persoNewName = createPerso.nextLine();
                                Personnage player = new Personnage(persoType, persoName, 10, 10, "sort", "philtre");

                                break;
                            case 2:
                                persoNewType = "Guerrier";
                                System.out.println("Quel sera votre Nom ?");
                                persoNewName = createPerso.nextLine();
                                Personnage player = new Personnage(persoType, persoName, 10, 15, "arme", "bouclier");
                                break;

                            default:
                                System.out.println(" Essaye encore");
                                break;
                        }
                    } else {
                        System.out.println(" Veuillez créer votre personnage en Premier");
                    }


                case 3:
                    if (player != null) {
                        System.out.println(player);
                        break;
                    } else {
                        System.out.println(" Veuillez créer votre personnage en Premier");
                    }
                case 4:
                    jeuDe();
                    ;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println(" Essaye encore");
                    break;
            }


        }


    }
}
    System.out.println("Fin du jeu.");
            Scanner letPlay=new scanner;



*/

