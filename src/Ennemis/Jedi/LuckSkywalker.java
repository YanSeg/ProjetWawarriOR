package Ennemis.Jedi;

import Ennemis.Ennemi;
import Images.Choupi;

public class LuckSkywalker extends Ennemi {
    public LuckSkywalker() {
        super("Ennemis", "Luck", 50, 50, "Le Sabre Laser", "La Force");
        Choupi image = new Choupi();
        setImage(image.luckSky());
    }





}
