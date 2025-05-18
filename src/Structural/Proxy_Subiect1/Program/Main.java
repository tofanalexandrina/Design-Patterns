package Structural.Proxy_Subiect1.Program;

import Structural.Proxy_Subiect1.Clase.ISpital;
import Structural.Proxy_Subiect1.Clase.SpitalProxy;
import Structural.Proxy_Subiect1.Clase.Vizitator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vizitator> listaVizitatori=new ArrayList<>();
        listaVizitatori.add(new Vizitator("Vizitator 1", true));
        listaVizitatori.add(new Vizitator("Vizitator 2", false));
        listaVizitatori.add(new Vizitator("Vizitator 3", false));
        listaVizitatori.add(new Vizitator("Vizitator 4", true));
        listaVizitatori.add(new Vizitator("Vizitator 5", false));
        listaVizitatori.add(new Vizitator("Vizitator 6", true));
        listaVizitatori.add(new Vizitator("Vizitator 7", true));

        if(listaVizitatori.size()>=5){
            System.out.println("Numar suficient de vizitatori. Incepe verificarea permiterii accesului.");
            for(Vizitator v:listaVizitatori){
                ISpital proxy=new SpitalProxy(v);
                proxy.permiteAcces();
            }
        }else {
            System.out.println("Nu avem numar suficient de vizitatori.");
        }
    }

}
