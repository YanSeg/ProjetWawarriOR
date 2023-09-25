package Ennemis.Sorciers;

import Images.ASCII_Representations;

public class LicheMaudite extends Sorcier {


    public LicheMaudite() {
        super("Ennemis", "La Liche Maudite", 7, 10, "L'Ombre des ténèbres", "Le ShadowSpell");
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.creepymaneyes());
    }
}

