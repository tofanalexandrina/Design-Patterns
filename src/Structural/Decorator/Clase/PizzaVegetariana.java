package Structural.Decorator.Clase;

//ConcreteComponent
public class PizzaVegetariana extends APizza {
    @Override
    public String getComponente() {
        return "blat, sos rosii, ciuperci, ceapa";
    }

    @Override
    public int getPret() {
        return 27;
    }
}
