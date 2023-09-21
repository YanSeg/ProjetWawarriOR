package Enum.EnnemisEnum;

import Ennemis.Dragons.*;
import Ennemis.Ennemi;
import Ennemis.Gobelin.*;
import Ennemis.Sorciers.*;

import java.util.Random;

public enum enumEnnemi {
    DRAGON(new Aurorath(), new Drakarion(), new Terramor(), new Umbragon()),
    GOBELIN(new Brulok(), new Furie(), new GhostandGoblin(), new Glacius(), new Grimmog(),
            new Roublard(), new Sombra(), new TrollTruculent(), new Vorax(), new Zigzag()),
    SORCIERS(new GandRalf(), new GouleGlouton(), new LeCheveuduDiable(), new LeSexyMan(), new LicheMaudite(), new SorciereChatouille(), new SorciereXena(), new SpectreDeNuit(), new Sylvitrouille(), new WendigoSanguinaire());


    private final Ennemi[] allEnnemis;

    enumEnnemi(Ennemi... allEnnemis) {      // ... car on peut construire plusieurs Ennemi
        this.allEnnemis = allEnnemis;
    }


    public Ennemi getRandomEnnemi() {
//        if (allEnnemis.length == 0) {
//            return null;
//        }
        Random random = new Random();
        int index = random.nextInt(allEnnemis.length);
        return allEnnemis[index];

    }

    public void displayrandomEnum(Ennemi randomSorcier) {

//        if (randomSorcier != null) {
        System.out.println(randomSorcier);
//        } else {
//            System.out.println("Aucun dragon disponible.");
//        }
//        }

    }
}

//    enumEnnemi ennemiEnum = enumEnnemi.DRAGON;
//
//    Ennemi randomSorcier = ennemiEnum.getRandomEnnemi();
//
//        ennemiEnum.displayrandomEnum(randomSorcier);
//



