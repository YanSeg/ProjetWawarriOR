package PlateuDeJeu;

import Ennemis.Dragons.Dragon;
import Ennemis.Sorciers.Sorcier;
import Equipements.Equipements;
import Equipements.PotionsPoisons.Potions;
import PlateuDeJeu.Cases.CaseVide;
import PlateuDeJeu.Cases.Cases;

import java.util.ArrayList;

import static PlateuDeJeu.ArrayListCases.*;
import static PlateuDeJeu.ArrayListCases.getRandomEquipement;

public class BoardFactory {


    public static ArrayList<Cases> createPlateauList() {

        ArrayList<Cases> plateauList = new ArrayList<>();

        for (int i = 0; i < 64; i++) {
            plateauList.add(new CaseVide());
        }

        int[] casesDragonsS = {45, 52, 56, 62};
        for (int caseDragon : casesDragonsS) {
            Dragon dragon = getRandomDragon();
            plateauList.set(caseDragon, dragon);
        }

        int[] caseSorciersS = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
        for (int caseSorcier : caseSorciersS) {
            Sorcier sorcier = getRandomSorciers();
            plateauList.set(caseSorcier, sorcier);
        }
        int[] casePotions = {7, 13, 31, 33, 39, 43};
        for (int casepotion : casePotions) {
            Potions potion = getRandomPotion();
            plateauList.set(casepotion, potion);

        }
        int[] caseGrandePotions = {28, 41};
        for (int caseGrandePotion : caseGrandePotions) {
            Potions grandepotion = getRadomGrandePotion();
            plateauList.set(caseGrandePotion, grandepotion);
        }
        int[] casesCaissesSurprises = {2, 11, 5, 22, 38, 19, 26, 42, 53, 1, 4, 8, 17, 23, 48, 49, 7, 13, 31, 33, 39, 43, 28, 41};
        for (int caseCaisseSurprise : casesCaissesSurprises) {
            Equipements equipements = getRandomEquipement();
            plateauList.set(caseCaisseSurprise, equipements);
        }
        return plateauList;
    }

}