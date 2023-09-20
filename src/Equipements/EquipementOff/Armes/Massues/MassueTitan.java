package Equipements.EquipementOff.Armes.Massues;

import Images.Choupi;

public class MassueTitan extends Massue{
    public MassueTitan()

    {
        super("Massue du Titan de Pierre", 10);
        Choupi image = new Choupi();
        setImage(image.mace2());
        String description =  "Une massue massive sculptée à partir de la roche solide des montagnes, capable d'écraser les ennemis sous son poids.";
        setDescription(description);
    }
}