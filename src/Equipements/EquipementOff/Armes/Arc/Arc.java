package Equipements.EquipementOff.Armes.Arc;

import Equipements.EquipementOff.Armes.Armes;

public class Arc extends Armes {
    public Arc(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    @Override
    public String toString() {
        return super.toString();
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
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
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
    public int getStrenght() {
        return super.getStrenght();
    }

    @Override
    public void setStrenght(int strenght) {
        super.setStrenght(strenght);
    }
}