package PrototypeFactory_Simplu.Program;

import PrototypeFactory_Simplu.Classes.StickerPrototypeFactory;
import PrototypeFactory_Simplu.Classes.IMasina;
import PrototypeFactory_Simplu.Classes.Sticker;
import PrototypeFactory_Simplu.Classes.Masina;

public class Main {
    public static void main(String[] args) {
        StickerPrototypeFactory prototypeFactory=new StickerPrototypeFactory();
        IMasina m1=new Masina("BMW", 2012);
        IMasina m2=new Masina("BMW", 2012);

        Sticker s1=prototypeFactory.getSticker(m1);
        s1.display();

        Sticker s2=prototypeFactory.getSticker(m2);
        s2.display();
    }
}