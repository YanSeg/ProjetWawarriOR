import Game.Game;
import Images.Choupi;
import PlateuDeJeu.Cases.Cases;
import Ennemi.LucklSkywalker;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//
//        JFrame frame = new JFrame("Plateau de jeu");
//        PlateauJeu plateau = new PlateauJeu();
//        frame.add(plateau);
//        frame.setSize(400, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);


       // System.out.println(testEnum.SOIR);

        Game game = new Game();
        Menu menu = new Menu();
        Choupi choupi = new Choupi();

        LucklSkywalker luck = new LucklSkywalker();
        System.out.println(luck);


            menu.space();

            menu.StartMenu();

        ArrayList<Cases> plateau = new ArrayList<Cases>();

        choupi.imageChoupi();
        menu.space();
        System.out.println(choupi.imageChoupi());
        menu.space();


    }
}




