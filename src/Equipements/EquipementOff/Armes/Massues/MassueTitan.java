package Equipements.EquipementOff.Armes.Massues;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class MassueTitan extends Massue{


    public MassueTitan()

    {
        super("Glace","Massue du Titan de Pierre", 30);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mace2());
        String description =  "Une massue massive sculptée à partir de la roche solide des montagnes, capable d'écraser les ennemis sous son poids.";
        setDescription(description);
    }
}