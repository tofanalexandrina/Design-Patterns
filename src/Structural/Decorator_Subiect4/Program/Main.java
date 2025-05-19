package Structural.Decorator_Subiect4.Program;

import Structural.Decorator_Subiect4.Clase.*;

public class Main {
    public static void main(String[] args) {
        IProdus pizza=new Pizza();
        System.out.println("Pizza initiala:");
        System.out.println(pizza.getDescriere());
        System.out.println(pizza.getPret());
        System.out.println("Pizza decorata cu topping spaniol:");
        IProdus pizzaDecorata=new DecoratorToppingSpaniol(pizza, EToppingSpaniol.GUACAMOLE);
        System.out.println(pizzaDecorata.getDescriere());
        System.out.println(pizzaDecorata.getPret());
        System.out.println("\n");
        IProdus paste=new Paste();
        System.out.println("Paste initiale:");
        System.out.println(paste.getDescriere());
        System.out.println(paste.getPret());
        System.out.println("Paste decorate cu topping spaniol:");
        IProdus pasteDecorate=new DecoratorToppingSpaniol(paste, EToppingSpaniol.CEAPA);
        System.out.println(pasteDecorate.getDescriere());
        System.out.println(pasteDecorate.getPret());
        System.out.println("\n");
        IProdus salata=new Salata();
        System.out.println("Salata initiala:");
        System.out.println(salata.getDescriere());
        System.out.println(salata.getPret());
        System.out.println("Salata decorata cu topping italienesc:");
        IProdus salataDecorata=new DecoratorToppingItalienesc(salata, EToppingItalienesc.BURRATA);
        System.out.println(salataDecorata.getDescriere());
        System.out.println(salataDecorata.getPret());
        System.out.println("\n");
        IProdus ciorba=new Ciorba();
        System.out.println("Ciorba initiala:");
        System.out.println(ciorba.getDescriere());
        System.out.println(ciorba.getPret());
        System.out.println("Ciorba decorata cu topping italienesc:");
        IProdus ciorbaDecorata=new DecoratorToppingItalienesc(ciorba, EToppingItalienesc.BUSUIOC);
        System.out.println(ciorbaDecorata.getDescriere());
        System.out.println(ciorbaDecorata.getPret());


    }
}
