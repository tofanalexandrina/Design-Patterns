package Behavioural.Strategy_Subiect3.Clase;

public class Produs implements IProdus{
    private String nume;
    private double pret;
    private int nrRecenzii;

    public Produs(String nume, double pret, int nrRecenzii) {
        this.nume = nume;
        this.pret = pret;
        this.nrRecenzii = nrRecenzii;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public int getRecenzii() {
        return nrRecenzii;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", nrRecenzii=" + nrRecenzii +
                '}';
    }
}
