package Equipements.EquipementOff.Armes.Epees;

import Images.Choupi;

public class EpeeInfernale extends Epee{

    public EpeeInfernale() {
        super("Feu", "Épée Infernale", 16);
        Choupi image = new Choupi();
        setImage(image.sword4());
        String description = "Une épée d'origine infernale qui crache des flammes enragées à chaque coup, transformant les ennemis en cendres.";
        setDescription(description);
    }

}
