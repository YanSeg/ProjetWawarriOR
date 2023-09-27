package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Personnages.Personnage;

public abstract class Sorcier extends Ennemi {
    public Sorcier() {
    }

    public Sorcier(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    @Override
    public void interact(Personnage player) {

    }

    public Sorcier(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        super(image, type, name, health, strength, offensive, defensive);
    }
}
