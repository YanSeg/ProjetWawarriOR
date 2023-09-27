package PlateuDeJeu.Cases;

import Ennemis.Ennemi;
import Ennemis.Sorciers.Sorcier;
import Images.ASCII_Representations;

import static PlateuDeJeu.ArrayListCases.getRandomSorciers;

public class CaseSorcier extends Ennemi {

    Sorcier sorcier = getRandomSorciers();
    private final String REPRESENTATION = ASCII_Representations.messageSorcier();


}
//        Sorcier sorcier = new Sorcier();


//        ArrayListCases plty = new ArrayListCases();
//        ArrayList<Sorcier> arrayListeSorcier = plty.arrayDesSorciers();
//        Collections.shuffle(arrayListeSorcier);
//        Sorcier sorcier = arrayListeSorcier.get(3);
//        ASCII_Representations choup = new ASCII_Representations();
//        System.out.println(choup.messageSorcier());
//
//
//
//
//        }
//        System.out.println("\033[H\033[2J");
//        System.out.println(sorcier);
//        System.out.println("\033[H\033[2J");
//        System.out.println("Vous l'attaquez en premier à chaque tour");
//        System.out.println("\033[H\033[2J");
//
//        int attaques = player.getStrength() - sorcier.getHealth();
//        sorcier.setHealth(attaques);
//        System.out.println(sorcier);
//        int result = (player.getHealth() - sorcier.getStrength());
//        player.setHealth(result);
//        System.out.println(player.evolutionPartie());
//
//
//        if (player.getHealth() < 0) {
//            System.out.println("Vous êtes mort");
//            player = null;




