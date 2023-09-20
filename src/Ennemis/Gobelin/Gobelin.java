package Ennemis.Gobelin;

import Ennemis.Ennemi;

public abstract class Gobelin extends Ennemi {
    public Gobelin() {
    }

    public Gobelin(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    public Gobelin(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        super(image, type, name, health, strength, offensive, defensive);
    }
}
