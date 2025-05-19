package Structural.Decorator_Subiect4.Clase;

public abstract class ADecoratorProdus implements IProdus{
    private IProdus produs;

    public ADecoratorProdus(IProdus produs) {
        this.produs = produs;
    }

    @Override
    public String getDescriere() {
        return produs.getDescriere();
    }

    @Override
    public int getPret() {
        return produs.getPret();
    }
}
