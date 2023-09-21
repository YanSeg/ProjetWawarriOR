package PlateuDeJeu.Cases;

import Ennemis.Dragons.Dragon;
import Ennemis.Ennemi;
import Images.Choupi;
import Personnages.Personnage;
import PlateuDeJeu.PlateauJeu;

import java.util.ArrayList;
import java.util.Collections;

public class CaseDragon implements Cases {

    @Override
    public void interact(Personnage player) {

        PlateauJeu plty = new PlateauJeu();
        ArrayList<Dragon> arrayListDragon = plty.arrayDesDragons();
        Collections.shuffle(arrayListDragon);

        Dragon dragon = arrayListDragon.get(3);


        Choupi choup = new Choupi();
        System.out.println(choup.dragonCaseMessage());

        for (int i = 0; i < 2; i++) {
            System.out.println("\033[H\033[2J");
            System.out.println(dragon);
            System.out.println("\033[H\033[2J");
            System.out.println("Vous l'attaquez en premier à chaque tour");
            System.out.println("\033[H\033[2J");
            int attaques = player.getStrength() - dragon.getHealth();
            dragon.setHealth(attaques);
            System.out.println(dragon);
            int result = (player.gethealth() - dragon.getStrength());
            player.setHealth(result);
            System.out.println(player.evolutionPartie());
        }

    if (player.gethealth()<0){
        System.out.println("Vous êtes mort");
         player = null;
  
        }
    }


}