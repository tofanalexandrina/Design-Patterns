package Behavioural.ChainOfResponsibility.Program;

import Behavioural.ChainOfResponsibility.Clase.AHandler;
import Behavioural.ChainOfResponsibility.Clase.BucatarConcreteHandler2;
import Behavioural.ChainOfResponsibility.Clase.Comanda;
import Behavioural.ChainOfResponsibility.Clase.OspatarConcreteHandler1;

public class Main {
    public static void main(String[] args) {
        AHandler ospatar=new OspatarConcreteHandler1();
        AHandler bucatar=new BucatarConcreteHandler2();

        //setam succesiunea in lant
        ospatar.setNextHandler(bucatar);

        Comanda comanda1=new Comanda("Pizza", 2, 15);
        Comanda comanda2=new Comanda("Coca cola", 1, 1);
        Comanda comanda3=new Comanda("Iced Latte", 1, 4);

        System.out.println("Comanda 1");
        ospatar.procesareComanda(comanda1);

        System.out.println("\nComanda 2:");
        ospatar.procesareComanda(comanda2);

        System.out.println("\nComanda 3:");
        ospatar.procesareComanda(comanda3);
    }
}
