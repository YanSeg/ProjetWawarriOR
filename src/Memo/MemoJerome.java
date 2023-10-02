//
//// Dictionnaire ici : https://www.baeldung.com/java-iterate-map
//
//
///**
// * Ceci est ma page memo
// */
//
//// Tableau case fixe, à instancier
//
//
////package Memo;
////package com.company;
////
////import java.util.ArrayList;
////import java.util.HashMap;
////import java.util.Map;
////
////public class MemoJerome {
////
////    private int[] plateauStandard;
////    private ArrayList<Case> laCollection;
////    private Map<Integer, Case> dictPlateau;
////
////    public Game() {
////        // initialisation
////        laCollection = new ArrayList<>();
////        dictPlateau = new HashMap<>();
////    }
////
////    public void displayList() {
////        // itération
////        for (int i = 0; i < 64; i++) {
////      //      laCollection.add(new Case(String.format("vide %s", i)));
////        }
////
////        laCollection.set(29, new Case("La case en plus"));
////       // laCollection.add(new Ennemy("une case ennemie"));
////        System.out.println(laCollection.size());
////        System.out.println(laCollection.get(29));
////        System.out.println(laCollection.get(64));
////
//////        for(Case lacase : laCollectionFX) {
//////            System.out.println(lacase);
//////        }
////
////        laCollection.forEach(lacase -> {
////            System.out.println(lacase);
////        });
////    }
////
////    public void displayMap() {
//////        dictPlateau.put(1, new Case("la classe !"));
////
////        for (int i = 0; i < 64; i++) {
////            dictPlateau.put(i, new Case("la classe !"));
////        }
////
////        System.out.println(dictPlateau.size());
////
////        dictPlateau.put(29, new Case("vraiment la classe"));
////        System.out.println(dictPlateau.get(29));
////    }
////
////    public void fillPlateau() {
////    }
////}
//
//
////
////            POUR BOUCLER SUR MA LISTE D'OBJET
////
////                 PlateauJeu plty = new PlateauJeu();
////
////                ArrayList<Ennemi> arrayListEnnemi = plty.arrayDesEnnemis();
////
////               System.out.println(arrayListEnnemi.size());
////
////                                             for(Ennemi object : arrayListEnnemi){
////                                                 System.out.println(object.getDefensive());
////                                                 System.out.println(object.getImage());
////                                             }
//
//
////Pour tout sortir mon tableau d'object
////        System.out.println(arrayListEnnemi.toString());
//
//
//// imaginons un warrior et et wizard qui extends de personnage et un weapon et un spell spé à l un ou a l autre
////class Offensive blabla {
////}
////
////Spelle et Weapon extends Offensive
////
//////
////class warrior factory {
////    public Personnage createPerso (){
////        return new Warrior();
////    }
////    public EquipementOff createEquipement (){
////        return new Offensive();
////    }
////
//
//
//// Stream().map() UTILISER STREAM EN JAVA POUR ALLER CHERCHER DES FILTERS,FOREACH, MAP etc.
//
//
//// Enum
//public enum EnumEnnemi {
//    DRAGON(100, 20, "Dragon", EnumArme.EPEE, EnumBouclier.SHIELD),
//    GOBELIN(30, 10, "Gobelin", EnumArme.ARC, EnumBouclier.PETIT),
//    SORCIER(50, 15, "Sorcier", EnumArme.BATON, EnumBouclier.MOYEN);
//
//    private final int vie;
//    private final int force;
//    private final String nom;
//    private final EnumArme arme;
//    private final EnumBouclier bouclier;
//
//    EnumEnnemi(int vie, int force, String nom, EnumArme arme, EnumBouclier bouclier) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//        this.arme = arme;
//        this.bouclier = bouclier;
//    }
//
//    public Ennemi createEnnemi() {
//        return new Ennemi(vie, force, nom, arme, bouclier);
//    }
//}
//
//public enum EnumArme {
//    EPEE(10, "Epée"),
//    ARC(8, "Arc"),
//    BATON(5, "Bâton");
//
//    private final int force;
//    private final String nom;
//
//    EnumArme(int force, String nom) {
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public int getForce() {
//        return force;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//}
//
//public enum EnumBouclier {
//    PETIT(3, "Petit Bouclier"),
//    MOYEN(5, "Bouclier Moyen"),
//    GRAND(8, "Grand Bouclier"),
//    SHIELD(6, "Shield"); // Ajout d'un bouclier "Shield"
//
//    private final int force;
//    private final String nom;
//
//    EnumBouclier(int force, String nom) {
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public int getForce() {
//        return force;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//}
//
//// Classe Ennemi
//public class Ennemi {
//    private int vie;
//    private int force;
//    private String nom;
//    private EnumArme arme;
//    private EnumBouclier bouclier;
//
//    public Ennemi(int vie, int force, String nom, EnumArme arme, EnumBouclier bouclier) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//        this.arme = arme;
//        this.bouclier = bouclier;
//    }
//
//    // Getters pour les attributs
//
//    @Override
//    public String toString() {
//        return "Ennemi [vie=" + vie + ", force=" + force + ", nom=" + nom + ", arme=" + arme.getNom() + ", bouclier=" + bouclier.getNom() + "]";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Créez un ennemi Dragon
//        Ennemi dragon = EnumEnnemi.DRAGON.createEnnemi();
//
//        // Affichez les informations de l'ennemi créé
//        System.out.println("Ennemi : " + dragon);
//    }
//}
//
//
//
//
//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Random;
//
//public enum EnumEnnemi {
//    DRAGON(100, 20, "Dragon", EnumArme.EPEE, EnumBouclier.SHIELD),
//    GOBELIN(30, 10, "Gobelin", EnumArme.ARC, EnumBouclier.PETIT),
//    SORCIER(50, 15, "Sorcier", EnumArme.BATON, EnumBouclier.MOYEN);
//
//    private final int vie;
//    private final int force;
//    private final String nom;
//    private final EnumArme arme;
//    private final EnumBouclier bouclier;
//
//    EnumEnnemi(int vie, int force, String nom, EnumArme arme, EnumBouclier bouclier) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//        this.arme = arme;
//        this.bouclier = bouclier;
//    }
//
//    public Ennemi createEnnemi() {
//        return new Ennemi(vie, force, nom, arme, bouclier);
//    }
//
//    public static EnumEnnemi getRandomDragon() {
//        List<EnumEnnemi> dragons = new ArrayList<>();
//        for (EnumEnnemi ennemi : values()) {
//            if (ennemi == DRAGON) {
//                dragons.add(ennemi);
//            }
//        }
//
//        if (dragons.isEmpty()) {
//            return null;
//        }
//
//        Random random = new Random();
//        return dragons.get(random.nextInt(dragons.size()));
//    }
//}
//
//public enum EnumArme {
//    EPEE(10, "Epée"),
//    ARC(8, "Arc"),
//    BATON(5, "Bâton");
//
//    private final int force;
//    private final String nom;
//
//    EnumArme(int force, String nom) {
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public int getForce() {
//        return force;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//}
//
//public enum EnumBouclier {
//    PETIT(3, "Petit Bouclier"),
//    MOYEN(5, "Bouclier Moyen"),
//    GRAND(8, "Grand Bouclier"),
//    SHIELD(6, "Shield");
//
//    private final int force;
//    private final String nom;
//
//    EnumBouclier(int force, String nom) {
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public int getForce() {
//        return force;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//}
//
//// Classe Ennemi
//public class Ennemi {
//    private int vie;
//    private int force;
//    private String nom;
//    private EnumArme arme;
//    private EnumBouclier bouclier;
//
//    public Ennemi(int vie, int force, String nom, EnumArme arme, EnumBouclier bouclier) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//        this.arme = arme;
//        this.bouclier = bouclier;
//    }
//
//    // Getters pour les attributs
//
//    @Override
//    public String toString() {
//        return "Ennemi [vie=" + vie + ", force=" + force + ", nom=" + nom + ", arme=" + arme.getNom() + ", bouclier=" + bouclier.getNom() + "]";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Créez un ennemi Dragon avec des armes et boucliers aléatoires
//        Ennemi dragon = EnumEnnemi.DRAGON.createEnnemi();
//
//        // Affichez les informations de l'ennemi créé
//        System.out.println("Ennemi Dragon : " + dragon);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//


//
////    enumEnnemi ennemiEnum = enumEnnemi.DRAGON;
////
////    Ennemi randomSorcier = ennemiEnum.getRandomEnnemi();
////
////        ennemiEnum.displayrandomEnum(randomSorcier);
////
//
//
//
//
//import java.util.Random;
//
//public enum EnumEnnemi {
//    DRAGON(100, 20, "Dragon"),
//    GOBELIN(30, 10, "Gobelin"),
//    SORCIER(50, 15, "Sorcier");
//
//    private final int vie;
//    private final int force;
//    private final String nom;
//
//    EnumEnnemi(int vie, int force, String nom) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public Ennemi createEnnemi() {
//        EnumArme[] armes = EnumArme.values();
//        EnumBouclier[] boucliers = EnumBouclier.values();
//        Random random = new Random();
//
//        EnumArme randomArme = armes[random.nextInt(armes.length)];
//        EnumBouclier randomBouclier = boucliers[random.nextInt(boucliers.length)];
//
//        return new Ennemi(vie, force, nom, randomArme, randomBouclier);
//    }
//}
//
//public enum EnumArme {
//    EPEE(10, "Epée"),
//    ARC(8, "Arc"),
//    BATON(5, "Bâton");
//
//    private final int force;
//    private final String nom;
//
//    EnumArme(int force, String nom) {
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public int getForce() {
//        return force;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//}
//
//public enum EnumBouclier {
//    PETIT(3, "Petit Bouclier"),
//    MOYEN(5, "Bouclier Moyen"),
//    GRAND(8, "Grand Bouclier");
//
//    private final int force;
//    private final String nom;
//
//    EnumBouclier(int force, String nom) {
//        this.force = force;
//        this.nom = nom;
//    }
//
//    public int getForce() {
//        return force;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//}
//
//// Classe Ennemi
//public class Ennemi {
//    private int vie;
//    private int force;
//    private String nom;
//    private EnumArme arme;
//    private EnumBouclier bouclier;
//
//    public Ennemi(int vie, int force, String nom, EnumArme arme, EnumBouclier bouclier) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//        this.arme = arme;
//        this.bouclier = bouclier;
//    }
//
//    // Getters pour les attributs
//
//    @Override
//    public String toString() {
//        return "Ennemi [vie=" + vie + ", force=" + force + ", nom=" + nom + ", arme=" + arme.getNom() + ", bouclier=" + bouclier.getNom() + "]";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Créez un ennemi Dragon avec des armes et boucliers aléatoires
//        Ennemi dragon = EnumEnnemi.DRAGON.createEnnemi();
//
//        // Affichez les informations de l'ennemi créé
//        System.out.println("Ennemi : " + dragon);
//    }
//}
//
//
//
//
