package Structural.Adapter.ClassAdapter.Classes;

public class EvaluareClientFirmaB implements IEvaluareClientFirmaB{

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Analiza client firma B");
        System.out.println("S-a oferit discount de 10%");
    }
}
