package Ennemis.Gobelin;

import Ennemis.Ennemi;
import Images.Choupi;

public class Furie extends Gobelin {

    public Furie() {
        super("Gobelin", "Furie l'Écumante", 3, 5, "Trident empoisonné", "Écailles toxiques");
        Choupi image = new Choupi();
        setImage(image.mankrip2());

        String description =
                "Furie est une gobeline impitoyable qui manie un trident empoisonné. Ses écailles émettent un venin mortel";
        setDescription(description);
    }

}
