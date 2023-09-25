package PlateuDeJeu.Cases;

import Equipements.EquipementDef.EquipementDefensif;
import Equipements.Equipements;
import Equipements.PotionsPoisons.Potions;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.ArrayListCases;
import java.util.Collections;
import java.util.*;
//import java.util.Collections;
import java.util.ArrayList;

public class CasePotion extends CaseEquipement{


    private final String REPRESENTATION = ASCII_Representations.messagePotion();



    ArrayListCases plty = new ArrayListCases();
    ArrayList<Potions> arrayListPotions = plty.arrayDesPetitesPotions();




    Random random = new Random();
    int indexAleatoire = random.nextInt(arrayListPotions.size());

    Potions PotionRandom = arrayListPotions.get(indexAleatoire);

}
