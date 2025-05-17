package Behavioural.Template.Clase;

public class EvaluareDauneAuto extends AEvaluareDaune{
    @Override
    void evaluareInitiala() {
        System.out.println("Evaluare initiala dauna auto.");
    }

    @Override
    void trimitereEvaluare() {
        System.out.println("Trimitere evaluare dauna auto spre manager.");
    }
}
