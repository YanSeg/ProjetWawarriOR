//import Enum.EnnemisEnnum.EnnemiEnum;
import Ennemis.Ennemi;
import Enum.EnnemisEnum.enumEnnemi;


public class Main {
    public static void main(String[] args) {



        enumEnnemi ennemiEnum = enumEnnemi.DRAGON;

        Ennemi randomSorcier = ennemiEnum.getRandomEnnemi();

        ennemiEnum.displayrandomEnum(randomSorcier);



      //  EnnemiEnum.DRAGON.getRandomEnnemi();

        Menu menu = new Menu();


        menu.space();

        menu.StartMenu();


//        choupi.imageChoupi();
//        menu.space();
//        System.out.println(choupi.imageChoupi());
//        menu.space();


    }
}




