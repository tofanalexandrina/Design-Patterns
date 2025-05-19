package Behavioural.Template_Subiect2.Clase;

public class ProtocolSpitalPrivat extends AProtocolUrgenta{
    @Override
    void sesizareUrgenta() {
        System.out.println("A aparut o urgenta la spital privat.");
    }

    @Override
    void interventieEchipaMedici() {
        System.out.println("Este chemata echipa externa de medici pentru stabilizare");
    }
}
