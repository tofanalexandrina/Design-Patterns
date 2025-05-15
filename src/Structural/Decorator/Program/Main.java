package Structural.Decorator.Program;

import Structural.Decorator.Clase.APizza;
import Structural.Decorator.Clase.DecoratorCrown;
import Structural.Decorator.Clase.DecoratorPicant;
import Structural.Decorator.Clase.PizzaVegetariana;

public class Main {
    public static void main(String[] args) {
        APizza pizza=new PizzaVegetariana();
        System.out.println("Pizza initiala:");
        System.out.println(pizza.getComponente());
        System.out.println(pizza.getPret());

        //folosim decorator
        APizza pizzaDecorata=new DecoratorCrown(pizza, "cu branza vegana");
        System.out.println("Pizza decorata cu crown:");
        System.out.println(pizzaDecorata.getComponente());
        System.out.println(pizzaDecorata.getPret());

        //decorare multipla
        APizza pizzaDecorataMultiplu=new DecoratorPicant(new DecoratorCrown(new PizzaVegetariana(), "cu branza vegana"), 10);
        System.out.println("Pizza decorata cu crown si iuteala:");
        System.out.println(pizzaDecorataMultiplu.getComponente());
        System.out.println(pizzaDecorataMultiplu.getPret());

    }
}
