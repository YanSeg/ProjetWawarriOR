package Ennemis.Dragons;

import Ennemis.Ennemi;
import Images.Choupi;

public class Drakarion extends Dragon {
    public Drakarion() {
        super("Feu", "Drakarion le Feu-Éternel", 20, 20, "Manipulation des flammes",  "Capacité de vol rapide pour échapper aux attaques");
        Choupi image = new Choupi();
        setImage(image.dragon5());

        String description =
                "Drakarion, un dragon colossal au souffle de feu brûlant, est protégé par des écailles incandescentes. Sa maîtrise des flammes en fait un destructeur redoutable.";
        setDescription(description);
    }
}