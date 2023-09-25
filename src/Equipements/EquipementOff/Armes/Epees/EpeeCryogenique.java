package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeCryogenique extends Epee{

    private final String REPRESENTATION = ASCII_Representations.sword3();

    @Override
    public String toString() {
        return "EpeeCryogenique{" +
                "type='" + type + '\'' +
                ", strenght=" + strenght +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public EpeeCryogenique() {

        super("Glace", "Lame Cryogénique", 16);
        setImage(REPRESENTATION);
        String description = "Une lame magique qui émet une onde de froid intense, congelant les adversaires en un instant.";
        setDescription(description);
    }

}
