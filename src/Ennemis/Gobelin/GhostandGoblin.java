package Ennemis.Gobelin;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class GhostandGoblin extends Gobelin {



    public GhostandGoblin() {
        super("Gobelin", "Arthur ", 1, 15, "Epée ", "Une armure qu'il perd souvent");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.bestoGG());
        String description =
                "Arthur est le principal protagoniste de la série de jeux vidéo Ghosts 'n Goblins. Transformé en goblin pour les besoins du jeu. Attention : you better don't mess with major Arthur";
        setDescription(description);

    }
}
