package Structural.Composite_Subiect1.Clase;

public class Tulpina implements IVirus{
    private String nume;
    private int nrCazuri;

    public Tulpina(String nume, int nrCazuri) {
        this.nume = nume;
        this.nrCazuri = nrCazuri;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getNrCazuri() {
        return this.nrCazuri;
    }

    @Override
    public String getInfo() {
        return this.nume + " (" + this.nrCazuri + " cazuri)";
    }

    @Override
    public void add(IVirus v) {
        throw new UnsupportedOperationException("Operatie irelevanta pentru frunza.");
    }

    @Override
    public void remove(IVirus v) {
        throw new UnsupportedOperationException("Operatie irelevanta pentru frunza.");

    }

    @Override
    public IVirus getChild(int i) {
        throw new UnsupportedOperationException("Operatie irelevanta pentru frunza.");
    }
}
