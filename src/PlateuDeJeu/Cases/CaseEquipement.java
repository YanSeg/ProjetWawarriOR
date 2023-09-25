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

public class CaseEquipement implements Cases{
    @Override
    public void interact(Personnage player ) {

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

}

