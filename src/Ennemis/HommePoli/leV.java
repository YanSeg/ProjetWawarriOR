package Ennemis.HommePoli;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class leV extends HommePo {



    public leV() {
        super("Ennemis", "Le Necromancien Sombre", 10, 10, "La Hache de la Ruine", "Le Masque de l'Éclipse");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.leV());
    }
}
