package PlateuDeJeu;

import Ennemi.Ennemi;
import Equipements.EquipementDef.Boucliers.Boucliers;
import Equipements.EquipementDef.Philtres.Philtres;
import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.Sorts.Sorts;
import PlateuDeJeu.Cases.Cases;
import Ennemi.*;

import javax.swing.*;
import java.awt.*;
import java.net.InterfaceAddress;
import java.util.ArrayList;


public class PlateauJeu {

    private ArrayList<Cases> plateau;

    private ArrayList<Ennemi> listEnnemis;

    private ArrayList<Boucliers> listBoucliers;
    private ArrayList<Philtres> listPhiltres;

    private ArrayList<Armes> listArmes;


    // Un constructeur vide qui initie le plateau de jeu
    public PlateauJeu() {
    }

    private ArrayList<Sorts> listSorts;


    //  _______________________________________________________________ Get/SET à voir
    public ArrayList<Cases> getPlateau() {
        return plateau;
    }

    public void setPlateau(ArrayList<Cases> plateau) {
        this.plateau = plateau;
    }

    public ArrayList<Ennemi.Ennemi> getListEnnemis() {
        return listEnnemis;
    }

    public void setListEnnemis(ArrayList<Ennemi.Ennemi> listEnnemis) {
        this.listEnnemis = listEnnemis;
    }

    public ArrayList<Boucliers> getListBoucliers() {
        return listBoucliers;
    }

    public void setListBoucliers(ArrayList<Boucliers> listBoucliers) {
        this.listBoucliers = listBoucliers;
    }

    public ArrayList<Philtres> getListPhiltres() {
        return listPhiltres;
    }

    public void setListPhiltres(ArrayList<Philtres> listPhiltres) {
        this.listPhiltres = listPhiltres;
    }

    public ArrayList<Armes> getListArmes() {
        return listArmes;
    }

    public void setListArmes(ArrayList<Armes> listArmes) {
        this.listArmes = listArmes;
    }

    public ArrayList<Sorts> getListSorts() {
        return listSorts;
    }

    public void setListSorts(ArrayList<Sorts> listSorts) {
        this.listSorts = listSorts;
    }


//  _______________________________________________________________ Get/SET à voir


    public void arrayDesEnnemis() {

        IronMan ironman = new IronMan();
        GouleGlouton goule = new GouleGlouton();
;
    }


}