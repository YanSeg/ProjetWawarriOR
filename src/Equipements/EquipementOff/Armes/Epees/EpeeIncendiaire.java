package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeIncendiaire extends Epee{

    private final String REPRESENTATION = ASCII_Representations.sword1();


    public EpeeIncendiaire() {
        super("Feu", "Lame Incendiaire", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Une épée enflammée qui embrase les ennemis au contact, créant des flammes dévastatrices.";
        setDescription(description);
    }
}
