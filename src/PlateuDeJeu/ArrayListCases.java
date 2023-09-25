package PlateuDeJeu;

import Ennemis.Dragons.*;
import Ennemis.Gobelin.*;
import Ennemis.JeuFilm.Kurbi;
import Ennemis.Ennemi;
import Ennemis.HommePoli.GodFather;
import Ennemis.HommePoli.leV;
import Ennemis.Jedi.LuckSkywalker;
import Ennemis.JeuFilm.IronMan;
import Ennemis.JeuFilm.LinkLeMagnifique;
import Ennemis.Sorciers.*;
//import Equipements.EquipementDef.Boucliers.Boucliers;
//import Equipements.EquipementDef.Philtres.Philtres;
import Equipements.EquipementOff.Armes.Epees.*;
import Equipements.EquipementOff.Armes.Massues.*;
import Equipements.EquipementOff.Sorts.SortsEclair.SortAbyssale;
import Equipements.EquipementOff.Sorts.SortsEclair.SortEclair;
import Equipements.EquipementOff.Sorts.SortsEclair.SortEclipse;
import Equipements.Equipements;
import Equipements.PotionsPoisons.GrandesPotions.*;
import Equipements.PotionsPoisons.Potions;
import Equipements.PotionsPoisons.PotionsStandard.*;

import java.util.ArrayList;


public class ArrayListCases {


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
        leV leV = new leV();
        SorciereChatouille sorciereChatouille = new SorciereChatouille();
        SpectreDeNuit spectreDeNuit = new SpectreDeNuit();
        Sylvitrouille sylvitrouille = new Sylvitrouille();
        TrollTruculent trollTruculent = new TrollTruculent();
        WendigoSanguinaire wendigoSanguinaire = new WendigoSanguinaire();
        SorciereXena sorciereXena = new SorciereXena();

        listEnnemis.add(ironman);
        listEnnemis.add(goule);
        listEnnemis.add(parrain);
        listEnnemis.add(kurbi);
        listEnnemis.add(chauv);
        listEnnemis.add(sexyMan);
        listEnnemis.add(licheMaudite);
        listEnnemis.add(link);
        listEnnemis.add(luckSkywalker);
        listEnnemis.add(leV);
        listEnnemis.add(sorciereChatouille);
        listEnnemis.add(spectreDeNuit);
        listEnnemis.add(sylvitrouille);
        listEnnemis.add(trollTruculent);
        listEnnemis.add(wendigoSanguinaire);
        listEnnemis.add(sorciereXena);

