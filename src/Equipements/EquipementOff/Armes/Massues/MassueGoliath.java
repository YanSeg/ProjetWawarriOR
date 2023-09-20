package Equipements.EquipementOff.Armes.Massues;

import Images.Choupi;

public class MassueGoliath extends Massue {

    public MassueGoliath()

    {
        super("Massue de Goliath", 10);
        Choupi image = new Choupi();
        setImage(image.mace1());
        String description = "Une massue imposante, taillée dans un tronc d'arbre géant, capable de briser les os de n'importe quel ennemi.";
        setDescription(description);
    }
}