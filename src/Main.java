import Game.Game;
import Images.Choupi;
import PlateuDeJeu.Cases.Cases;

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
//
//        PlateauJeu plty = new PlateauJeu();
//
//        ArrayList<Ennemi> arrayListEnnemi = plty.arrayDesEnnemis();
////        Ennemi ennemi = new Ennemi();
//
//
//        //
//        System.out.println(arrayListEnnemi.size());
//
//        for(Ennemi object : arrayListEnnemi){
//            System.out.println(object.getDefensive());
//            System.out.println(object.getImage());
//
//        }

//

       // arrayListEnnemi.forEach(System.out::println);

//        System.out.println(arrayListEnnemi.toString());

//        for (int i =0; i <arrayListEnnemi.size(); i++){
//            System.out.println(arrayListEnnemi.toString());
//        }

//        arrayListEnnemi.forEachforEach(Consumer<E> action);




        Game game = new Game();
        Menu menu = new Menu();
        Choupi choupi = new Choupi();

//        LuckSkywalker luck = new LuckSkywalker();
//        System.out.println(luck);


            menu.space();

            menu.StartMenu();

        ArrayList<Cases> plateau = new ArrayList<Cases>();

        choupi.imageChoupi();
        menu.space();
        System.out.println(choupi.imageChoupi());
        menu.space();


    }
}




