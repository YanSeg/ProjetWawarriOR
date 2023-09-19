package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Brûlok extends Ennemi {
    public Brûlok() {
        super("Gobelin", "Le Troll Truculent", 3, 5, "Lance enflammée", "Bouclier ignifugé");
        Choupi image = new Choupi();
        setImage(image.magenoir());

        String description =
                " Brûlok est un gobelin pyromane qui manie une lance enflammée. Son bouclier ignifugé le protège des flammes";
        setDescription(description);
    }
}
