package Ennemi;


import Images.Choupi;

public class Sylvitrouille extends Ennemi {
    public Sylvitrouille() {


        super("Ennemi", "Sylvitrouille", 5, 5, "Citrouille", "Marshmello");
        Choupi cc = new Choupi();
        setImage(cc.citrouille());
    }




}
