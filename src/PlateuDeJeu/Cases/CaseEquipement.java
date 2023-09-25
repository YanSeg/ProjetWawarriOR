package PlateuDeJeu.Cases;

import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.EquipementOffensif;
import Equipements.EquipementOff.Sorts.Sorts;
import Equipements.Equipements;
import Equipements.PotionsPoisons.Potions;
import Images.ASCII_Representations;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;
import PlateuDeJeu.ArrayListCases;

import java.util.ArrayList;
import java.util.Collections;

import static MiseEnPage.MiseEnPage.space;
import static PlateuDeJeu.ArrayListCases.arrayDesEquipements;

public class CaseEquipement implements Cases {


    private final String REPRESENTATION = ASCII_Representations.messageEquipement();


    @Override
    public void interact(Personnage player) {

        Equipements equipements = arrayDesEquipements();

        System.out.println(REPRESENTATION);
        System.out.println(equipements);
        System.out.println("HEY");

        if (equipements instanceof Potions) {
            System.out.println("WELL DONE DUDE");
            space();
            int a = equipements.getHealth();
            int b = player.getHealth();
            int h = a + b;
            player.setHealth(h);
            int c = equipements.getStrength();
            int d = player.getStrength();
            int j = c + d;
            player.setStrength(j);
            System.out.println(player);
            space();
        } else if (equipements.isUsable(player)) {
            if (equipements instanceof EquipementOffensif) {
                player.setEquipemenOf(equipements);
                System.out.println("VOUS AVEZ RECUP :");
                space();
                System.out.println(equipements);
            }
            if (equipements instanceof EquipementDefensif) {
                player.setEquipementDef(equipements);
                System.out.println("VOUS AVEZ RECUP :");
                space();
                System.out.println(equipements);
            }

        } else {
            System.out.println("Rien à récupérer pour vous");
        }


    }
}

//    @Override
//    public void interact(Personnage player) {
//
//        ArrayListCases plty = new ArrayListCases();
//        ArrayList<Equipements> arrayListequipement = plty.arrayDesEquipements();
//        Collections.shuffle(arrayListequipement);
//        Equipements equipements = arrayListequipement.get(3);
//
//
//        ASCII_Representations choup = new ASCII_Representations();
//
//        System.out.println(choup.messageEquipement());
//        System.out.println(equipements.getImage());
//        System.out.println("\033[H\033[2J");
//
//        int result = (player.gethealth() - equipements.getHealth());
//        player.setHealth(result);
//
//        System.out.println(player.gethealth());
//
//
//        if (equipements instanceof EquipementOffensif) {
//
//            if ((equipements instanceof Armes) && (player instanceof Guerrier)) {
//                String name = equipements.getName();
//                int force = player.getStrength() + equipements.getStrength();
//                player.setStrength(force);
//            } else if ((equipements instanceof Armes) && (player instanceof Magicien)) {
//                System.out.println("Vous ne pouvez-prendre cette arme Magicien");
//            } else if ((equipements instanceof Sorts) && (player instanceof Magicien)) {
//                String name = equipements.getName();
//                int force = player.getStrength() + equipements.getStrength();
//                player.setStrength(force);
//            } else {
//                System.out.println("Vous ne pouvez-prendre cette arme Guerrier");
//            }
//
//        } else if (equipements instanceof EquipementDefensif) {
//            String name = equipements.getName();
//            int force = player.getStrength() + equipements.getStrength();
//            player.setOffensive(name);
//            player.setStrength(force);
//        } else if (equipements instanceof Potions) {
//            int vie = (player.gethealth() + equipements.getHealth());
//            int force = (player.getStrength() + equipements.getStrength());
//            System.out.println("pour l'instant les points de defense, offensif reste évasif... wait for it");
//        }
//        System.out.println(player);
//
//    }



