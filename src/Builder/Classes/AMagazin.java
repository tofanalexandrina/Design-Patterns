package Builder.Classes;

import java.util.List;

public abstract class AMagazin {
    protected String denumire;
    protected int suprafata;
    protected int nrIntrari;

    protected IPodea podea;
    protected List<IDecoratiuni> decoratiuni;

    //in constructor raman doar cele obligatorii pentru toate magazinele
    public AMagazin(String denumire, int suprafata, int nrIntrari, IPodea podea) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podea = podea;
    }

    public void addDecoratiuni(IDecoratiuni decoratiune){}
    public void display(){}
}
