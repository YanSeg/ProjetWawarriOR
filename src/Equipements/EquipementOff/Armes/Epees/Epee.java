package Equipements.EquipementOff.Armes.Epees;

import Equipements.EquipementOff.Armes.Armes;
import Personnages.Guerriers.Guerrier;
import Personnages.Personnage;

public class Epee extends Armes {
    @Override
    public void interact(Personnage player) {

    }

    @Override
    public boolean isUsable(Personnage player) {
        return player instanceof Guerrier;
    }

    public Epee(String offensifType, String offensifName, int offensifStrenght) {
        super(offensifType, offensifName, offensifStrenght);
    }

    public Epee() {
    }

    public Epee(String offensifType, String offensifName, int offensifStrenght, String image) {
        super(offensifType, offensifName, offensifStrenght, image);
    }

    @Override
    public String toString() {
        return "Epee{" +
                "type='" + type + '\'' +
                ", strenght=" + strenght +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
