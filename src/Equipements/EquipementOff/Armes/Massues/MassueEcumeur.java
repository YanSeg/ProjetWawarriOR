package Equipements.EquipementOff.Armes.Massues;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class MassueEcumeur extends Massue  {

    public MassueEcumeur() {
        super("Terre","Masse", 15);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mace4());
        String description = "Une massue forgée à partir d'os de créatures marines géantes, elle émet un bruit de vagues déchaînées lorsqu'elle frappe, terrifiant les ennemis.";
        setDescription(description);
    }


}
