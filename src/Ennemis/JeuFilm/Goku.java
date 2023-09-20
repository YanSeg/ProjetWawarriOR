package Ennemis.JeuFilm;

import Images.Choupi;

public abstract  class Goku extends SuperHero{
    public Goku() {
        super("Ennemis","IronMan ", 8, 12, "Mark II", "Mark II");
        Choupi image = new Choupi();
        setImage(image.san());
    }

}
