import Personnages.Personnage;

public class Game {

    public Game() {
    }

    public void jouerauJeu(Personnage player) {
        if (player != null) {
            try {
                jeuDe();

            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Personnage hors plateau : " + e.getMessage());
            } finally {

// et là ben .... on verra plus tard !!!!
            }
        }
    }






    // ICI JE VAIS RANGER MES EXCEPTIONS DE GAME


    public class PersonnageHorsPlateauException extends Exception {
        public PersonnageHorsPlateauException(String message) {
            super(message);
        }
    }

    public int lancementDuDE(){
        int de = (int) (1 + 6 * Math.random());
        return de;
    }

    public void jeuDe() throws PersonnageHorsPlateauException {
        int position = 1;

        while (position < 64) {
            int de = lancementDuDE();
            position = position + de;

            System.out.println("Vous êtes à la position : " + position);
            System.out.println("Votre lancé est de " + de);

            if (position > 64) {
                throw new PersonnageHorsPlateauException("Le personnage est sorti du plateau.");
            }
        }
    }
}



