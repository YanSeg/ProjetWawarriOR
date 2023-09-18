package PotionsPoisons;

public class Potions {
    public Potions(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    protected int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    protected int strength;

    public Potions(int health) {
        this.health = health;
    }


}
