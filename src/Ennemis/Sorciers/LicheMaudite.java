package Ennemis.Sorciers;

import Ennemis.Ennemi;
import Images.Choupi;

public class LicheMaudite extends Sorcier {


    public LicheMaudite() {
        super("Ennemis", "La Liche Maudite", 7, 10, "L'Ombre des ténèbres", "Le ShadowSpell");
        Choupi image = new Choupi();
        setImage(image.creepymaneyes());
    }
}

