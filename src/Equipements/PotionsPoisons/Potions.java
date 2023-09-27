package Equipements.PotionsPoisons;

import Equipements.Equipements;
import Personnages.Personnage;
import PlateuDeJeu.BoardFactory;

public abstract class Potions extends Equipements {



    public Potions(String name) {
        super(name);
    }

    public Potions(int strength, String name, int health, int defensive, int offensive) {
        super(strength, name, health, defensive, offensive);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public Potions() {
    }

    @Override
    public boolean isUsable(Personnage player) {
        return true;
    }

    @Override
    public void interact(Personnage player, BoardFactory plateauDuJeu) {

    }
}
