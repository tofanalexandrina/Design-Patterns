package Behavioural.ChainOfResponsibility.Clase;

//<<interface>> Handler
public abstract class AHandler {
    //succesor(next) tip Handler - privat
    private AHandler nextHandler;

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //handleRequest()
    public abstract void procesareComanda(Comanda comanda);
}
