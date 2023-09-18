package PlateuDeJeu.Cases;

import Ennemi.LucklSkywalker;
import Personnages.Personnage;


public class CaseEnnemi  implements Cases{


    @Override
    public void interact (Personnage player) {

        System.out.println("La case 2");
        LucklSkywalker luck = new LucklSkywalker();
        int result =(player.gethealth()-luck.gethealth());
        player.setHealth(result);
        System.out.println(player.gethealth());

    }
}

