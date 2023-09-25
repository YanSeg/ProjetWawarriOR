package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeGranit extends Epee {
    private final String REPRESENTATION = ASCII_Representations.sword5();

    public EpeeGranit() {
        super("Roche", "Épée de Granit", 10);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Une épée massive taillée dans le granit, elle est incroyablement solide et peut briser n'importe quelle défense.";
        setDescription(description);
    }
}
