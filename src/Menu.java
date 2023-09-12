public class Menu {


    public void direBonjourAvecSwitch(int choix){

        switch(choix){

            case 1:
                System.out.println("Bonjour");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Buenos dias");
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }

    }

/* PAs encore réussi à faire une fonction avec cela

    public void magiGuerr () {
        if (userType.equals("Magicien")) {
            Test = new Personnage(userType, userName, 10, 10, "sort", "philtre");

        } else {
            Test = new Personnage(userType, userName, 10, 15, "arme", "bouclier");

        }
    }
*/

    public void finish () {
        System.out.println("Au revoir, on joue à donjon et dragon ici");
        return;
    }
public Menu () {
   // System.out.println("Je suis le constructeur");
}








}
