package Equipements.EquipementOff.Armes.Epees;

import Images.Choupi;

public class EpeeGranit extends Epee {
    public EpeeGranit() {
        super("Roche", "Épée de Granit", 16);
        Choupi image = new Choupi();
        setImage(image.sword2());
        String description = "Une épée massive taillée dans le granit, elle est incroyablement solide et peut briser n'importe quelle défense.";
        setDescription(description);
    }}
