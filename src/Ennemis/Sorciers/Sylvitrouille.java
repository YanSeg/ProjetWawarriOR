package Ennemis.Sorciers;


import Images.ASCII_Representations;
import Personnages.Personnage;

public class Sylvitrouille extends Sorcier {
    @Override
    public void interact(Personnage player) {

    }

    public Sylvitrouille() {


        super("Ennemis", "Sylvitrouille", 5, 5, "Citrouille", "Marshmello");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.citrouille());
    }

}
