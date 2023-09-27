package Ennemis.Jedi;

import Ennemis.Ennemi;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class LuckSkywalker extends Ennemi {


    public LuckSkywalker() {
        super("Ennemis", "Luck", 50, 50, "Le Sabre Laser", "La Force");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.luckSky());
    }

    @Override
    public void interact(Personnage player) {

    }
}
