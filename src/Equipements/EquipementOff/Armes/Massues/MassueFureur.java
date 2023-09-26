package Equipements.EquipementOff.Armes.Massues;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class MassueFureur extends Massue {



    public MassueFureur() {

        super("Terre","Massue de la Fureur Sylvestre", 12);

        ASCII_Representations image = new ASCII_Representations();
        setImage(image.mace3());
        String description = "Une massue sculptée à partir du bois d'un arbre ancien, elle est imprégnée de la puissance de la nature et inflige des dégâts colossaux.";
        setDescription(description);
    }
}
