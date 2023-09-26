package Equipements.EquipementOff.Armes.Massues;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class MassueChaos extends Massue{



    public MassueChaos() {
        super("Ombre","Massue du Chaos Primordial", 36);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mace5());
        String description = "Une massue d'une étrange matière sombre, elle est imprégnée du pouvoir du chaos lui-même, causant la discorde où qu'elle frappe.";
        setDescription(description);
    }

}
