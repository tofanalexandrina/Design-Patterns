package Structural.Flyweight_Subiect2.Clase;

//obiect intrinsec
public class Recomandare implements IRecomandare{
    private String recomandare;

    public Recomandare(String recomandare) {
        this.recomandare = recomandare;
    }

    @Override
    public void printareReteta(Reteta reteta) {
        System.out.println("Pacient: "+reteta.getPacient());
        System.out.println("Diagnostic: "+reteta.getDiagnostic());
        System.out.println("Recomandari: "+this.recomandare);
    }
}
