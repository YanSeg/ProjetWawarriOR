package PlateuDeJeu.Cases;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.PlateauDuJeu;

public class CaseSort extends CaseEquipement{

    private final String REPRESENTATION = ASCII_Representations.messageSorts();


    @Override
    public void interact(Personnage player, PlateauDuJeu plateauDuJeu) {

    }
}
