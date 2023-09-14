package Personnages.Magiciens;
import Personnages.Personnage;




/*
public abstract class Forme {
    // Attributs communs à toutes les formes
    protected double x;
    protected double y;
    // Constructeur de la classe abstraite Forme
    public Forme(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Méthode abstraite pour calculer l'aire de la forme
    public abstract double calculerAire();
}
public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;
    // Constructeur de la classe Rectangle
    public Rectangle(double x, double y, double largeur, double hauteur) {
        super(x, y); // Appel du constructeur de la classe parente Forme
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    // Implémentation de la méthode abstraite calculerAire pour Rectangle
    @Override
    public double calculerAire() {
        return largeur * hauteur;
    }
}
 */





public class Magicien extends Personnage {
    public Magicien(String name, String type, int health, Integer strength, String offensive, String defensive) {
        super(name, type, health, strength, offensive, defensive);
    }

    public Magicien() {
    }

    public Magicien(String type) {
        super(type);
    }

    public Magicien(String type, String name) {
        super(type, name);
    }
}