        return listEnnemis;
    }

    public ArrayList<Dragon> arrayDesDragons() {
        ArrayList<Dragon> listDragon = new ArrayList<Dragon>();
        Aurorath aurorath = new Aurorath();
        Drakarion drakarion = new Drakarion();
        Terramor terramor = new Terramor();
        Umbragon umbragon = new Umbragon();

        listDragon.add(aurorath);
        listDragon.add(drakarion);
        listDragon.add(terramor);
        listDragon.add(umbragon);

        return listDragon;
    }

    public ArrayList<Gobelin> arrayDesGobelins() {
        ArrayList<Gobelin> listGobelin = new ArrayList<Gobelin>();

        Brulok brulok = new Brulok();
        Furie furie = new Furie();
        GhostandGoblin ghostandGoblin = new GhostandGoblin();
        Glacius glacius = new Glacius();
        Grimmog grimmog = new Grimmog();
        Roublard roublard = new Roublard();
        Sombra sombra = new Sombra();
        TrollTruculent trollTruculent = new TrollTruculent();
        Vorax vorax = new Vorax();
        Zigzag zigzag = new Zigzag();

        listGobelin.add(brulok);
        listGobelin.add(furie);
        listGobelin.add(ghostandGoblin);
        listGobelin.add(glacius);
        listGobelin.add(grimmog);
        listGobelin.add(roublard);
        listGobelin.add(sombra);
        listGobelin.add(trollTruculent);
        listGobelin.add(vorax);
        listGobelin.add(zigzag);

        return listGobelin;


    }


    public ArrayList<Sorcier> arrayDesSorciers() {
        ArrayList<Sorcier> listSorcier = new ArrayList<Sorcier>();

        GandRalf gandRalf = new GandRalf();
        GouleGlouton gouleGlouton = new GouleGlouton();
        LeCheveuduDiable leCheveuduDiable = new LeCheveuduDiable();
        LeSexyMan leSexyMan = new LeSexyMan();
        LicheMaudite licheMaudite = new LicheMaudite();
        SorciereChatouille sorciereChatouille = new SorciereChatouille();
        SorciereXena sorciereXena = new SorciereXena();
        SpectreDeNuit spectreDeNuit = new SpectreDeNuit();
        Sylvitrouille sylvitrouille = new Sylvitrouille();
        WendigoSanguinaire wendigoSanguinaire = new WendigoSanguinaire();

        listSorcier.add(gandRalf);
        listSorcier.add(gouleGlouton);
        listSorcier.add(leCheveuduDiable);
        listSorcier.add(leSexyMan);
        listSorcier.add(licheMaudite);
        listSorcier.add(sorciereChatouille);
        listSorcier.add(sorciereXena);
        listSorcier.add(spectreDeNuit);
        listSorcier.add(sylvitrouille);
        listSorcier.add(wendigoSanguinaire);

        return listSorcier;
    }


    public ArrayList<Potions> arrayDesPetitesPotions() {

        ArrayList<Potions> listPetitePotion = new ArrayList<Potions>();


        PotionAttaque potionAttaque = new PotionAttaque();
        PotionAttaqueDefense potionAttaqueDefense = new PotionAttaqueDefense();
        PotionDefensive potionDefensive = new PotionDefensive();
        PotiondeVie potiondeVie = new PotiondeVie();
        PotionForce potionForce = new PotionForce();
        PotionForceAttaque potionForceAttaque = new PotionForceAttaque();
        PotionForceVie potionForceVie = new PotionForceVie();
        PotionVieDefense potionVieDefense = new PotionVieDefense();


        listPetitePotion.add(potionAttaque);
        listPetitePotion.add(potionAttaqueDefense);
        listPetitePotion.add(potionDefensive);
        listPetitePotion.add(potiondeVie);
        listPetitePotion.add(potionForce);
        listPetitePotion.add(potionForceAttaque);
        listPetitePotion.add(potionForceVie);
        listPetitePotion.add(potionVieDefense);

        return listPetitePotion;
    }


    public ArrayList<Potions> arrayDesGrandesPotions() {
        ArrayList<Potions> listGrandePotion = new ArrayList<Potions>();

        PotionDuSage potionDuSage = new PotionDuSage();
        PotionElixirPuissance potionElixirPuissance = new PotionElixirPuissance();
        PotionEquilibreMagique potionEquilibreMagique = new PotionEquilibreMagique();
        PotionHarricotMagique potionHarricotMagique = new PotionHarricotMagique();
        PotionRegain potionRegain = new PotionRegain();
        Potionvitalite potionvitalite = new Potionvitalite();

        listGrandePotion.add(potionDuSage);
        listGrandePotion.add(potionElixirPuissance);
        listGrandePotion.add(potionEquilibreMagique);
        listGrandePotion.add(potionHarricotMagique);
        listGrandePotion.add(potionRegain);
        listGrandePotion.add(potionvitalite);

        return listGrandePotion;
    }


    public ArrayList<Equipements> arrayDesEquipements() {
        ArrayList<Equipements> listEquipement = new ArrayList<Equipements>();

        MassueChaos massueChaos = new MassueChaos();
        MassueEcumeur massueEcumeur = new MassueEcumeur();
        MassueFureur massueFureur = new MassueFureur();
        MassueGardien massueGardien = new MassueGardien();
        MassueGoliath massueGoliath = new MassueGoliath();
        MassueTitan massueTitan = new MassueTitan();
        EpeeCryogenique epeeCryogenique = new EpeeCryogenique();
        EpeeDesOmbres epeeDesOmbres = new EpeeDesOmbres();
        EpeeGelee epeeGelee = new EpeeGelee();
        EpeeGranit epeeGranit = new EpeeGranit();
        EpeeIncendiaire epeeIncendiaire = new EpeeIncendiaire();
        SortAbyssale sortAbyssale = new SortAbyssale();
        SortEclair sortEclairOmbre = new SortEclair();
        SortEclipse sortEclipse = new SortEclipse();
        PotionHarricotMagique potionHarricotMagique = new PotionHarricotMagique();
        PotionDuSage potionDuSage = new PotionDuSage();

        listEquipement.add(massueChaos);
        listEquipement.add(massueEcumeur);
        listEquipement.add(massueFureur);
        listEquipement.add(massueGardien);
        listEquipement.add(massueGoliath);
        listEquipement.add(massueTitan);
        listEquipement.add(epeeCryogenique);
        listEquipement.add(epeeDesOmbres);
        listEquipement.add(epeeGelee);
        listEquipement.add(epeeGranit);
        listEquipement.add(epeeIncendiaire);
        listEquipement.add(sortAbyssale);
        listEquipement.add(sortEclairOmbre);
        listEquipement.add(sortEclipse);
        listEquipement.add(potionHarricotMagique);
        listEquipement.add(potionDuSage);

        return listEquipement;
    }




}
