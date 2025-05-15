package Structural.Adapter.ClassAdapter.Classes;

//Adaptee
public class EvaluareClientFirmaA implements IEvaluareClientFirmaA{
    //adapterd operation
    @Override
    public void analizaClientFirmaA(int costTotalEvenimente) {
        System.out.println("Analiza Client firma A");
        double procentDiscount=0;

        if(costTotalEvenimente>10000){
            procentDiscount=0.10;
        }else if(costTotalEvenimente>500){
            procentDiscount=0.05;
        }else {
            procentDiscount=0.00;
        }
        System.out.println("S-a oferit un discount de "+procentDiscount+". Costul total este de "+costTotalEvenimente+" lei.");
    }
}
