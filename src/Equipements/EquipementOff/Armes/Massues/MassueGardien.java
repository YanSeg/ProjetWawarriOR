package Equipements.EquipementOff.Armes.Massues;

import Images.ASCII_Representations;
import Personnages.Personnage;

public class MassueGardien extends Massue{

        public MassueGardien() {
            super("Glace","Massue du Gardien Ancien", 16);
            ASCII_Representations image = new ASCII_Representations();
            setImage(image.mace5());
            String description =  "Une massue utilisée par les gardiens anciens pour protéger des lieux sacrés, elle est lourde et indestructible, garantissant une défense inébranlable.";;
            setDescription(description);
        }


}


