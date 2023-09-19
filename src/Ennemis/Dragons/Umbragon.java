package Ennemis.Dragons;

import Images.Choupi;

public class Umbragon extends Dragon{
    public Umbragon() {
        super("Obscurité", "Umbragon le Sombre-Mystique", 20, 20, "Manipulation de l'obscurité",  "Capacité à se fondre dans l'obscurité");
        Choupi image = new Choupi();
        setImage(image.dragon4());

        String description =
                "Umbragon, l'incarnation des ombres, joue avec la peur de ses ennemis grâce à ses illusions terrifiantes. Son corps obscur le rend insaisissable.";
        setDescription(description);
    }

}
