package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeGelee extends Epee{
    private final String REPRESENTATION = ASCII_Representations.sword4();

    public EpeeGelee() {
        super("Glace", "Épée Gelée", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Une épée glaciale qui gèle les ennemis au contact, créant une aura de froid glacial.";
        setDescription(description);
    }


}
