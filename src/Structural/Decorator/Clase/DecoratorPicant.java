package Structural.Decorator.Clase;

//ConcreteDecorator - extends Decorator
public class DecoratorPicant extends ADecoratorPizza{
    //decoratiunea adaugata sub forma de atribut - privata
    private int nivelIuteala;

    public DecoratorPicant(APizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala=nivelIuteala;
    }

    @Override
    public String getComponente() {
        return super.getComponente()+", iuteala "+this.nivelIuteala;
    }

    @Override
    public int getPret() {
        return super.getPret()+7;
    }
}
