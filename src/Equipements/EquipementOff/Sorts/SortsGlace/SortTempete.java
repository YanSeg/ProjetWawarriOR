package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortTempete extends Sorts {


    public SortTempete() {
        super("Glace", "Tempête de Glace", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.ice6());
        String description = "Une tempête de glace tourbillonnante qui congèle tout sur son passage, créant un paysage gelé.";
        setDescription(description);
    }
}
