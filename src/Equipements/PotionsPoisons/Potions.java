package Equipements.PotionsPoisons;

import Equipements.Equipements;

public abstract class Potions extends Equipements {


    public Potions(String name) {
        super(name);
    }

    public Potions(int strength, String name, int health, int defensive, int offensive) {
        super(strength, name, health, defensive, offensive);
    }

    public Potions() {
    }
}
