package Structural.Decorator_Subiect4.Clase;

public class DecoratorToppingSpaniol extends ADecoratorProdus{
    private EToppingSpaniol topping;
    public DecoratorToppingSpaniol(IProdus produs, EToppingSpaniol topping) {
        super(produs);
        this.topping=topping;
    }

    @Override
    public String getDescriere() {
        return super.getDescriere()+ ", topping: "+topping.toString();
    }

    @Override
    public int getPret() {
        return super.getPret();
    }
}
