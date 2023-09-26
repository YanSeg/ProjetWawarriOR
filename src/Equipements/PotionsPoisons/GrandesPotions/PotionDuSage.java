package Equipements.PotionsPoisons.GrandesPotions;

import Images.ASCII_Representations;
import Equipements.PotionsPoisons.Potions;
import Personnages.Personnage;

public class PotionDuSage extends Potions {

    @Override
    public String toString() {
        return "PotionDuSage{" +
                "type='" + type + '\'' +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", health=" + health +
                ", defensive=" + defensive +
                ", offensive=" + offensive +
                ", description='" + description + '\'' +
                '}';
    }



    public PotionDuSage() {
        super(8, "Potion d'attaque", 20, 12, 8);
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.potion12());
        String description = "Une grande potion qui restaure principalement le vie, mais aussi un peu de points de défence.";
        setDescription(description);
    }
}