package FinalVersions.pb5_singleton;

import java.util.ArrayList;
import java.util.List;

public class CuptorSingleton {
    private static CuptorSingleton instantaCuptor;
    private List<Preparat> listaPreparate=new ArrayList<>();

    private CuptorSingleton() {
    }
    static {
        instantaCuptor=new CuptorSingleton();
    }

    public static CuptorSingleton getInstantaCuptor() {
        return instantaCuptor;
    }

    public void addPreparat(Preparat p){
        this.listaPreparate.add(p);
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CuptorSingleton{" +
                "listaPreparate=" + listaPreparate +
                '}';
    }
}
