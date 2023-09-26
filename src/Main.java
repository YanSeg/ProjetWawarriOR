//import Enum.EnnemisEnnum.EnnemiEnum;
import Ennemis.Ennemi;
import Enum.EnnemisEnum.enumEnnemi;
import PlateuDeJeu.Son.Son;

import static MiseEnPage.MiseEnPage.space;
import static PlateuDeJeu.Son.Son.*;

public class Main {
    public static void main(String[] args) {

//


        enumEnnemi ennemiEnum = enumEnnemi.DRAGON;

        Ennemi randomSorcier = ennemiEnum.getRandomEnnemi();

        ennemiEnum.displayrandomEnum(randomSorcier);


playIntro();

        Menu menu = new Menu();

        space();

        menu.startMenu();


    }
}




