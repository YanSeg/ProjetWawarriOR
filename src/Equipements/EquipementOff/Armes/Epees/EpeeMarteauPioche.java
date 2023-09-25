package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeMarteauPioche extends Epee{
    private final String REPRESENTATION = ASCII_Representations.sword4();
    @Override
    public String toString() {
        return "EpeeMarteauPioche{" +
                "type='" + type + '\'' +
                ", strenght=" + strenght +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public EpeeMarteauPioche() {
        super("Roche", "Marteau-Pioche Épée", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(REPRESENTATION);
        String description = "Une arme polyvalente qui combine une épée acérée avec une pioche, idéale pour tailler la pierre et affronter les ennemis.";
        setDescription(description);
    }

}
