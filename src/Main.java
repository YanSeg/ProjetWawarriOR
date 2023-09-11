import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Magicien ou Guerrier ?");

        String userType = scanner.nextLine();  // Read user input


        System.out.println("Vous avez choisis un : " + userType);

        //Scanner Name = new Scanner(System.in);
        System.out.println("Quel est son nom?");
        String userName = scanner.nextLine();
        System.out.println("Votre " + userType + " s'appelle " + userName);
        Personnage Test;
        if (userType.equals("Magicien")) {
            Test = new Personnage(userType, userName, 10, 10, "sort", "philtre");
           // System.out.println( Test);
        } else {
            Test = new Personnage(userType, userName, 10, 15, "arme", "bouclier");

        }
        System.out.println( Test);

    }
}