package PlateuDeJeu.Cases;

import Ennemis.Ennemi;
import Personnages.Personnage;
import Images.Choupi;
import PlateuDeJeu.PlateauJeu;

import java.util.*;
import java.util.Collections;


public class CaseEnnemi implements Cases {


    @Override
    public void interact(Personnage player) {

        PlateauJeu plty = new PlateauJeu();
        ArrayList<Ennemi> arrayListEnnemi = plty.arrayDesEnnemis();
        Collections.shuffle(arrayListEnnemi);
//        Ennemi sylvie = arrayListEnnemi(Ennemi[0]);
        Ennemi ennemiRandom = arrayListEnnemi.get(3);



       Choupi choup = new Choupi();
//String image = choup.citrouille();


        System.out.println(choup.messageEnnemi());
        System.out.println("\033[H\033[2J");

        // LucklSkywalker luck = new LucklSkywalker();
//        Sylvitrouille sylvie = new Sylvitrouille();

//        System.out.println(" Attention mécréant, vous êtes face à " + sylvie.getName() + "!!!!!!!");
        System.out.println("\033[H\033[2J");
        System.out.println(ennemiRandom.getImage());
        System.out.println("\033[H\033[2J");

      int result = (player.gethealth() - ennemiRandom.getHealth());
     player.setHealth(result);
        System.out.println(player.gethealth());

    }
}

