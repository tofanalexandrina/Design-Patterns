package Structural.Proxy_Subiect1.Program;

import Structural.Proxy_Subiect1.Clase.ISpital;
import Structural.Proxy_Subiect1.Clase.Spital;
import Structural.Proxy_Subiect1.Clase.SpitalProxy;
import Structural.Proxy_Subiect1.Clase.Vizitator;

public class Main {
    public static void main(String[] args) {
        ISpital spital=new Spital();

        Vizitator[] vizitatori = {
                new Vizitator("Vizitator 1", true),
                new Vizitator("Vizitator 2", false),
                new Vizitator("Vizitator 3", true),
                new Vizitator("Vizitator 4", false),
                new Vizitator("Vizitator 5", true),
                new Vizitator("Vizitator 6", true),
                new Vizitator("Vizitator 7", true)
        };

        System.out.println("Primire vizitatori inainte de Proxy:");
        for (Vizitator v : vizitatori) {
            spital.permiteAcces(v);
        }

        ISpital spitalProxy=new SpitalProxy(spital);
        System.out.println("Primire vizitatori dupa Proxy:");
        for (Vizitator v : vizitatori) {
            spitalProxy.permiteAcces(v);
        }
    }

}
