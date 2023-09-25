package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeInfernale extends Epee{

    public EpeeInfernale() {
        super("Feu", "Épée Infernale", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.sword4());
        String description = "Une épée d'origine infernale qui crache des flammes enragées à chaque coup, transformant les ennemis en cendres.";
        setDescription(description);
    }

}
