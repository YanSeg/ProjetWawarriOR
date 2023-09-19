package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class GhostandGoblin extends Ennemi {

    public GhostandGoblin() {
        super("Gobelin", "Arthur ", 1, 15, "Epée ", "Une armure qu'il perd souvent");
        Choupi image = new Choupi();
        setImage(image.bestoGG());
        String description =
                "Arthur est le principal protagoniste de la série de jeux vidéo Ghosts 'n Goblins. Transformé en goblin pour les besoins du jeu. Attention : you better don't mess with major Arthur";
        setDescription(description);

    }
}
