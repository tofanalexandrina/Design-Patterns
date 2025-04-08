package Creational.Builder.Program;

import Creational.Builder.Classes.*;

public class Main {
    public static void main(String[] args) {
        MagazinBuilder magazinBuilder1=new MagazinBuilder();
        Magazin magazin1=magazinBuilder1.setDenumire("Zara").setSuprafata(200).setNrIntrari(3).buildMagazin();
        magazin1.display();

        Magazin magazin2=magazinBuilder1.setDenumire("Bershka").setSuprafata(100).setNrIntrari(1).setDecoratiuni(new Decoratiune(ETipMaterial.PLASTIC, "Glob de craciun")).setDecoratiuni(new Decoratiune(ETipMaterial.PLASTIC, "Ingeras de craciun")).setPodea(new PodeaLemn(1)).buildMagazin();
        magazin2.display();

        Magazin magazin3=magazinBuilder1.setDenumire("Stradivarius").setSuprafata(300).setNrIntrari(20).buildMagazin();
        magazin3.display();
    }
}
