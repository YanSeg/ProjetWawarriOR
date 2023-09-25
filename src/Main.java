//import Enum.EnnemisEnnum.EnnemiEnum;
import Ennemis.Ennemi;
import Enum.EnnemisEnum.enumEnnemi;

import java.util.ArrayList;
import java.util.Arrays;

import static MiseEnPage.MiseEnPage.space;


public class Main {
    public static void main(String[] args) {

//
        enumEnnemi ennemiEnum = enumEnnemi.DRAGON;

        Ennemi randomSorcier = ennemiEnum.getRandomEnnemi();

        ennemiEnum.displayrandomEnum(randomSorcier);



//        EnnemiEnum.DRAGON.getRandomEnnemi();

        Menu menu = new Menu();


        space();

        menu.StartMenu();


//        choupi.imageChoupi();
//        menu.space();
//        System.out.println(choupi.imageChoupi());
//        menu.space();


    }
}




