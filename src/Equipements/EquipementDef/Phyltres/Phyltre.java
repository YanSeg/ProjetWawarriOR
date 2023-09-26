package Equipements.EquipementDef.Phyltres;

import Equipements.EquipementDef.EquipementDefensif;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;
import PlateuDeJeu.PlateauDuJeu;

public class Phyltre extends EquipementDefensif {

    @Override
    public void interact(Personnage player, PlateauDuJeu plateauDuJeu) {

    }

    @Override
    public boolean isUsable(Personnage player) {
        return player instanceof Magicien;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Phyltre(int strength, String name, int health, int defensive, int offensive, String type, int defensive1, String name1) {
        super(strength, name, health, defensive, offensive, type, defensive1, name1);
    }

    public Phyltre(String name, String type, int defensive, String name1) {
        super(name, type, defensive, name1);
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
    public int getDefensive() {
        return super.getDefensive();
    }

    @Override
    public void setDefensive(int defensive) {
        super.setDefensive(defensive);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public String getImage() {
        return super.getImage();
    }

    @Override
    public void setImage(String image) {
        super.setImage(image);
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
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Phyltre(String type, int defensive, String name) {
        super(type, defensive, name);
    }
}
