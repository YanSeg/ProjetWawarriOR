package PlateuDeJeu.Cases;

import Ennemis.Dragons.Dragon;
import Ennemis.Ennemi;
import Equipements.Equipements;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.ArrayListCases;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

import static Game.Game.lancementDuddE;
import static MiseEnPage.MiseEnPage.space;
import static PlateuDeJeu.ArrayListCases.arrayDesDragons;


public class CaseDragon extends Ennemi{

    private final String REPRESENTATION = ASCII_Representations.dragonCaseMessage();
    private final String SHAME = ASCII_Representations.puit2();
    Dragon dragon = arrayDesDragons();

}


