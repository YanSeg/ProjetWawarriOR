package PlateuDeJeu.Cases;

import Equipements.Equipements;
import Equipements.PotionsPoisons.Potions;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.ArrayListCases;

import java.util.ArrayList;
import java.util.Collections;

public class CasePetitePotion extends CaseEquipement{
    private final String REPRESENTATION = ASCII_Representations.messagePotion();

    @Override
    public void interact(Personnage player) {

        ArrayListCases plty = new ArrayListCases();
        ArrayList<Potions> arrayListEnnemis = plty.arrayDesPetitesPotions();
        Collections.shuffle(arrayListEnnemis);
        Potions ennemiRandom = arrayListEnnemis.get(3);


        ASCII_Representations choup = new ASCII_Representations();


        System.out.println("\033[H\033[2J");

        System.out.println("\033[H\033[2J");
        System.out.println(ennemiRandom.getImage());
        System.out.println("\033[H\033[2J");

        int result = (player.getHealth() - ennemiRandom.getHealth());
        player.setHealth(result);
        System.out.println(player.getHealth());

    }

}
