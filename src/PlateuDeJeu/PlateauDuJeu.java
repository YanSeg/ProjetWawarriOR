package PlateuDeJeu;

import Ennemis.Dragons.Dragon;
import Ennemis.Gobelin.Gobelin;
import Ennemis.Sorciers.Sorcier;
import Equipements.Equipements;
import PlateuDeJeu.Cases.CaseVide;
import PlateuDeJeu.Cases.Cases;
import PlateuDeJeu.Cases.InterfacePlateau;

import static PlateuDeJeu.ArrayListCases.*;
import static PlateuDeJeu.ArrayListCases.arrayDesEquipements;

public class PlateauDuJeu {
    private int positionPlayer = 0;

    private Cases cases;
    private Cases[] plateau;


    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }


    public int getPositionPlayer() {
        return positionPlayer;
    }

    public PlateauDuJeu(int positionPlayer) {

        this.positionPlayer = positionPlayer;
        Cases[] plateauT = new Cases[64];
        for (int i = 0; i < 64; i++) {
            plateauT[i] = new CaseVide();
        }
        int[] casesDragonsS = {45, 52, 56, 62};
        for (int caseDragon : casesDragonsS) {
            Dragon dragon = arrayDesDragons();
            plateauT[caseDragon] = dragon;
        }
        int[] caseSorciersS = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
        for (int caseSorcier : caseSorciersS) {
            Sorcier sorcier = arrayDesSorciers();
            plateauT[caseSorcier] = sorcier;
        }
        int[] caseGobelinsS = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        for (int caseGobelin : caseGobelinsS) {
            Gobelin gobelin = arrayDesGobelins();
            plateauT[caseGobelin] = gobelin;
        }
        int[] casesCaissesSurprises = {2, 11, 5, 22, 38, 19, 26, 42, 53, 1, 4, 8, 17, 23, 48, 49, 7, 13, 31, 33, 39, 43, 28, 41};
        for (int caseCaisseSurprise : casesCaissesSurprises) {

            Equipements equipements = arrayDesEquipements();

            plateauT[caseCaisseSurprise] = equipements;
        }

        this.plateau= plateauT;
    }

    public Cases[] getPlateau() {
        return plateau;
    }

    public void setPlateau(Cases[] plateau) {
        this.plateau = plateau;
    }

    public void setPositionPlayer(int positionPlayer) {
        this.positionPlayer = positionPlayer;
    }




}