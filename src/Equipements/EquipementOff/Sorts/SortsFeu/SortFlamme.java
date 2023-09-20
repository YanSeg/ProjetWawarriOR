package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortFlamme extends Sorts {
    public SortFlamme() {
        super("Feu", "Flammes Tourbillonnantes", 16);
        Choupi image = new Choupi();
        setImage(image.fire3());
        String description = "Un tourbillon de flammes tournoyantes qui dévaste les ennemis, les réduisant en cendres.";
        setDescription(description);
    }

}
