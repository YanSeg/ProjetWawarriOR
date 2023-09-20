package Equipements.EquipementOff.Armes.Epees;

import Images.Choupi;

public class EpeeIncendiaire extends Epee{

    public EpeeIncendiaire() {
        super("Feu", "Lame Incendiaire", 16);
        Choupi image = new Choupi();
        setImage(image.sword4());
        String description = "Une épée enflammée qui embrase les ennemis au contact, créant des flammes dévastatrices.";
        setDescription(description);
    }
}
