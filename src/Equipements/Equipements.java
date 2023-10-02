package Equipements;

import Equipements.EquipementDef.EquipementDefensif;
import Equipements.EquipementOff.EquipementOffensif;
import Menu.MenuJeu;
import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;
import PlateuDeJeu.Cases;

import java.sql.SQLOutput;

import static PlateuDeJeu.Son.Son.playIntro;

public abstract class Equipements implements Cases {


    @Override
    public String interact(Personnage player) {

        System.out.println("CASE EQUIP");
        System.out.println(player);
        System.out.println(this);
        System.out.println(image);

        if (this instanceof EquipementOffensif) {
            player.setEquipemenOf(this);
        }
        if (this instanceof EquipementDefensif) {
        player.setEquipementDef(this);
        }

        System.out.println(player);

        return "IN_PROGRESS";
    }


    private String type;
    private String name;
    private String image;
    private int strength;
    private String description;


    @Override
    public String toString() {
        return name + '\n' +
                image + '\n' +
                "Force def ou of de l'équipement  :" + strength + '\n' +
                description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Equipements(String type, String name, int strength) {
        this.type = type;
        this.name = name;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}