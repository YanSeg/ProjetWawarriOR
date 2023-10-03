package Ennemis;

import Menu.MenuJeu;
import Personnages.Personnage;

public class Fight {


    private Personnage player;

    private Ennemi ennemi;

    private final MenuJeu fightState = new MenuJeu();

    public Fight(Personnage player, Ennemi ennemi) {
        this.player = player;
        this.ennemi = ennemi;
    }


    public void playerAttac() {
        int ennemiNewLife = ennemi.getHealth() - (player.getStrength() + player.getEquipemenOf().getStrength());
        ennemi.setHealth(ennemiNewLife);
    }

    public void ennemiAttac() {
        int playerNewlife = player.getHealth() - (ennemi.getShield().getStrength() + ennemi.getHealth());
        player.setHealth(playerNewlife);
    }

    public String getResultRecursive() {
        String fightResult ="";
        fightState.etatCombattant(player, ennemi);
        playerAttac();
        if (ennemi.getHealth() <= 0) {
            fightState.etatCombattant(player, ennemi);

            fightResult = "ENNEMI_DEAD";
        } else if (player.getHealth() > 0 && ennemi.getHealth() > 0) {
            ennemiAttac();
            fightResult = "IN_PROGRESS";
        } else if ((player.getHealth()) <= 0) {
            fightState.isPlayerDead();
            fightResult =  "GAME_OVER";
        } else if (player.getHealth() > 0 && ennemi.getHealth() > 0) {
            fightState.etatCombattant(player, ennemi);
            System.out.println("Le combat continue");
            getResultRecursive();
        }
        return fightResult;
    }
}


