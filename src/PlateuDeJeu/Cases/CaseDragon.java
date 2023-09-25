package PlateuDeJeu.Cases;

import Ennemis.Dragons.Dragon;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.ArrayListCases;

import java.util.ArrayList;
import java.util.Collections;

public class CaseDragon extends CaseEnnemi {

    private final String REPRESENTATION = ASCII_Representations.dragonCaseMessage();


    @Override
    public void interact(Personnage player) {
        System.out.println(REPRESENTATION);


    }
}