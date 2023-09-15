package Personnages.Guerriers;
import Personnages.Personnage;

public class Guerrier extends Personnage {
    public Guerrier(String name) {
        super(name, "Guerrier", 10, 10, "arme", "bouclier");
    }
    public Guerrier() {
    }


    public Guerrier(String type, String name) {
        super(type, name);
    }
}
