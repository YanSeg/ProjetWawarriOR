import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boolean menuDisplay = true;
        Boolean lemenu = false;
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in); // Initialisation du scanner

        while (menuDisplay) {

            System.out.println("1. Start");
            System.out.println("2. Quitter");
            int displayMenu = scanner.nextInt();

            switch (displayMenu) {
                case 1:
                    lemenu = true;
                    menuDisplay = false;
                    break;
                case 2:
                    menuDisplay = false;
                    lemenu = false;
                default:
                    System.out.println(" Essaye encore");
                    break;
            }


            // Deuxieme méthode

            menu.tuvasvoir();
            Personnage player = null;

            while (lemenu) {

                menu.tuvasvoir();
                String persoType;
                String persoName;

                System.out.println("1. Créer votre personnage");
                System.out.println("2. Modifier votre personnage");
                System.out.println("3. Afficher les paramètres de votre personnage");
                System.out.println("4. Jouer");
                System.out.println("5. Quitter le jeu");

                int choiceMenu = scanner.nextInt();

                switch (choiceMenu) {

                    case 1:

                        Scanner createPerso = new Scanner(System.in);
                        // Scanner modifNamePerso = new Scanner(System.in);
                        System.out.println("1. Magicien");
                        System.out.println("2. Guerrier");

                        int choixTypePerso = scanner.nextInt();


                        switch (choixTypePerso) {
                            case 1:
                                persoType = "Magicien";
                                System.out.println("Quel sera votre Nom ?");
                                persoName = createPerso.nextLine();
                                player = new Personnage(persoName, persoType, 10, 10, "sort", "philtre");
                                break;
                            case 2:
                                persoType = "Guerrier";
                                System.out.println("Quel sera votre Nom ?");
                                persoName = createPerso.nextLine();
                                player = new Personnage(persoName, persoType, 10, 15, "arme", "bouclier");
                                break;

                            default:
                                System.out.println(" Essaye encore");
                                break;
                        }
                        break;


                    case 2:
                        if (player != null) {
                            Scanner modiPerso = new Scanner(System.in);
                            String persoNewName;
                            System.out.println("Choisissez un nouveau Nom");
                            persoNewName = modiPerso.nextLine();
                            player.setName(persoNewName);

                        } else {
                            System.out.println(" Veuillez créer votre personnage avant de le modifier ...");

                        }
                        break;
                    case 3:
                        if (player != null) {
                            menu.tuvasvoir();
                            System.out.println(player);
                        } else {
                            menu.tuvasvoir();
                            System.out.println(" Veuillez créer votre personnage en Premier");

                        }
                        break;
                    case 4:
                        menu.jeuDe();
                        ;
                    case 5:
                        menuDisplay = true;
                        lemenu = false;
                        break;

                    default:
                        System.out.println(" Essaye encore");
                        break;
                }


            }


        }


        System.out.println("Fin du jeu.");
        // Scanner letPlay = new scanner;
    }

}


