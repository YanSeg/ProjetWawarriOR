package PlateuDeJeu.Cases;

import Ennemis.Ennemi;
import Ennemis.Gobelin.Gobelin;
import Images.Choupi;
import Personnages.Personnage;
import PlateuDeJeu.PlateauJeu;

import java.util.ArrayList;
import java.util.Collections;

public class CasePoison implements Cases {

    @Override
    public void interact(Personnage player) {

        PlateauJeu plty = new PlateauJeu();
        ArrayList<Gobelin> arrayListEnnemis = plty.arrayDesGobelins();
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
