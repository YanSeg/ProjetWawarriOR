package Ennemis.Dragons;

import Images.ASCII_Representations;
import Personnages.Personnage;
import PlateuDeJeu.EquipementFactory;

public class Drakarion extends Dragon {



    public Drakarion() {
        super("Feu", "Drakarion le Feu-Éternel", 20, 20, EquipementFactory.createEquipDef(), EquipementFactory.createEquipOf());
        ASCII_Representations image = new ASCII_Representations();
        setImage(image.dragon5());

        String description =
                "Drakarion, un dragon colossal au souffle de feu brûlant, est protégé par des écailles incandescentes. Sa maîtrise des flammes en fait un destructeur redoutable.";
        setDescription(description);
    }
}
