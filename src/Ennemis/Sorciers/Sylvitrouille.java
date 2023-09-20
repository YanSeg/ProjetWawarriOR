package Ennemis.Sorciers;


import Ennemis.Ennemi;
import Images.Choupi;

public class Sylvitrouille extends Sorcier {
    public Sylvitrouille() {


        super("Ennemis", "Sylvitrouille", 5, 5, "Citrouille", "Marshmello");
        Choupi image = new Choupi();
        setImage(image.citrouille());
    }

}
