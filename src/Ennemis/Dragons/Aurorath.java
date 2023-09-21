package Ennemis.Dragons;

import Images.Choupi;

public class Aurorath extends Dragon {
    @Override
    public String toString() {
        return "Aurorath{}";
    }

    public Aurorath() {
        super("Glace", "Aurorath la Glace-Éternelle", 20, 20, " Manipulation des tempêtes de neige", "Capacité de se camoufler dans la neige");
        Choupi image = new Choupi();
        setImage(image.dragon2());

        String description =
                "Aurorath, la créature de glace aux yeux perçants, peut plonger son environnement dans le froid absolu. Sa peau glacée la rend impénétrable aux assauts.";
        setDescription(description);
    }
}

