package Ennemis.Gobelin;

import Images.ASCII_Representations;

public class Furie extends Gobelin {

    public Furie() {
        super("Gobelin", "Furie l'Écumante", 3, 5, "Trident empoisonné", "Écailles toxiques");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mankrip2());

        String description =
                "Furie est une gobeline impitoyable qui manie un trident empoisonné. Ses écailles émettent un venin mortel";
        setDescription(description);
    }

}
