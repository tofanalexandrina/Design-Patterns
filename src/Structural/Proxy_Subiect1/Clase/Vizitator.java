package Structural.Proxy_Subiect1.Clase;

public class Vizitator {
    private String nume;
    private boolean areScrisoareAcceptare;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
    }

    public String getNume() {
        return nume;
    }

    public boolean getAreScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }
}
