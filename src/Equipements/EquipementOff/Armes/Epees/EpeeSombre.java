package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeSombre extends Epee {
    public EpeeSombre() {
        super("Ombre", "Lame Ténébreuse", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.sword5());
        String description = "Une épée imprégnée de ténèbres, capable de drainer la vie de ses victimes à chaque attaque.";
        setDescription(description);
    }
}
