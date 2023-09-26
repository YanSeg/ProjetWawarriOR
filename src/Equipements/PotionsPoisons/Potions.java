package Equipements.PotionsPoisons;

import Equipements.Equipements;
import Personnages.Personnage;
import PlateuDeJeu.PlateauDuJeu;

public abstract class Potions extends Equipements {



    public Potions(String name) {
        super(name);
    }

    public Potions(int strength, String name, int health, int defensive, int offensive) {
        super(strength, name, health, defensive, offensive);
    }

    @Override
    public String toString() {
        return "Potions{" +
                "type='" + type + '\'' +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", health=" + health +
                ", defensive=" + defensive +
                ", offensive=" + offensive +
                ", description='" + description + '\'' +
                '}';
    }

    public Potions() {
    }

    @Override
    public boolean isUsable(Personnage player) {
        return true;
    }

    @Override
    public void interact(Personnage player, PlateauDuJeu plateauDuJeu) {

    }
}
