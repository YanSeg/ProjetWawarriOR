package Ennemis.Dragons;

import Images.Choupi;

public class Terramor extends Dragon{
    public Terramor() {
        super("Terre", "Terramor le Terre-Briseur", 20, 20, "Manipulation des roches",  "Capacité à se fondre dans le sol");
        Choupi image = new Choupi();
        setImage(image.dragon1());

        String description =
                "Terramor, géant de pierre, secoue la terre sous son passage. Il est presque indestructible grâce à son armure rocheuse et à sa capacité à disparaître dans le sol.";
        setDescription(description);
    }
}
