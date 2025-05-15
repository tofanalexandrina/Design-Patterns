package Structural.Adapter.ObjectAdapter.Classes;

import Structural.Adapter.ClassAdapter.Classes.Client;
import Structural.Adapter.ClassAdapter.Classes.EvaluareClientFirmaA;
import Structural.Adapter.ClassAdapter.Classes.IEvaluareClientFirmaB;

//adapter de obiect
public class AdapterEvaluareClientCompozitie implements IEvaluareClientFirmaB {

    //folosim instanta PRIVATA de clasa in loc sa extindem clasa cu care adaptam
    private EvaluareClientFirmaA evaluareClientFirmaA;

    //constructor public pentru instanta
    public AdapterEvaluareClientCompozitie(EvaluareClientFirmaA evaluareClientFirmaA) {
        this.evaluareClientFirmaA = evaluareClientFirmaA;
    }

    private int costTotalEvenimente(Client client){
        int costTotalEvenimente=0;
        for(int cost:client.getCostEvenimente()){
            costTotalEvenimente+=cost;
        }
        return costTotalEvenimente;
    }


    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("(Adaptor) Arata ca si cum firma B face analiza");
        int costTotal=costTotalEvenimente(client);
        //aici e diferenta - folosim instanta de clasa pentru a gasi metoda
        this.evaluareClientFirmaA.analizaClientFirmaA(costTotal);
    }
}
