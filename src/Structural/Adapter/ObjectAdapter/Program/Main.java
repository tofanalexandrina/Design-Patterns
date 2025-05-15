package Structural.Adapter.ObjectAdapter.Program;

import Structural.Adapter.ClassAdapter.Classes.*;
import Structural.Adapter.ObjectAdapter.Classes.AdapterEvaluareClientCompozitie;

public class Main {
    public static void main(String[] args) {
        //Firma A
        IEvaluareClientFirmaA evaluareClientFirmaA=new EvaluareClientFirmaA();
        evaluareClientFirmaA.analizaClientFirmaA(2500);

        //Firma B
        IEvaluareClientFirmaB evaluareClientFirmaB=new EvaluareClientFirmaB();
        int[] costEvenimente= new int[]{1000, 2000, 3000, 20000};
        Client client=new Client("Ionel", 4, costEvenimente);
        evaluareClientFirmaB.analizaClientFirmaB(client);

        //Firma B - dupa adapter
        IEvaluareClientFirmaB evaluareClientFirmaB2=new AdapterEvaluareClientCompozitie(new EvaluareClientFirmaA());
        evaluareClientFirmaB2.analizaClientFirmaB(client);
    }
}
