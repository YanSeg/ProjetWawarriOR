import java.util.Scanner;

import Personnages.Magiciens.Magicien;
import Personnages.Guerriers.Guerrier;
import images.Choupi;
import javax.swing.*;
import java.awt.*;
import PlateuDeJeu.PlateauJeu;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Plateau de jeu");
        PlateauJeu plateau = new PlateauJeu();
        frame.add(plateau);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

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




