package Equipements;

import Personnages.Personnage;
import PlateuDeJeu.Cases.Cases;
import PlateuDeJeu.BoardFactory;

public abstract class Equipements  implements Cases {

    private String type;
    private int strength;
    private String name;
    private String image;
    private int health;
    private int defensive;
    private int offensive;
    private String description;
//    package-protected String test = "test";

    protected Equipements equipement;




    @Override
    public void interact(Personnage player, BoardFactory plateauDuJeu) {

//
//
//
//
//
//        if (plateauDuJeu.getCases() instanceof Potions) {
//            System.out.println("WELL DONE DUDE");
//            space();
//            int a = this.getHealth();
//            int b = player.getHealth();
//            int h = a + b;
//            player.setHealth(h);
//            int c = this.getStrength();
//            int d = player.getStrength();
//            int j = c + d;
//            player.setStrength(j);
//            System.out.println(player);
//            space();
//        } else if( isUsable(player)) {
//            if (plateauDuJeu.getCases() instanceof EquipementOffensif) {
//                player.setEquipemenOf(this.equipement);
//                System.out.println("VOUS AVEZ RECUP :" + equipement.getName());
//                space();
//                System.out.println(this.equipement);
//            }
//            if (plateauDuJeu.getCases() instanceof EquipementDefensif) {
//                player.setEquipementDef(this.equipement);
//                System.out.println("VOUS AVEZ RECUP :" + equipement.getName());
//                space();
//                System.out.println(this.equipement);
//            }
//
//        } else {
//            System.out.println("Rien à récupérer pour vous manant");
//        }
//
//


    }

    public String getType() {
        return type;
    }

    public abstract boolean isUsable(Personnage player);


    public Equipements(int strength, String name, int health, int defensive, int offensive) {
        this.strength = strength;
        this.name = name;
        this.health = health;
        this.defensive = defensive;
        this.offensive = offensive;
    }



    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }


    public Equipements(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Equipements{" +
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

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefensive() {
        return defensive;
    }

    public void setDefensive(int defensive) {
        this.defensive = defensive;
    }

    public int getOffensive() {
        return offensive;
    }

    public void setOffensive(int offensive) {
        this.offensive = offensive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public Equipements() {
    }
}
