package Equipements.EquipementOff.Armes.Epees;

import Images.Choupi;

public class EpeeDesOmbres extends Epee{

    public EpeeDesOmbres() {
        super("Ombre", "Épée de l'Éclipse Noire", 16);
        Choupi image = new Choupi();
        setImage(image.sword5());
        String description = "Une épée noire mystique créée lors d'une éclipse, elle engloutit la lumière et absorbe la puissance des ténèbres.";
        setDescription(description);
    }
}