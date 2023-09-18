package PlateuDeJeu.Cases;

import Equipements.EquipementOff.Armes.Armes;
import Personnages.Personnage;

public class CaseArme implements Cases {

    @Override
    public void interact(Personnage player) {

        Armes arme = new Armes("épée", 20);

        if (player.getType().equals("Guerrier")) {
            int result = (player.getStrength() + arme.getOffensifStrenght());
            player.setStrength(result);
            System.out.println("Votre joueur est tombé sur une case " + arme.getOffensifType() + " qui a " + arme.getOffensifStrenght() + " de force." +
                    "\r\n" +
                    "Votre" + player.getType() + "est maintenant à : " + player.getStrength() + " de force.");
        }else{
            System.out.println("Case Arme : Votre Magicien ne peut récupérer d'arme pour l'instant");
        }
    }
}