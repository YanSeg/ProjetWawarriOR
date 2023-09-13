package Personnages.Guerriers;
import Personnages.Personnage;

public class Guerrier extends Personnage {
    public Guerrier(String name, String type, int health, Integer strength, String offensive, String defensive) {
        super(name, type, health, strength, offensive, defensive);
    }

    public Guerrier() {
    }

    public Guerrier(String type) {
        super(type);
    }

    public Guerrier(String type, String name) {
        super(type, name);
    }
}
