package Ennemi;

public class Sylvitrouille extends Ennemi {
    public Sylvitrouille(String name, String type, int health, Integer strength, String offensive, String defensive) {
        super(name, type, health, strength, offensive, defensive);
    }

    public Sylvitrouille() {
        super("Sylvitrouille", "Ennemi", 5, 5, "Citrouille", "Marshmello");
    }


}
