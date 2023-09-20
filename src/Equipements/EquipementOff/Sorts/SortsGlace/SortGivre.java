package Equipements.EquipementOff.Sorts.SortsGlace;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortGivre extends Sorts {
    public SortGivre() {
        super("Glace", "Lance de Givre", 22);
        Choupi image = new Choupi();
        setImage(image.ice5());
        String description = "Un sort glacial qui crée une lance de givre tranchante, capable de geler et de transpercer les ennemis.";
        setDescription(description);
    }


}
