package Structural.Composite_Subiect1.Clase;

public interface IVirus {
    String getNume();
    int getNrCazuri();

    String getInfo();
    void add(IVirus v);

    void remove(IVirus v);

    IVirus getChild(int i);
}
