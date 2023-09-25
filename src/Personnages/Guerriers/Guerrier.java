package Personnages.Guerriers;
import Equipements.Equipements;
import Personnages.Personnage;

public class Guerrier extends Personnage {
    public Guerrier(int health, int strength, String type, String name) {
        super(health, strength, type, name);
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
    public void setStrength(int strength) {
        super.setStrength(strength);
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
    public int getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(int position) {
        super.setPosition(position);
    }

    @Override
    public Equipements getEquipementDef() {
        return super.getEquipementDef();
    }

    @Override
    public void setEquipementDef(Equipements equipementDef) {
        super.setEquipementDef(equipementDef);
    }

    @Override
    public Equipements getEquipemenOf() {
        return super.getEquipemenOf();
    }

    @Override
    public void setEquipemenOf(Equipements equipemenOf) {
        super.setEquipemenOf(equipemenOf);
    }

//    public Guerrier(String name) {
//        super(name);
//    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String evolutionPartie() {
        return super.evolutionPartie();
    }

    @Override
    public String capitalizeFirstLetter(String input) {
        return super.capitalizeFirstLetter(input);
    }




}