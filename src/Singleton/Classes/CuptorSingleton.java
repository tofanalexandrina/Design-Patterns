package Singleton.Classes;

import java.util.ArrayList;
import java.util.List;

public class CuptorSingleton {
    private static CuptorSingleton instantaUnicaCuptor;
    private List<Preparat> listaAsteptarePreparate=new ArrayList<>();

    private CuptorSingleton() {
    }

    static {
        instantaUnicaCuptor=new CuptorSingleton();
    }

    public static CuptorSingleton getInstantaUnicaCuptor() {
        return instantaUnicaCuptor;
    }

    public void addPreparat(Preparat p){
        this.listaAsteptarePreparate.add(p);
    }

    @Override
    public String toString() {
        return "CuptorSingleton{" +
                "listaAsteptarePreparate=" + listaAsteptarePreparate +
                '}';
    }

    public void display(){
        System.out.println(this);
    }
}
