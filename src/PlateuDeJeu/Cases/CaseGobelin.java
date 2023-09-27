package PlateuDeJeu.Cases;

import Ennemis.Ennemi;
import Ennemis.Gobelin.Gobelin;
import Images.ASCII_Representations;

import static PlateuDeJeu.ArrayListCases.getRandomGoblin;

public class CaseGobelin extends Ennemi {
    private final String REPRESENTATION = ASCII_Representations.messageGobelin();
    Gobelin gobelin = getRandomGoblin();


//    @Override
//    public void interact(Personnage player) {
//
//        Gobelin gobelin = arrayDesGobelins();
//
//        System.out.println(REPRESENTATION);
//        System.out.println("VOUS FAITES FACE A UN GOBELIN");
//
//        System.out.println(gobelin);
//
//    }


}
//    @Override
//    public void interact(Personnage player) {
//
//        ArrayListCases plty = new ArrayListCases();
//        ArrayList<Gobelin> arrayListEnnemis = plty.arrayDesGobelins();
//        Collections.shuffle(arrayListEnnemis);
//        Ennemi ennemiRandom = arrayListEnnemis.get(3);
//
//
//
//        ASCII_Representations choup = new ASCII_Representations();
//        System.out.println(choup.messageGobelin());
//
//        System.out.println(ennemiRandom);
//        System.out.println("\033[H\033[2J");
//
//        System.out.println("Vous attaquez en premier");
//
//        int attaque = (player.getStrength()- ennemiRandom.getHealth());
//        ennemiRandom.setHealth(attaque);
//        if (ennemiRandom.getHealth()<0){
//            System.out.println("Vous Gagnez ce combat");
//        }else {
//            int result = (player.gethealth() - ennemiRandom.getStrength());
//            player.setHealth(result);
//            System.out.println(player.gethealth());
//        }
//        if (player.gethealth()<0){
//            System.out.println("Vous êtes mort");
//            player = null;
//
//        }
//    }


