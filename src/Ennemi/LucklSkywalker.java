package Ennemi;

public class LucklSkywalker extends Ennemi {
    public LucklSkywalker(String name, String type, int health, Integer strength, String offensive, String defensive) {
        super(name, type, health, strength, offensive, defensive);

    }

    public LucklSkywalker() {
        super("LucKSky", "Jedi", 225151, 666, "Sabre", "LaForce");
    }

    public LucklSkywalker(String type) {
        super(type);
    }

    public LucklSkywalker(String type, String name) {
        super(type, name);
    }


}
