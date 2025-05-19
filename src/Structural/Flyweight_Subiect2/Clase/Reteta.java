package Structural.Flyweight_Subiect2.Clase;

//obiectul extrinsec (unshared concrete)
public class Reteta {
    private String pacient;
    private String diagnostic;

    public Reteta(String pacient, String diagnostic) {
        this.pacient = pacient;
        this.diagnostic = diagnostic;
    }

    public String getPacient() {
        return pacient;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}
