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

    public String fightState() {

        if (player.getHealth() <= 0) {
            fightState.isPlayerDead();
            return "GAME_OVER";
        } else if (ennemi.getHealth() <= 0) {
            fightState.isEnnemiALive();
            return "ENNEMI_DEAD";
        } else {
            return "IN_PROGRESS";
        }
    }


    public String getResultRecursive() {

        fightState.etatCombattant(player, ennemi);

        playerAttac();
        if (ennemi.getHealth() <= 0) {
            fightState.etatCombattant(player, ennemi);
            return fightState();
        }
        ennemiAttac();
        if (player.getHealth() <= 0) {
            fightState.etatCombattant(player, ennemi);
            return fightState();
        }
        fightState.etatCombattant(player, ennemi);
        return getResultRecursive();
    }
}


