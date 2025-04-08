package Creational.FinalVersions.pb1_builder;

public class Magazin{
    private final String denumire;
    private final int suprafata;
    private final int nrIntrari;
    private final IPodea tipPodea;

    Magazin(String denumire, int suprafata, int nrIntrari, IPodea tipPodea) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.tipPodea = tipPodea;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", tipPodea=" + tipPodea +
                '}';
    }


    public void display(){
        System.out.println(this);
    };

}
