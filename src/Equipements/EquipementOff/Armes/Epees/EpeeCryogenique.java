package Equipements.EquipementOff.Armes.Epees;

import Images.Choupi;

public class EpeeCryogenique extends Epee{
    public EpeeCryogenique() {
        super("Glace", "Lame Cryogénique", 16);
        Choupi image = new Choupi();
        setImage(image.sword3());
        String description = "Une lame magique qui émet une onde de froid intense, congelant les adversaires en un instant.";
        setDescription(description);
    }

}
