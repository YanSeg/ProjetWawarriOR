package Equipements.PotionsPoisons.PotionsStandard;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;

public class PotiondeVie extends Potions {

    @Override
    public void interact(Personnage player) {

    }

    public PotiondeVie() {
        super( 0,"Potion de vie",0,0,0);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion1());
        String description = "15 pts de vie";
        setDescription(description);

    }
}
