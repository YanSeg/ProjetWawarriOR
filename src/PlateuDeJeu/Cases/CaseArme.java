package PlateuDeJeu.Cases;

import Equipements.EquipementOff.Armes.Armes;
import Equipements.EquipementOff.Armes.Epees.EpeeCryogenique;
import Personnages.Personnage;

public class CaseArme implements Cases {

    @Override
    public void interact(Personnage player) {

        Armes arme = new EpeeCryogenique();

        if (player.getType().equals("Guerrier")) {
            int result = (player.getStrength() + arme.getStrenght());
            player.setStrength(result);
            System.out.println("Votre joueur est tombé sur une case " + arme.getType() + " qui a " + arme.getStrenght() + " de force." +
                    "\r\n" +
                    "Votre" + player.getType() + "est maintenant à : " + player.getStrength() + " de force.");
        }else{
            System.out.println("Case Arme : Votre Magicien ne peut récupérer d'arme pour l'instant");
        }
    }
}