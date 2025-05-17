package Behavioural.ChainOfResponsibility.Clase;

//Concrete Handler
public class BucatarConcreteHandler2 extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        System.out.println("Bucatarul a procesat comanda "+comanda.getProdus());
    }
}
