package PlateuDeJeu.Cases;

import Ennemis.Ennemi;
import Enum.EnnemisEnum.enumEnnemi;
import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.EquipementOffensif;
import Equipements.Equipements;
import Personnages.Personnage;
import Images.ASCII_Representations;
import PlateuDeJeu.ArrayListCases;

import java.awt.*;
import java.util.*;
import java.util.Collections;

import static Game.Game.lancementDuddE;
import static MiseEnPage.MiseEnPage.space;


public class CaseEnnemi implements Cases {


//    private final Scanner scanner = new Scanner(System.in);

//    public int getIntInput() {
//        try {
//            int r = this.scanner.nextInt();
//            this.scanner.nextLine(); // Permet d'écraser le scanner pour ne pas avoir une boucle infinie.
//            return r;
//        } catch (Exception e) {
//            space();
//            ASCII_Representations integer = new ASCII_Representations();
//            System.out.println(integer.integer());
//            System.out.println(integer.please());
//            space();
//            this.scanner.nextLine();
//            return getIntInput();
//        }
//    }

    @Override

    public void interact(Personnage player) {

    }
//
//        boolean fightMenu = true;
//
//        while (fightMenu) {
//            System.out.println("1. Se battre");
//            System.out.println("2. Reculer d'un nombre de case alétoire ");
//            int choice = getIntInput();
//
//            switch (choice) {
//                case 1:
//                    int a = player.getStrength();
//                    Equipements arme = player.getEquipemenOf(); int b = arme.getStrength();
//                    int forceAttaque = a+b;
//
//                    break;
//                case 2:
//                    int a = player.getPosition() -  lancementDuddE();
//                    player.getPosition(a);
//                    fightMenu = false;
//
//
//                    break;
//                default:
//                    break;
//            }
//        }
    }


