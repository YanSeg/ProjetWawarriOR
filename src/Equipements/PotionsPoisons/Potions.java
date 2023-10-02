package Equipements.PotionsPoisons;

import Equipements.Equipements;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;
import PlateuDeJeu.BoardFactory;
import PlateuDeJeu.Cases;

public abstract class Potions implements Cases {

    @Override
    public String toString() {
        return "Vous avez accès à "+ name + '\n' +
                description + '\n' +
                 image + '\n' +
                "Vie |" + givehealth + "   Force |" + giveStrength;
    }

    @Override
    public String interact(Personnage player) {

        System.out.println("CASE POTION");
        System.out.println(image);
        System.out.println(player);
        System.out.println(this);

        toString();
        player.setHealth(player.getHealth() + this.givehealth);
        player.setStrength(player.getStrength() + this.giveStrength);

        System.out.println(player);


        return "IN_PROGRESS";
    }



    private String name;
    private String description;
    private String image;
    private int givehealth;

    private int giveStrength;



    public Potions(String name, int givehealth, int giveStrength) {
        this.name = name;
        this.givehealth = givehealth;
        this.giveStrength = giveStrength;
    }





    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGivehealth() {
        return givehealth;
    }

    public void setGivehealth(int givehealth) {
        this.givehealth = givehealth;
    }

    public int getGiveStrength() {
        return giveStrength;
    }

    public void setGiveStrength(int giveStrength) {
        this.giveStrength = giveStrength;
    }
}


