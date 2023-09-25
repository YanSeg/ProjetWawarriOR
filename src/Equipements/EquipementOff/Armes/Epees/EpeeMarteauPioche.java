package Equipements.EquipementOff.Armes.Epees;

import Images.ASCII_Representations;

public class EpeeMarteauPioche extends Epee{

    public EpeeMarteauPioche() {
        super("Roche", "Marteau-Pioche Épée", 16);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.sword2());
        String description = "Une arme polyvalente qui combine une épée acérée avec une pioche, idéale pour tailler la pierre et affronter les ennemis.";
        setDescription(description);
    }

}
