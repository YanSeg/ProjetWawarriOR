package Ennemi;

import Images.Choupi;

public class LeCheveuduDiable extends Ennemi{

    public LeCheveuduDiable() {
        super("Ennemi", "L'Écorcheur de Chair", 5, 5, "La Harpie Sanguinaire", "Le Masque de l'Éclipse");
        Choupi image = new Choupi();
        setImage(image.scaryman());
    }
}
