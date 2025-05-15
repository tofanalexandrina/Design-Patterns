package Structural.Adapter.ClassAdapter.Classes;

//ConcreteAdapter
//adaptare prin mostenire (extends) - adapter de clasa
public class AdapterEvaluareClient extends EvaluareClientFirmaA implements IEvaluareClientFirmaB{
    //adaptee - metoda deja existenta analizaClientFirmaA()

    //returneaza int(pentru A), dar are ca parametru obiect Client(pentru B)
    private int costTotalEvenimente(Client client){
        int costTotalEvenimente=0;
        for(int cost :client.getCostEvenimente()){
            costTotalEvenimente+=cost;
        }
        return costTotalEvenimente;
    }

    //operation
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("(Adaptor) Arata ca si cum firma B face analiza");
        this.analizaClientFirmaA(costTotalEvenimente(client));
    }
}
