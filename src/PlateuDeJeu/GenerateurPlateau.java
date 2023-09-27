package PlateuDeJeu;

import Ennemis.Dragons.Dragon;
import Ennemis.Gobelin.Gobelin;
import Ennemis.Sorciers.Sorcier;
import Equipements.EquipementDef.Boucliers.Bouclier;
import Equipements.EquipementDef.Phyltres.Phyltre;
import Equipements.EquipementOff.Armes.Arc.Arc;
import Equipements.Equipements;
import PlateuDeJeu.Cases.*;

import java.util.Random;

import static PlateuDeJeu.ArrayListCases.*;

public class GenerateurPlateau {


    public static Cases[] plateaClassique() {


        {
            Cases[] plateau = new Cases[64];
            for (int i = 0; i < 64; i++) {
                plateau[i] = new CaseVide();
            }
            int[] casesDragonsS = {45, 52, 56, 62};
            for (int caseDragon : casesDragonsS) {
                Dragon dragon = getRandomDragon();
                plateau[caseDragon] = dragon;
            }
            int[] caseSorciersS = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
            for (int caseSorcier : caseSorciersS) {
                Sorcier sorcier = getRandomSorciers();
                plateau[caseSorcier] = sorcier;
            }
            int[] caseGobelinsS = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
            for (int caseGobelin : caseGobelinsS) {
                Gobelin gobelin = getRandomGoblin();
                plateau[caseGobelin] = gobelin;
            }
            int[] casesCaissesSurprises = {2, 11, 5, 22, 38, 19, 26, 42, 53, 1, 4, 8, 17, 23, 48, 49, 7, 13, 31, 33, 39, 43, 28, 41};
            for (int caseCaisseSurprise : casesCaissesSurprises) {

                Equipements equipements = getRandomEquipement();

                plateau[caseCaisseSurprise] = equipements;
            }
            return plateau;
        }

    }


    public static Arc ArmesFactory() {

        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(4);
        Arc arc = switch (r) {
            case 0 -> new Arc("Feu", "Arc de feu", 20);
            case 1 -> new Arc("Ombre", "Arc de lumière", 30);
            case 2 -> new Arc("Feu", "Arc Fire", 20);
            case 3 -> new Arc("Glace", "Arc de Glace", 20);
            case 4 -> new Arc("Terre", "Arc de Terre", 20);
            default -> null;

        };
        return arc;
    }


    public static Bouclier BouclierdFactory() {

        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(5);
        Bouclier shield = switch (r) {
            case 0 -> new Bouclier("Feu", 20, "Bouclier de feu");
            case 1 -> new Bouclier("Ombre", 20, "Bouclier de lumière");
            case 2 -> new Bouclier("Feu", 20, "Bouclier Fire");
            case 3 -> new Bouclier("Glace", 20, "Bouclier de Glace");
            case 4 -> new Bouclier("Terre", 20, "Bouclier de Terre");
            case 5 -> new Bouclier("Legende", 50, "Bouclier Hylia");
            default -> null;
        };
        return shield;
    }

    public static Phyltre PhiltreFactory() {

        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(5);
        Phyltre phylre = switch (r) {
            case 0 -> new Phyltre("Feu", 20, "Phyltre de feu");
            case 1 -> new Phyltre("Ombre", 20, "Phyltre de lumière");
            case 2 -> new Phyltre("Feu", 20, "Phyltre Fire");
            case 3 -> new Phyltre("Glace", 20, "Phyltre de Glace");
            case 4 -> new Phyltre("Terre", 20, "Phyltre de Terre");
            case 5 -> new Phyltre("Legende", 50, "Phyltre de l'amour magique");
            default -> null;
        };
        return phylre;
    }


}
