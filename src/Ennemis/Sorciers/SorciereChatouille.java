package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class SorciereChatouille extends Sorcier {

    public SorciereChatouille() {
        super("Ennemis", "La Sorcière à Chatouille", 5, 6, "Doigts soigneux", "Cape");
        Choupi image = new Choupi();
        setImage(image.girl2());
    }
}