package PlateuDeJeu.Cases;

import Ennemis.Dragons.Dragon;
import Ennemis.Ennemi;
import Images.ASCII_Representations;

import static PlateuDeJeu.ArrayListCases.getRandomDragon;


public class CaseDragon extends Ennemi{

    private final String REPRESENTATION = ASCII_Representations.dragonCaseMessage();
    private final String SHAME = ASCII_Representations.puit2();
    Dragon dragon = getRandomDragon();

}


