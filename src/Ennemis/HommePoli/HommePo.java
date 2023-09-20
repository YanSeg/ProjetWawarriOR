package Ennemis.HommePoli;

import Ennemis.Ennemi;

public abstract class HommePo extends Ennemi {
    public HommePo() {
    }

    public HommePo(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    public HommePo(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        super(image, type, name, health, strength, offensive, defensive);
    }
}
