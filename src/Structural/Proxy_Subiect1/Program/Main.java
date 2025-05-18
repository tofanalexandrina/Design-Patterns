package Structural.Proxy_Subiect1.Program;

import Structural.Proxy_Subiect1.Clase.ISpital;
import Structural.Proxy_Subiect1.Clase.Spital;
import Structural.Proxy_Subiect1.Clase.SpitalProxy;
import Structural.Proxy_Subiect1.Clase.Vizitator;

public class Main {
    public static void main(String[] args) {
        ISpital spital=new Spital();

        Vizitator v1=new Vizitator("Vizitator 1", true);
        Vizitator v2=new Vizitator("Vizitator 2", false);
        Vizitator v3=new Vizitator("Vizitator 3", true);
        Vizitator v4=new Vizitator("Vizitator 4", false);
        Vizitator v5=new Vizitator("Vizitator 5", true);
        Vizitator v6=new Vizitator("Vizitator 6", true);
        Vizitator v7=new Vizitator("Vizitator 7", true);

        System.out.println("Primire vizitatori inainte de Proxy:");
        spital.permiteAcces(v1);
        spital.permiteAcces(v2);
        spital.permiteAcces(v3);
        spital.permiteAcces(v4);
        spital.permiteAcces(v5);
        spital.permiteAcces(v6);
        spital.permiteAcces(v7);

        ISpital spitalProxy=new SpitalProxy(spital);
        System.out.println("Primire vizitatori dupa Proxy:");
        spitalProxy.permiteAcces(v1);
        spitalProxy.permiteAcces(v2);
        spitalProxy.permiteAcces(v3);
        spitalProxy.permiteAcces(v4);
        spitalProxy.permiteAcces(v5);
        spitalProxy.permiteAcces(v6);
        spitalProxy.permiteAcces(v7);
    }

}
