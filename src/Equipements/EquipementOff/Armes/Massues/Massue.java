package Equipements.EquipementOff.Armes.Massues;

import Equipements.EquipementOff.Armes.Armes;
import Personnages.Guerriers.Guerrier;
import Personnages.Personnage;

public abstract class Massue extends Armes {
    public Massue(String offensifType, int offensifStrenght, String offensifName) {
        super(offensifType, offensifStrenght, offensifName);
    }

    public Massue() {
    }

    public Massue(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    public Massue(String offensifName, int offensifStrenght) {
        super(offensifName, offensifStrenght);
    }



//    public equip( Guerrier guerrier ){
//        guerrier.setOffensive();
//
//    }

//    public equip( Sorcier sorcier ){
//        System.out.println("Je ne me peux pas utiliser ce type d'arme");
//    }
}
