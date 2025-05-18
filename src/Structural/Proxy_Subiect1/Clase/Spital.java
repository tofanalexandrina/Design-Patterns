package Structural.Proxy_Subiect1.Clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private List<Vizitator> listaVizitatori;

    public Spital() {
        this.listaVizitatori=new ArrayList<>();
    }

    @Override
    public void adaugaVizitator(Vizitator v) {
        listaVizitatori.add(v);
        System.out.println(v.getNume() + " a fost adaugat in spital.");
    }

    @Override
    public void permiteAcces(Vizitator v) {
        if(v.getAreScrisoareAcceptare()) {
            System.out.println(v.getNume() + " are scrisoare de acceptare. Este permis accesul in spital.");
        }else{
            System.out.println(v.getNume() + " nu are scrisoare de acceptare. Nu este permis accesul in spital.");
        }
    }
}
