package FinalVersions.pb1_builder;

public class MagazinBuilder implements IBuilder{
    private String denumire;
    private int suprafata;
    private int nrIntrari=1;
    private IPodea tipPodea=new PodeaCiment();

    public MagazinBuilder() {
    }

    public MagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    public MagazinBuilder setSuprafata(int suprafata) {
        this.suprafata = suprafata;
        return this;
    }

    public MagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    public MagazinBuilder setTipPodea(IPodea tipPodea) {
        this.tipPodea = tipPodea;
        return this;
    }

    private void reset(){
        this.denumire=null;
        this.nrIntrari=1;
        this.suprafata=0;
        this.tipPodea=new PodeaCiment();
    }


    @Override
    public Magazin build() {
        Magazin m=new Magazin(this.denumire, this.suprafata, this.nrIntrari, this.tipPodea);
        reset();
        return m;
    }
}
