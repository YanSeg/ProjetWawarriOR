package Enum.EnnemisEnum;

public enum EnumEquipOff {
    PETIT(3, "Petit Bouclier"),
    MOYEN(5, "Bouclier Moyen"),
    GRAND(8, "Grand Bouclier");

    private final int force;
    private final String nom;

    EnumEquipOff(int force, String nom) {
        this.force = force;
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public String getNom() {
        return nom;
    }
}


//
//public class Ennemi {
//    private int vie;
//    private int force;
//    private String nom;
//    private Arme arme;
//    private Bouclier bouclier;
//
//    public Ennemi(int vie, int force, String nom, Arme arme, Bouclier bouclier) {
//        this.vie = vie;
//        this.force = force;
//        this.nom = nom;
//        this.arme = arme;
//        this.bouclier = bouclier;
//    }
//
//    // Getters pour les attributs
//
//    // ...
//
//    @Override
//    public String toString() {
//        return "Ennemi [vie=" + vie + ", force=" + force + ", nom=" + nom + ", arme=" + arme.getNom() + ", bouclier=" + bouclier.getNom() + "]";
//    }
//}
//
//// Enum principal pour les ennemis
//public enum EnumEnnemi {
//    DRAGON(new Ennemi(100, 20, "Dragon", Arme.EPEE, Bouclier.GRAND)),
//    GOBELIN(new Ennemi(30, 10, "Gobelin", Arme.ARC, Bouclier.PETIT)),
//    SORCIERS(new Ennemi(50, 15, "Sorcier", Arme.BATON, Bouclier.MOYEN));
//
//    private final Ennemi ennemi;
//
//    EnumEnnemi(Ennemi ennemi) {
//        this.ennemi = ennemi;
//    }
//
//    public Ennemi getEnnemi() {
//        return ennemi;
//    }
//}

