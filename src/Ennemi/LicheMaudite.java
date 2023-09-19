package Ennemi;

import Images.Choupi;

public class LicheMaudite extends Ennemi {


    public LicheMaudite() {
        super("Ennemi", "La Liche Maudite", 7, 10, "L'Ombre des ténèbres", "Le ShadowSpell");
        Choupi image = new Choupi();
        setImage(image.numflippant());
    }
}

