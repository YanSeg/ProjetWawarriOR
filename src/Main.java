//import Enum.EnnemisEnnum.EnnemiEnum;

import Ennemis.Ennemi;
import Game.Game;
import Menu.MenuJeu;
import Enum.EnnemisEnum.EnumEnnemi;

import static PlateuDeJeu.Son.Son.*;

public class Main {
    public static void main(String[] args) {

        EnumEnnemi ennemiEnum = EnumEnnemi.DRAGON;
        Ennemi randomDragon = ennemiEnum.getRandomEnnemi();
        ennemiEnum.displayrandomEnum(randomDragon);

        playIntro();
        Game game = new Game();
        game.init();

    }
}
