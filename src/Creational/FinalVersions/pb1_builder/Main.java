package Creational.FinalVersions.pb1_builder;

public class Main {
    public static void main(String[] args) {
        MagazinBuilder magazinBuilder=new MagazinBuilder();
        Magazin m1=magazinBuilder.setDenumire("Zara").setNrIntrari(3).setSuprafata(100).build();
        m1.display();

        Magazin m2=magazinBuilder.setDenumire("Bershka").setSuprafata(200).setTipPodea(new PodeaSticla()).build();
        m2.display();

        Magazin m3=magazinBuilder.build();
        m3.display();
    }
}