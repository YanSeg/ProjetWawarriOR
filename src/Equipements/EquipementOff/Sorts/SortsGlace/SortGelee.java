package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortGelee extends Sorts {
    public SortGelee() {
        super("Glace", "Orbe Gelée", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.ice4());
        String description = "Un orbe gelé qui explose en libérant une vague de froid glacial, immobilisant les ennemis dans la glace.";
        setDescription(description);
    }


}
