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
import PlateuDeJeu.PlateauDuJeu;

import java.util.ArrayList;
import java.util.Collections;

public class CaseSurprise implements Cases {
    @Override
    public void interact(Personnage player, PlateauDuJeu plateauDuJeu) {

    }
}





//        ArrayListCases plty = new ArrayListCases();
//        ArrayList<Equipements> arrayLisSurprise = plty.arrayDesEquipements();
//        Collections.shuffle(arrayLisSurprise);
//
//        Equipements equipements = arrayLisSurprise.get(3);


//        ASCII_Representations choup = new ASCII_Representations();
//        System.out.println(choup.dragonCaseMessage());


//        System.out.println("\033[H\033[2J");
//        System.out.println(equipements);
//        System.out.println("\033[H\033[2J");
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
//            int vie = (player.getHealth() + equipements.getHealth());
//            int force = (player.getStrength() + equipements.getStrength());
//            System.out.println("pour l'instant les points de defense, offensif reste évasif... wait for it");
//        }
//        System.out.println(player);
//
//    }




