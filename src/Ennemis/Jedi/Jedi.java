package Ennemis.Jedi;

import Ennemis.Ennemi;

public abstract class Jedi extends Ennemi {
    public Jedi() {
    }

    public Jedi(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    public Jedi(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        super(image, type, name, health, strength, offensive, defensive);
    }
}
