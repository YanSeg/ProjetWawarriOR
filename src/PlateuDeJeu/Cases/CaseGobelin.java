package PlateuDeJeu.Cases;

import Ennemis.Ennemi;
import Ennemis.Gobelin.Gobelin;
import Images.Choupi;
import Personnages.Personnage;
import PlateuDeJeu.PlateauJeu;

import java.util.ArrayList;
import java.util.Collections;

public class CaseGobelin implements Cases{
    @Override
    public void interact(Personnage player) {

        PlateauJeu plty = new PlateauJeu();
        ArrayList<Gobelin> arrayListEnnemis = plty.arrayDesGobelins();
        Collections.shuffle(arrayListEnnemis);
        Ennemi ennemiRandom = arrayListEnnemis.get(3);



        Choupi choup = new Choupi();

        System.out.println(choup.messageGobelin());
        System.out.println(ennemiRandom);
        System.out.println("\033[H\033[2J");

        System.out.println("Vous attaquez en premier");

        int attaque = (player.getStrength()- ennemiRandom.getHealth());
        ennemiRandom.setHealth(attaque);
        if (ennemiRandom.getHealth()<0){
            System.out.println("Vous Gagnez ce combat");
        }else {
            int result = (player.gethealth() - ennemiRandom.getStrength());
            player.setHealth(result);
            System.out.println(player.gethealth());
        }
        if (player.gethealth()<0){
            System.out.println("Vous êtes mort");
            player = null;

        }
    }
}

