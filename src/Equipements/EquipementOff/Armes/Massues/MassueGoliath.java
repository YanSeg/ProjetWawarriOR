package Equipements.EquipementOff.Armes.Massues;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class MassueGoliath extends Massue {


    public MassueGoliath()

    {
        super("feu","Massue de Goliath", 10);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mace1());
        String description = "Une massue imposante, taillée dans un tronc d'arbre géant, capable de briser les os de n'importe quel ennemi.";
        setDescription(description);
    }
}