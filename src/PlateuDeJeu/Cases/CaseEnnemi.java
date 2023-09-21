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
        ArrayList<Ennemi> arrayListEnnemis = plty.arrayDesEnnemis();
        Collections.shuffle(arrayListEnnemis);
        Ennemi ennemiRandom = arrayListEnnemis.get(3);



       Choupi choup = new Choupi();

        System.out.println(choup.messageEnnemi());
        System.out.println("\033[H\033[2J");

        System.out.println("\033[H\033[2J");
        System.out.println(ennemiRandom.getImage());
        System.out.println("\033[H\033[2J");

      int result = (player.gethealth() - ennemiRandom.getHealth());
     player.setHealth(result);
     System.out.println(player.gethealth());

    }
}

