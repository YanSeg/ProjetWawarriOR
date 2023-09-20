package Equipements.EquipementOff.Armes.Epees;

import Images.Choupi;

public class EpeeGelee extends Epee{

    public EpeeGelee() {
        super("Glace", "Épée Gelée", 16);
        Choupi image = new Choupi();
        setImage(image.sword3());
        String description = "Une épée glaciale qui gèle les ennemis au contact, créant une aura de froid glacial.";
        setDescription(description);
    }
}
