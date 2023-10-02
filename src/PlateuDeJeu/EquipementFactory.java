package PlateuDeJeu;

import Equipements.EquipementDef.Boucliers.Bouclier;
import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementDef.Phyltres.Phyltre;
import Equipements.EquipementOff.Armes.Arc.Arc;
import Equipements.EquipementOff.Armes.Epees.Epee;
import Equipements.EquipementOff.EquipementOffensif;
import Equipements.PotionsPoisons.GrandesPotions.*;
import Equipements.PotionsPoisons.Potions;
import Equipements.PotionsPoisons.PotionsStandard.*;

import java.util.Random;

public class EquipementFactory {


    public static Potions createPotion() {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(6);
        Potions potion = switch (r) {
            case 0 -> new PotionAttaque();
            case 1 -> new PotionAttaqueDefense();
            case 2 -> new PotionDefensive();
            case 3 -> new PotionForce();
            case 4 -> new PotionForceAttaque();
            case 5 -> new PotionForceVie();
            case 6 -> new PotionVieDefense();
            default -> null;
        };
        return potion;
    }


    public static Potions createBigPotion() {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(5);
        Potions grandepotion = switch (r) {
            case 0 -> new PotionDuSage();
            case 1 -> new PotionElixirPuissance();
            case 2 -> new PotionEquilibreMagique();
            case 3 -> new PotionHarricotMagique();
            case 4 -> new PotionRegain();
            case 5 -> new Potionvitalite();
            default -> null;
        };
        return grandepotion;
    }


    public static Arc createArc() {
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

    public static Bouclier createShield() {
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


    public static Phyltre createPhyltre() {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(5);
        Phyltre phylre = switch (r) {
            case 0 -> new Phyltre("Feu", "Phyltre de feu", 20);
            case 1 -> new Phyltre("Ombre", "Phyltre de lumière", 20);
            case 2 -> new Phyltre("Feu", "Phyltre Fire", 20);
            case 3 -> new Phyltre("Glace", "Phyltre de Glace", 20);
            case 4 -> new Phyltre("Terre", "Phyltre de Terre", 20);
            case 5 -> new Phyltre("Legende", "Phyltre de l'amour magique", 50);
            default -> null;
        };
        return phylre;
    }


    public static Epee createEpee() {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(5);

        Epee epee = switch (r) {
            case 0 -> new Epee("Feu", "Epee de feu", 20);
            case 1 -> new Epee("Ombre", "Epee de lumière", 20);
            case 2 -> new Epee("Feu", "Epee Fire", 20);
            case 3 -> new Epee("Glace", "Epee de Glace", 20);
            case 4 -> new Epee("Terre", "Epee de Terre", 20);
            case 5 -> new Epee("Legende", "Epee de l'amour magique", 50);
            default -> null;
        };
        return epee;
    }

    public static EquipementDefensif createEquipDef() {

        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(1);
        EquipementDefensif shield = switch (r) {
            case 0 -> createShield();
            case 1 -> createPhyltre();
            default -> null;
        };
        return shield;
    }

    public static EquipementOffensif createEquipOf() {

        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(1);
        EquipementOffensif weapon = switch (r) {
            case 0 -> createArc();
            case 1 -> createEpee();
            default -> null;
        };
        return weapon;
    }


}

