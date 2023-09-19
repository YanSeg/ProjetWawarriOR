package Ennemi;

import Images.Choupi;

public class SorciereChatouille extends Ennemi {

    public SorciereChatouille() {
        super("Ennemi", "La Sorcière à Chatouille", 5, 6, "Doigts soigneux", "Cape");
        Choupi image = new Choupi();
        setImage(image.girl2());
    }
}