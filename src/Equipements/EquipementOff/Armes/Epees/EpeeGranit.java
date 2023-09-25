package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeGranit extends Epee {
    public EpeeGranit() {
        super("Roche", "Épée de Granit", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.sword2());
        String description = "Une épée massive taillée dans le granit, elle est incroyablement solide et peut briser n'importe quelle défense.";
        setDescription(description);
    }}
