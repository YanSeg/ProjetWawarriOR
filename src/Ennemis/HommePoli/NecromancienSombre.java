package Ennemis.HommePoli;

import Ennemis.Ennemi;
import Images.Choupi;

public class NecromancienSombre extends Ennemi {

    public NecromancienSombre() {
        super("Ennemis", "Le Necromancien Sombre", 10, 10, "La Hache de la Ruine", "Le Masque de l'Éclipse");
        Choupi image = new Choupi();
        setImage(image.leV());
    }
}
