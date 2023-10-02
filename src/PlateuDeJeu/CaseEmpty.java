package PlateuDeJeu;

import Personnages.Guerriers.Guerrier;
import Personnages.Magiciens.Magicien;
import Personnages.Personnage;

public class CaseEmpty implements Cases {
    @Override
    public String interact(Personnage player) {
        return "IN_PROGRESS";
    }

}

