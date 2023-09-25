package Ennemis.JeuFilm;

import Images.ASCII_Representations;

public abstract  class Goku extends SuperHero{
    public Goku() {
        super("Ennemis","IronMan ", 8, 12, "Mark II", "Mark II");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.san());
    }

}
