package PlateuDeJeu;

import Ennemis.Dragons.Dragon;
import Ennemis.Ennemi;
import Ennemis.Gobelin.Gobelin;
import Ennemis.Sorciers.Sorcier;
import Equipements.Equipements;
import Equipements.PotionsPoisons.Potions;

import java.util.ArrayList;

import static PlateuDeJeu.ArrayListCases.*;
import static PlateuDeJeu.ArrayListCases.getRandomEquipement;
import static PlateuDeJeu.ArrayListCases.getRadomGrandePotion;




public class BoardFactory {


    public static Cases[] plateaClassique() {


        {
            Cases[] plateau = new Cases[64];
            for (int i = 0; i < 64; i++) {
                plateau[i] = new CaseEmpty();
            }
            int[] casesDragonsS = {45, 52, 56, 62};
            for (int caseDragon : casesDragonsS) {
                Ennemi dragon = getRandomDragon();
                plateau[caseDragon] = dragon;
            }
            int[] caseSorciersS = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
            for (int caseSorcier : caseSorciersS) {
                Ennemi sorcier = getRandomSorciers();
                plateau[caseSorcier] = sorcier;
            }
            int[] caseGobelinsS = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
            for (int caseGobelin : caseGobelinsS) {
                Ennemi gobelin = getRandomGoblin();
                plateau[caseGobelin] = gobelin;
            }
            int[] casePotionS = {7, 13, 31, 33, 39, 43,};
            for (int casePotion : casePotionS) {
                Potions potion = getRandomPotion();
                plateau[casePotion] = potion;
            }
            int[] caseGrandePotionS = {28,41};
            for (int caseGrandePotion : caseGrandePotionS) {
                Potions potion = getRadomGrandePotion();
                plateau[caseGrandePotion] = potion;
            }


            int[] casesCaissesSurprises = {2, 11, 5, 22, 38, 19, 26, 42, 53, 1, 4, 8, 17, 23, 48, 49};
            for (int caseCaisseSurprise : casesCaissesSurprises) {

                Equipements equipements = getRandomEquipement();

                plateau[caseCaisseSurprise] = equipements;
            }
            return plateau;
        }

    }


    public static ArrayList<Cases> createPlateauList() {

        ArrayList<Cases> plateauList = new ArrayList<>();

        for (int i = 0; i < 64; i++) {
            plateauList.add(new CaseEmpty());
        }

        int[] casesDragonsS = {45, 52, 56, 62};
        for (int caseDragon : casesDragonsS) {
            Ennemi dragon = getRandomDragon();
            plateauList.set(caseDragon, dragon);
        }
        int[] caseGobelinsS = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        for (int caseGobelin : caseGobelinsS) {
            Ennemi gobelin = getRandomGoblin();
            plateauList.set(caseGobelin, gobelin);
        }

        int[] caseSorciersS = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
        for (int caseSorcier : caseSorciersS) {
            Ennemi sorcier = getRandomSorciers();
            plateauList.set(caseSorcier, sorcier);
        }
        int[] casePotionS = {7, 13, 31, 33, 39, 43,};
        for (int casePotion : casePotionS) {
            Potions potion = getRandomPotion();
            plateauList.set(casePotion, potion);
        }
        int[] caseGrandePotionS = {28,41};
        for (int caseGrandePotion : caseGrandePotionS) {
            Potions potion = getRadomGrandePotion();
            plateauList.set(caseGrandePotion, potion);

        }
        int[] casesCaissesSurprises = {2, 11, 5, 22, 38, 19, 26, 42, 53, 1, 4, 8, 17, 23, 48, 49, 7, 13, 31, 33, 39, 43, 28, 41};
        for (int caseCaisseSurprise : casesCaissesSurprises) {
            Equipements equipements = getRandomEquipement();
            plateauList.set(caseCaisseSurprise, equipements);
        }
        return plateauList;
    }

}