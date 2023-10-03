package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.ASCII_Representations;
import Personnages.Personnage;

public class SortAbyssale extends Sorts {



    public SortAbyssale() {
        super("Ombre","Fulgurance Abyssale", 20);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.eclair6());
        String description = "Une fulgurance venue des abysses, créant un éclair d'ombre terrifiant qui déchire l'espace et le temps.";
        setDescription(description);
    }

}
