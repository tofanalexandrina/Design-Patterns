package Creational.Builder.Classes;

import java.util.ArrayList;

public class Magazin extends AMagazin{
    public Magazin(String denumire, int suprafata, int nrIntrari, IPodea podea) {
        super(denumire, suprafata, nrIntrari, podea);
    }

    @Override
    public void addDecoratiuni(IDecoratiuni decoratiune) {
        if(this.decoratiuni==null){
            this.decoratiuni=new ArrayList<>();
        }
        this.decoratiuni.add(decoratiune);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", podea=" + podea +
                ", decoratiuni=" + decoratiuni +
                '}';
    }
}
