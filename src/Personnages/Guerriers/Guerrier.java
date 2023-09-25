package Personnages.Guerriers;
import Equipements.Equipements;
import Personnages.Personnage;

public class Guerrier extends Personnage {
    public Guerrier(String name) {
        super(name, "Guerrier", 1000, 10000, "arme", "bouclier");
    }


    public Guerrier(String name, int health, int strength, String offensive, String defensive) {
        super(name, health, strength, offensive, defensive);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getOffensive() {
        return super.getOffensive();
    }

    @Override
    public void setOffensive(String offensive) {
        super.setOffensive(offensive);
    }

    @Override
    public String getDefensive() {
        return super.getDefensive();
    }

    @Override
    public void setDefensive(String defensive) {
        super.setDefensive(defensive);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(int position) {
        super.setPosition(position);
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
    }

    public Guerrier(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }


    public Guerrier(String name, String type, int health, Integer strength, String offensive, String defensive) {
        super(name, type, health, strength, offensive, defensive);
    }

    @Override
    public String evolutionPartie() {
        return super.evolutionPartie();
    }

    @Override
    public String capitalizeFirstLetter(String input) {
        return super.capitalizeFirstLetter(input);
    }

    public Guerrier() {
    }


    public Guerrier(String type, String name) {
        super(type, name);
    }


}
