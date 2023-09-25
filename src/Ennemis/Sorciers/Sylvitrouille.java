package Ennemis.Sorciers;


import Images.ASCII_Representations;

public class Sylvitrouille extends Sorcier {
    public Sylvitrouille() {


        super("Ennemis", "Sylvitrouille", 5, 5, "Citrouille", "Marshmello");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.citrouille());
    }

}
