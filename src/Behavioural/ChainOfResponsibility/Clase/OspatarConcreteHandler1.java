package Behavioural.ChainOfResponsibility.Clase;

//Concrete Handler
public class OspatarConcreteHandler1 extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        if(comanda.getGrad()<=5){
            System.out.println("Ospatarul a procesat comanda "+comanda.getProdus());
        }else{
            System.out.println("Ospatarul nu poate procesa comanda "+ comanda.getProdus()+", deoarece are grad > 5.");
            if(this.getNextHandler()!=null){
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
