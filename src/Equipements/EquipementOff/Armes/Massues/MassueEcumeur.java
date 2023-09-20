package Equipements.EquipementOff.Armes.Massues;

import Images.Choupi;

public class MassueEcumeur extends Massue  {

    public MassueEcumeur() {
        super("Masse", 15);
        Choupi image = new Choupi();
        setImage(image.mace4());
        String description = "Une massue forgée à partir d'os de créatures marines géantes, elle émet un bruit de vagues déchaînées lorsqu'elle frappe, terrifiant les ennemis.";
        setDescription(description);
    }
}
