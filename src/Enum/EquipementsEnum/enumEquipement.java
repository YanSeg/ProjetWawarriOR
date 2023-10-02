//package Enum.EquipementsEnum;
//
//import Equipements.EquipementOff.Armes.Epees.*;
//import Equipements.EquipementOff.Armes.Massues.*;
//import Equipements.EquipementOff.Sorts.SortsEclair.*;
//import Equipements.EquipementOff.Sorts.SortsFeu.*;
//import Equipements.EquipementOff.Sorts.SortsGlace.*;
//import Equipements.EquipementOff.Sorts.SortsTerre.*;
//import Equipements.Equipements;
//import Equipements.PotionsPoisons.GrandesPotions.*;
//import Equipements.PotionsPoisons.PotionsStandard.*;
//import Equipements.PotionsPoisons.PotionsStandard.PotionAttaqueDefense;
//
//import java.util.Random;
//
//
//public enum enumEquipement {
//    SORTECLAIR(new SortAbyssale(), new SortEclair(), new SortEclipse(), new SortElec(), new SortRage()),
//    SORTFEU(new SortBrasier(), new SortDrakoFeu(), new SortEcarlate(), new SortEruptio(), new SortFlamme()),
//    SORTGLACE(new SortAvalanche(), new SortGelee(), new SortGivre(), new SortGlace(), new SortTempete()),
//    SORTTERRE(new SortTerreCreationGolem(), new SortTerreEruptionVolcanique(), new SortTerreFrappeSismique(), new SortTerreMurRoc(), new SortTerreTremblementDevastateur()),
//
//    PETITEPOTION(new PotionAttaque(), new PotionAttaqueDefense(), new PotionDefensive(), new PotiondeVie(), new PotionForce(), new PotionForceAttaque(), new PotionForceVie(), new PotionVieDefense()),
//
//    GRANDEPOTION(new PotionDuSage(), new PotionElixirPuissance(), new PotionEquilibreMagique(), new PotionHarricotMagique(), new PotionRegain(), new Potionvitalite()),
//
//    EPEE(new EpeeCryogenique(), new EpeeDesOmbres(), new EpeeGelee(), new EpeeGranit(), new EpeeIncendiaire(), new EpeeInfernale(), new EpeeMarteauPioche(), new EpeeSombre(), new EpeeTriforce()),
//    MASSUE(new MassueChaos(), new MassueEcumeur(), new MassueFureur(), new MassueGardien(), new MassueGoliath(), new MassueGoliath());
//
//    private final Equipements[] allSequipement;
//
//    enumEquipement(Equipements... allSequipement)     // ... car on peut construire plusieurs Ennemi
//    {
//        this.allSequipement = allSequipement;
//    }
//
//
//    public Equipements getRandomSpell() {
//        Random random = new Random();
//        int index = random.nextInt(allSequipement.length);
//        return allSequipement[index];
//    }
//
//    public void displayrandomEquipemement(Equipements randomEquipement) {
//        System.out.println(randomEquipement);
//
//    }
//}
//
