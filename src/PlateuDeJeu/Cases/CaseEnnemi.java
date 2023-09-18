package PlateuDeJeu.Cases;

import Ennemi.LucklSkywalker;
import Personnages.Personnage;
import Ennemi.Sylvitrouille;
import Images.Choupi;

import java.awt.*;


public class CaseEnnemi implements Cases {


    @Override
    public void interact(Personnage player) {

Choupi choup = new Choupi();
String image = choup.citrouille();


        System.out.println("La case 2");
        System.out.println("\033[H\033[2J");

        // LucklSkywalker luck = new LucklSkywalker();
        Sylvitrouille sylvie = new Sylvitrouille();

        System.out.println(" Attention mécréant, vous êtes face à " + sylvie.getName() + "!!!!!!!");
        System.out.println("\033[H\033[2J");
        System.out.println(sylvie.getImage());
        System.out.println("\033[H\033[2J");

        int result = (player.gethealth() - sylvie.getHealth());
        player.setHealth(result);
        System.out.println(player.gethealth());

    }
}

