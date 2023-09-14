import java.util.Scanner;

import Personnages.Magiciens.Magicien;
import Personnages.Guerriers.Guerrier;
import images.Choupi;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Menu menu = new Menu();
        Choupi choupi = new Choupi();

        menu.space();

        menu.strartRestart();


//        menu.space();
//        System.out.println(choupi.welcome());
//        menu.space();


      //  menu.menu2();




        menu.space();
        System.out.println(choupi.imageChoupi());
        menu.space();


    }
}




