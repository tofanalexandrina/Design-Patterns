package Structural.Decorator_Subiect4.Clase;

public class DecoratorToppingItalienesc extends ADecoratorProdus{
    private EToppingItalienesc topping;
    public DecoratorToppingItalienesc(IProdus produs, EToppingItalienesc topping) {
        super(produs);
        this.topping=topping;
    }

    @Override
    public String getDescriere() {
        return super.getDescriere()+", topping: "+topping.toString();
    }

    @Override
    public int getPret() {
        return super.getPret();
    }
}
