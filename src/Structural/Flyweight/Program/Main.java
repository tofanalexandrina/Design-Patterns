package Structural.Flyweight.Program;

import Structural.Flyweight.Clase.Bon;
import Structural.Flyweight.Clase.ETipPrintare;
import Structural.Flyweight.Clase.MesajPrintareConcreteFly;
import Structural.Flyweight.Clase.MesajPrintareFactory;

public class Main {
    public static void main(String[] args) {
        MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP1).printareBon(new Bon(10, 250));
        MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP2).printareBon(new Bon(11, 2500));
        MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP3).printareBon(new Bon(12, 100));

        System.out.println(MesajPrintareFactory.getNrBonuriPrintate()+ " bonuri printate");
        System.out.println(MesajPrintareFactory.getNrMatriteBonuri()+" matrite bonuri folosite");
    }
}
