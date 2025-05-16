package Structural.Composite.Program;

import Structural.Composite.Clase.Meniu;
import Structural.Composite.Clase.Produs;
import Structural.Composite.Clase.StructuraComposite;

public class Main {
    public static void main(String[] args) {
        //nivel 0
        StructuraComposite structuraMeniu=new StructuraComposite("Meniu");
        Meniu meniu=new Meniu(structuraMeniu, "Pizzeria Andy's Pizza");

        //nivel 1
        StructuraComposite structuraBauturi=new StructuraComposite("Bauturi");
        StructuraComposite structuraMancare=new StructuraComposite("Mancare");
        structuraMeniu.addNod(structuraBauturi);
        structuraMeniu.addNod(structuraMancare);

        //nivel 2 - pentru bauturi
        structuraBauturi.addNod(new Produs("Coca Cola", 10));
        structuraBauturi.addNod(new Produs("Fanta", 10));

        //nivel 2 - pentru mancare
        StructuraComposite structuraMancarePizza=new StructuraComposite("Pizza");
        StructuraComposite structuraMancarePaste=new StructuraComposite("Paste");
        structuraMancare.addNod(structuraMancarePizza);
        structuraMancare.addNod(structuraMancarePaste);

        //nivel 3 - pentru mancarePizza
        structuraMancarePizza.addNod(new Produs("Pizza Margherita", 27));
        structuraMancarePizza.addNod(new Produs("Pizza Capriciossa", 35));

        //nivel 3 - pentru mancarePaste
        structuraMancarePaste.addNod(new Produs("Paste Carbonara", 30));
        structuraMancarePaste.addNod(new Produs("Paste Bolognese", 35));

        //afisare structura meniu
        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());

    }
}
