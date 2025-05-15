package Structural.Decorator.Clase;

//ConcreteDecorator - extinde Decorator
public class DecoratorCrown extends ADecoratorPizza{
    private String tipMargine;

    public DecoratorCrown(APizza pizza, String tipMargine) {
        super(pizza);
        this.tipMargine=tipMargine;
    }

    @Override
    public String getComponente() {
        return super.getComponente() + ", margine: "+this.tipMargine;
    }

    @Override
    public int getPret() {
        return super.getPret() + 10;
    }
}
