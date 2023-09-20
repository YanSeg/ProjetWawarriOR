package Equipements.EquipementOff.Armes.Massues;

import Images.Choupi;

public class MassueGardien extends Massue{

        public MassueGardien() {
            super("Ombre","Massue du Gardien Ancien", 16);
            Choupi image = new Choupi();
            setImage(image.mace5());
            String description =  "Une massue utilisée par les gardiens anciens pour protéger des lieux sacrés, elle est lourde et indestructible, garantissant une défense inébranlable.";;
            setDescription(description);
        }

    }


