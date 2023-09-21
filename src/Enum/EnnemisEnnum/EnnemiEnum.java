//package Enum.EnnemisEnnum;
//
//import Ennemis.Dragons.*;
//import Ennemis.Gobelin.*;
//
//import java.util.Random;
//
//
//import java.util.Random;
//
//public enum EnnemiEnum {
//    DRAGON(new Aurorath(), new Drakarion(), new Terramor(), new Umbragon()),
//    GOBELIN(new Brulok(), new Furie(), new GhostandGoblin(), new Glacius(), new Grimmog(),
//            new Roublard(), new Sombra(), new TrollTruculent(), new Vorax(), new Zigzag());
//
//
//    private final Object[] dragons;
//   // private final Object[] gobelin;
//
//
//    EnnemiEnum(Object... dragons) {
//        this.dragons = dragons;
//    }
//
//    public Object getRandomDragon() {
//        if (dragons.length == 0) {
//            return null; // Pas de dragons disponibles
//        }
//        Random random = new Random();
//        int index = random.nextInt(dragons.length);
//        return dragons[index];
//    }

//    public Object getRandomGobelin() {
//        if (gobelin.length == 0) {
//            return null; // Pas de dragons disponibles
//        }
//        Random random = new Random();
//        int index = random.nextInt(gobelin.length);
//        return gobelin[index];
//    }

//}




