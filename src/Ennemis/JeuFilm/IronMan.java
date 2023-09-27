package Ennemis.JeuFilm;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class IronMan extends SuperHero {
    @Override
    public void interact(Personnage player) {

    }

    public IronMan() {
        super("Ennemis","IronMan ", 8, 12, "Mark II", "Mark II");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.ironMan());
    }


}