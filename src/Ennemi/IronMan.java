package Ennemi;

import Images.Choupi;

public class IronMan extends Ennemi{
    public IronMan() {
        super("Ennemi","IronMan ", 8, 12, "Mark II", "Mark II");
        Choupi image = new Choupi();
        setImage(image.ironMan());
    }


}