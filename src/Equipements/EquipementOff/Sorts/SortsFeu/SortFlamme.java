package Equipements.EquipementOff.Sorts.SortsFeu;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortFlamme extends Sorts {
    @Override
    public void interact(Personnage player) {

    }

    public SortFlamme() {
        super("Feu", "Flammes Tourbillonnantes", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.fire3());
        String description = "Un tourbillon de flammes tournoyantes qui dévaste les ennemis, les réduisant en cendres.";
        setDescription(description);
    }

}
