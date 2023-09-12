import java.util.Scanner;

public class Menu {


    public Menu() {
        // System.out.println("Je suis le constructeur");
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

    /*
    public Personnage NewPlayer() {
        return new Personnage();
    }
*/

    public void game(Boolean jouer) {

        if (jouer = true) {
            jeuDe();
        } else {

        }
    }


    public void exitGame() {
        System.out.println("Fin du jeu.");
    }


    public void setMagicien(Personnage player, String userName) {
        player.setType("magicien");
        player.setName(userName);
        player.setDefensive("philtre");
        player.setHealth(10);
        player.setStrength(10);
        player.setOffensive("sort");
    }

    public void setGuerrier(Personnage player, String userName) {
        player.setType("Guerrier");
        player.setName(userName);
        player.setDefensive("bouclier");
        player.setHealth(10);
        player.setStrength(15);
        player.setOffensive("arme");
    }


    public Personnage updatePlayer(Personnage player) {
        System.out.println("1. Créer votre personnage");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Magicien ou Guerrier ?");
        String userType = scanner.nextLine();
        userType = scanner.toLowerCase();
        //System.out.println(scanner);

        if (userType.equals("magicien")) {
            setMagicien(player, userName);
        } else {
            setGuerrier(player, userName);
        }
        return player;
    }


    public Personnage createPersonnage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Magicien ou Guerrier ?");
        String userType = scanner.nextLine();
        userType = userType.toLowerCase();
        System.out.println(userType);
        return player;
    }

    public String typeChoice (){
       int parametre;
       Srting userType;
        while (parametre) {
            System.out.println("1. Guerrier");
            System.out.println("2. Magicien");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1: userType = "Guerrier"
                case 2 :
                default:
                    System.out.println(" !!!!!!!!! Option invalide !!!!!!!!!!!!!!!");
                    break;

            }

    }


    public void errorMessage() {
        System.out.println("----------------------------------------");
        System.out.println("Vous avez commis une erreur dans le type");
        System.out.println("----------------------------------------");
    }

}
//    public Personnage(String type, String name) {
//      this.type = type;
//       this.name = name;
//   }

    public controleTexte() {

    }