package Ennemis.HommePoli;

import Images.Choupi;

public class leV extends HommePo {

    public leV() {
        super("Ennemis", "Le Necromancien Sombre", 10, 10, "La Hache de la Ruine", "Le Masque de l'Éclipse");
        Choupi image = new Choupi();
        setImage(image.leV());
    }
}
