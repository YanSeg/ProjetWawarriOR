package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Zigzag extends Ennemi {

    public Zigzag() {
        super("Gobelin", "Zigzag l'Éclair", 3, 8, "Baguette magique électrique", "Cape d'énergie électrique");
        Choupi image = new Choupi();
        setImage(image.monsterblup());
        String description =
                "Zigzag est un gobelin espiègle qui lance des éclairs avec sa baguette. Sa cape électrique le protège des attaques.";
        setDescription(description);

    }
}
