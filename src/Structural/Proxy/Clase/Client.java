package Structural.Proxy.Clase;

public class Client {
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
