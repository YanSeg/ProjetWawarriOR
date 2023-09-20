package Equipements.EquipementOff.Armes.Massues;

import Images.Choupi;

public class MassueChaos extends Massue{

    public MassueChaos() {
        super("Ombre","Massue du Chaos Primordial", 36);
        Choupi image = new Choupi();
        setImage(image.mace5());
        String description = "Une massue d'une étrange matière sombre, elle est imprégnée du pouvoir du chaos lui-même, causant la discorde où qu'elle frappe.";
        setDescription(description);
    }

}
