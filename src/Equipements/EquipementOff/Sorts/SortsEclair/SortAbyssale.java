package Equipements.EquipementOff.Sorts.SortsEclair;

import Equipements.EquipementOff.Sorts.Sorts;
import Images.Choupi;

public class SortAbyssale extends Sorts {

    public SortAbyssale() {
        super("Ombre","Fulgurance Abyssale", 0);
        Choupi image = new Choupi();
        setImage(image.eclair6());
        String description = "Une fulgurance venue des abysses, créant un éclair d'ombre terrifiant qui déchire l'espace et le temps.";
        setDescription(description);
    }

}
