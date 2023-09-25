package Ennemis.JeuFilm;

import Images.ASCII_Representations;

public class IronMan extends SuperHero {
    public IronMan() {
        super("Ennemis","IronMan ", 8, 12, "Mark II", "Mark II");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.ironMan());
    }


}