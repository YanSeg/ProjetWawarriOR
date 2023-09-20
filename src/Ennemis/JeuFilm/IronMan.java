package Ennemis.JeuFilm;

import Ennemis.Ennemi;
import Images.Choupi;

public class IronMan extends SuperHero {
    public IronMan() {
        super("Ennemis","IronMan ", 8, 12, "Mark II", "Mark II");
        Choupi image = new Choupi();
        setImage(image.ironMan());
    }


}