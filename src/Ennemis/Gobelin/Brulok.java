package Ennemis.Gobelin;

import Images.Choupi;

public class Brulok extends Gobelin {
    public Brulok() {
        super("Gobelin", "Le Troll Truculent", 3, 5, "Lance enflammée", "Bouclier ignifugé");
        Choupi image = new Choupi();
        setImage(image.magenoir());

        String description =
                " Brûlok est un gobelin pyromane qui manie une lance enflammée. Son bouclier ignifugé le protège des flammes";
        setDescription(description);
    }
}
