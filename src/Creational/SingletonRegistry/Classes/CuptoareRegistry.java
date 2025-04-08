package Creational.SingletonRegistry.Classes;

import java.util.HashMap;
import java.util.Map;

public class CuptoareRegistry {
    private static final Map<Integer, Cuptor> listaCuptoare=new HashMap<>();

    static {
        listaCuptoare.put(1, new Cuptor(1, 270));
        listaCuptoare.put(2, new Cuptor(2, 250));
        listaCuptoare.put(3, new Cuptor(3, 200));
    }


    public static void adaugarePreparatCuptor(Preparat p){
        Cuptor cuptorOptim=null;
        int timpMinimAsteptare=Integer.MAX_VALUE;
        for(Cuptor c:listaCuptoare.values()){
            if(p.getGradeGatire()<=c.getGradeMaxime()&&c.getTimpTotalAsteptare()<timpMinimAsteptare){
                cuptorOptim=c;
                timpMinimAsteptare=c.getTimpTotalAsteptare();
            }
        }

        if(cuptorOptim!=null){
            cuptorOptim.addPreparat(p);
        }else{
            System.out.println("Nu exista nici un cuptor compatibil cu preparatul: "+ p.getDenumire() + ", Grade preparare: "+p.getGradeGatire() + ", Timp alocat: "+p.getTimpAlocat());
        }
    }


    public static void afisareListaCuptoare(){
        for(Cuptor c: listaCuptoare.values()){
            System.out.println(c);
        }
    }

}
