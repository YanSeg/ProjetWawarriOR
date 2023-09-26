package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortGivre extends Sorts {


    public SortGivre() {
        super("Glace", "Lance de Givre", 22);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.ice5());
        String description = "Un sort glacial qui crée une lance de givre tranchante, capable de geler et de transpercer les ennemis.";
        setDescription(description);
    }


}
