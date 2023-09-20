package Equipements.EquipementOff.Armes.Massues;

import Images.Choupi;

public class MassueFureur extends Massue {

    public MassueFureur() {

        super("Massue de la Fureur Sylvestre", 12);

        Choupi image = new Choupi();
        setImage(image.mace3());
        String description = "Une massue sculptée à partir du bois d'un arbre ancien, elle est imprégnée de la puissance de la nature et inflige des dégâts colossaux.";
        setDescription(description);
    }
}
