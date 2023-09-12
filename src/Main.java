import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        boolean jouer = true;

        while (jouer) {

            Personnage Test = new Personnage();
            String userType = "";
            String userName = "";
            Menu menu = new Menu();
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            //boolean parametros;
            boolean parametros1 = true;
            boolean parametros2;


            // Ma condition 3 !!!!
            while (parametros1) {
                System.out.println("1. Créer votre personnage");
                System.out.println("2. Quitter le jeu");

                int choix1 = scanner.nextInt();

                switch (choix1) {
                    case 1:
                        Scanner prems = new Scanner(System.in);
                        System.out.println("Magicien ou Guerrier ?");
                        userType = prems.nextLine();
                        userType = userType.toLowerCase();
                        System.out.println(userType);

                        if (userType.equals("magicien") || userType.equals("guerrier")) {
                            System.out.println("Quel sera votre Nom ?");
                            userName = prems.nextLine();
                            // System.out.println("Vous avez choisis un : " + userType);

                            if (userType.equals("magicien")) {
                                Test.setType("magicien");
                                Test.setName(userName);
                                Test.setDefensive("philtre");
                                Test.setHealth(10);
                                Test.setStrength(10);
                                Test.setOffensive("sort");

                                // System.out.println( Test);
                                // System.out.println( Test);
                            } else {
                                Test.setType("Guerrier");
                                Test.setName(userName);
                                Test.setDefensive("bouclier");
                                Test.setHealth(10);
                                Test.setStrength(15);
                                Test.setOffensive("arme");
                            }
                            parametros1 = false;
                        } else {
                            System.out.println("_________________________________");
                            System.out.println("Paramètre incorrecte, recommencez");
                            System.out.println("_________________________________");

                            break;
                        }

                    case 2:
                        jouer = false;
                        parametros1 = false;
                        break;


                    default:
                        System.out.println(" !!!!!!!!! Option invalide !!!!!!!!!!!!!!!");
                        break;

                }
            }

            if (jouer) {
                parametros2 = false;
            } else {
                parametros2 = true;
            }


            // Ma condition 3 !!!!
            while (parametros2) {
                System.out.println("1. Let's GO jeune " + userType + ": " + userName + "  ? ");
                System.out.println("2. Afficher les paramètres du Personnage");
                System.out.println("3. Changer les parametres");
                System.out.println("4. Quitter le jeu");
                System.out.print("Choisissez une option : ");

                int choix2 = scanner.nextInt();

                switch (choix2) {
                    case 1:
                        System.out.println("Bon ON JOUE   ? ");
                        parametros2 = false;
                        break;
                    case 2:
                        System.out.println(Test);
                        break;
                    case 3:
                        Scanner deus = new Scanner(System.in);
                        System.out.println("A vous de choisir : Magicien ou Guerrier ?");
                        //Scanner deuxieme = new Scanner(System.in);
                        userType = deus.nextLine();
                        userType = userType.toLowerCase();
                        System.out.println(userType);
                        System.out.println("Quel sera votre Nom ?");
                        userName = deus.nextLine();
                        // System.out.println("Vous avez choisis un : " + userType);


                        if (userType.equals("magicien")) {
                            Test.setType("magicien");
                            Test.setName(userName);
                            Test.setDefensive("philtre");
                            Test.setHealth(10);
                            Test.setStrength(10);
                            Test.setOffensive("sort");

                            // System.out.println( Test);
                            // System.out.println( Test);
                        } else {
                            Test.setType("Guerrier");
                            Test.setName(userName);
                            Test.setDefensive("bouclier");
                            Test.setHealth(10);
                            Test.setStrength(15);
                            Test.setOffensive("arme");
                        }
                        break;

                    case 4:
                        parametros2 = false;
                        break;
                    default:
                        System.out.println(" !!!!!!!!! Option invalide !!!!!!!!!!!!!!!");
                        break;
                }

            }
        }
        //// Là les des

        int position = 1;

        while (position < 64) {
            int de = (int) (1 + 6 * Math.random());
            position = position + de;
            System.out.println("Vous êtes à la position ;" + position);
                    System.out.println("Votre lancé est de " + de);

        }

        System.out.println("Fin du jeu.");
    }

}



