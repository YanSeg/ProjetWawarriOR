package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Personnages.Personnage;

public abstract class Gobelin extends Ennemi {
    public Gobelin() {
    }

    public Gobelin(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    @Override
    public void interact(Personnage player) {

    }

    public Gobelin(String image, String type, String name, int health, int strength, String offensive, String defensive) {
        super(image, type, name, health, strength, offensive, defensive);
    }
}
