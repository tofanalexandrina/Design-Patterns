package Behavioural.Template_Subiect2.Clase;

public class ProtocolSpitalPublic extends AProtocolUrgenta{
    @Override
    void sesizareUrgenta() {
        System.out.println("A aparut o urgenta la spital public.");
    }

    @Override
    void interventieEchipaMedici() {
        System.out.println("Intervine echipa locala de medici pentru stabilizare.");
    }
}
