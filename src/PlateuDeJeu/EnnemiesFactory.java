package PlateuDeJeu;

import Ennemis.Dragons.Dragon;
import Ennemis.Gobelin.Gobelin;
import Equipements.EquipementOff.Armes.Arc.Arc;
import Equipements.EquipementOff.EquipementOffensif;
import PlateuDeJeu.EquipementFactory;

import java.util.Random;


public class EnnemiesFactory {
    public static Dragon dragonFactory() {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(4);
        Dragon dragon = switch (r) {
            case 0 -> new Dragon("Feu", "Drakarion le Feu-Éternel", 20, 20, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
            case 1 -> new Dragon("Ombre", "Aurorath la Glace-Éternelle", 30, 25,  EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
            case 2 -> new Dragon("Feu", "Terramor le Terre-Briseur", 20, 15,  EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
            case 3 -> new Dragon("Glace", "Umbragon le Sombre-Mystique", 20, 15,  EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
            default -> null;
        };
        return dragon;
    }


//    public static Dragon gobelinFactory() {
//        Random randomGenerator = new Random();
//        int r = randomGenerator.nextInt(4);
//        Gobelin gobelin = switch (r) {
//            case 0 -> new Gobelin("Feu", "Drakarion le Feu-Éternel", 20, 20, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
//            case 1 -> new Gobelin("Ombre", "Aurorath la Glace-Éternelle", 30, 25,  EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
//            case 2 -> new Gobelin("Feu", "Terramor le Terre-Briseur", 20, 15,  EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
//            case 3 -> new Gobelin("Glace", "Umbragon le Sombre-Mystique", 20, 15,  EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
//            default -> null;
//        };
//        return dragon;
    }





