package Personnages.Magiciens;
import Equipements.EquipementOff.EquipementOffensif;
import Equipements.EquipementOff.Sorts.Sorts;
import Equipements.Equipements;
import Personnages.Personnage;



public class Magicien extends Personnage {
    @Override
    public int getPosition() {
        return super.getPosition();
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
    public void setStrength(int strength) {
        super.setStrength(strength);
    }


    @Override
    public void setPosition(int position) {
        super.setPosition(position);
    }


//    public Magicien(String name, String type, int health, Integer strength, String offensive, String defensive) {
//        super(name, type, health, strength, offensive, defensive);
//    }

//    public Magicien() {
//    }



    @Override
    public String evolutionPartie() {
        return super.evolutionPartie();
    }

    @Override
    public String capitalizeFirstLetter(String input) {
        return super.capitalizeFirstLetter(input);
    }

    public Magicien(String name, int health, int strength, String offensive, String defensive) {
        super(name, health, strength, offensive, defensive);
    }

    public Magicien(String type, String name, int health, int strength, String offensive, String defensive) {
        super(type, name, health, strength, offensive, defensive);
    }

    public Magicien(String name, String type, int health, Integer strength, String offensive, String defensive) {
        super(name, type, health, strength, offensive, defensive);
    }

    public Magicien() {
    }

    public Magicien(String name) {
        super(name, "Magicien", 1000, 1500, "spell", "philtre");
    }

    public Magicien(String type, String name) {
        super(type, name);
    }

    /**
     * Méthode qui ne retourne rien, elle qui affiche une phrase
     */
    public void abou(){
        System.out.println("Coucou abou");
    }

}



