package Structural.Decorator.Clase;

//Decorator - extends Component
public abstract class ADecoratorPizza extends APizza{
    protected APizza pizza;

    public ADecoratorPizza(APizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getComponente() {
        return pizza.getComponente();
    }

    @Override
    public int getPret() {
        return pizza.getPret();
    }
}
