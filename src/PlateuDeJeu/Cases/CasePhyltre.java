package PlateuDeJeu.Cases;

import Equipements.EquipementDef.Phyltres.Phyltre;
import Images.ASCII_Representations;
import Personnages.Personnage;

import static PlateuDeJeu.GenerateurPlateau.PhiltreFactory;

public class CasePhyltre extends CaseEquipement{

    private final String REPRESENTATION = ASCII_Representations.messagePhyltre();

    @Override
    public void interact(Personnage player) {

        Phyltre phyltre = PhiltreFactory();

    }
}