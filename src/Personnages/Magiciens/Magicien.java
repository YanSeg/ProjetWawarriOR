package Personnages.Magiciens;

import Personnages.Personnage;

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
