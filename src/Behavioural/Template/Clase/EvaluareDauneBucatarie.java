package Behavioural.Template.Clase;

public class EvaluareDauneBucatarie extends AEvaluareDaune{
    @Override
    void evaluareInitiala() {
        System.out.println("Evaluare initiala dauna bucatarie.");
    }

    @Override
    void trimitereEvaluare() {
        System.out.println("Trimitere evaluare dauna bucatarie spre manager.");
    }
}
