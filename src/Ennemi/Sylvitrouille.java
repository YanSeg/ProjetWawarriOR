package Ennemi;


import Images.Choupi;

public class Sylvitrouille extends Ennemi {
    public Sylvitrouille() {


        super("Ennemi", "Sylvitrouille", 5, 5, "Citrouille", "Marshmello");
        Choupi image = new Choupi();
        setImage(image.citrouille());
    }

}
