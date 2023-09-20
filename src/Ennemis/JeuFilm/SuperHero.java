package Ennemis.JeuFilm;

import Ennemis.Ennemi;

public abstract class SuperHero extends Ennemi {
    @Override
    public String toString() {
        return "SuperHero{}";
    }

    public SuperHero() {
    }

    public SuperHero(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    public SuperHero(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        super(image, type, name, health, strength, offensive, defensive);
    }
}
