package Creational.Builder.Classes;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IBuilder{
//se copiaza toate atributele necesare unui magazin (din Magazin sau AMagazin-dupa caz)
    //toate atributele private, constructorul public - cu MagazinBuilder vom instantia in main
    private String denumire;
    private int suprafata;
    private int nrIntrari;

    private IPodea podea;
    private List<IDecoratiuni> decoratiuni=new ArrayList<>();

    //zonele obligatorii-in constructor
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

    //setteri de tip builder pentru zonele optionale
    public MagazinBuilder setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public MagazinBuilder setDecoratiuni(IDecoratiuni decoratiune) {
        this.decoratiuni.add(decoratiune);
        return this;
    }

    private void reset(){
        this.denumire=null;
        this.suprafata=0;
        this.decoratiuni=new ArrayList<>();
        this.nrIntrari=1;
        this.podea=new PodeaCiment();
    }

//in metoda build - toate restrictiile de implementare pentru magazin
    @Override
    public Magazin buildMagazin() {
        if(this.suprafata/100>this.nrIntrari){
            throw new CustomException("Nu pot exista mai putin de 1 intrare per 100 mp de magazin!");
        }

        if(this.podea==null){
            this.podea= new PodeaCiment();
        }

        if(this.podea.getDuritate()<2){
            for(IDecoratiuni decoratiune : this.decoratiuni){
                if(decoratiune.getTipMaterialDecoratiuni()==ETipMaterial.STICLA){
                    throw new CustomException("Daca duritatea podelei este moale, nu se permit decoratiuni din sticla!");
                }
            }

        }

        Magazin magazin=new Magazin(this.denumire, this.suprafata, this.nrIntrari, this.podea);
        for (IDecoratiuni decoratiune : this.decoratiuni) {
            magazin.addDecoratiuni(decoratiune);
        }

        reset();

        return magazin;
    }
}
