package PlateuDeJeu;

import Ennemis.JeuFilm.Kurbi;
import Ennemis.Ennemi;
import Ennemis.Gobelin.TrollTruculent;
import Ennemis.HommePoli.GodFather;
import Ennemis.HommePoli.NecromancienSombre;
import Ennemis.Jedi.LuckSkywalker;
import Ennemis.JeuFilm.IronMan;
import Ennemis.JeuFilm.LinkLeMagnifique;
import Ennemis.Sorciers.*;
import Equipements.EquipementDef.Boucliers.Boucliers;
import Equipements.EquipementDef.Philtres.Philtres;
import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.Sorts.Sorts;
import PlateuDeJeu.Cases.Cases;

import java.util.ArrayList;


public class PlateauJeu {

    private ArrayList<Cases> plateau;



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


    public ArrayList<Ennemi> arrayDesEnnemis() {


        ArrayList<Ennemi> listEnnemis = new ArrayList<Ennemi>();

        IronMan ironman = new IronMan();
        GouleGlouton goule = new GouleGlouton();
        GodFather parrain = new GodFather();
        Kurbi kurbi = new Kurbi();
        LeCheveuduDiable chauv = new LeCheveuduDiable();
        LeSexyMan sexyMan = new LeSexyMan();
        LicheMaudite licheMaudite = new LicheMaudite();
        LinkLeMagnifique link = new LinkLeMagnifique();
        LuckSkywalker luckSkywalker = new LuckSkywalker();
        NecromancienSombre necromancienSombre = new NecromancienSombre();
        SorciereChatouille sorciereChatouille = new SorciereChatouille();
        SpectreDeNuit spectreDeNuit = new SpectreDeNuit();
        Sylvitrouille sylvitrouille = new Sylvitrouille();
        TrollTruculent trollTruculent = new TrollTruculent();
        WendigoSanguinaire wendigoSanguinaire = new WendigoSanguinaire();
        SorciereXena sorciereXena = new SorciereXena();

        listEnnemis.add(ironman);
        listEnnemis.add( goule);
        listEnnemis.add( parrain);
        listEnnemis.add(kurbi);
        listEnnemis.add(chauv);
        listEnnemis.add(sexyMan);
        listEnnemis.add(licheMaudite);
        listEnnemis.add(link);
        listEnnemis.add(luckSkywalker);
        listEnnemis.add(necromancienSombre);
        listEnnemis.add(sorciereChatouille);
        listEnnemis.add(spectreDeNuit);
        listEnnemis.add( sylvitrouille);
        listEnnemis.add(trollTruculent);
        listEnnemis.add(wendigoSanguinaire);
        listEnnemis.add(sorciereXena);

        return listEnnemis;
    }


}