package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeSombre extends Epee {
    private final String REPRESENTATION = ASCII_Representations.sword2();



    public EpeeSombre() {
        super("Ombre", "Lame Ténébreuse", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Une épée imprégnée de ténèbres, capable de drainer la vie de ses victimes à chaque attaque.";
        setDescription(description);
    }
}
