package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeTriforce extends Epee{

    private final String REPRESENTATION = ASCII_Representations.swordLink();



    public EpeeTriforce() {
        super("Spéciale", "Épée de la Triforce", 30);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Une épée mystique forgée lors d'une éclipse rare, elle possède des pouvoirs incommensurables et peut déchaîner des attaques dévastatrices.";
        setDescription(description);
    }
}
