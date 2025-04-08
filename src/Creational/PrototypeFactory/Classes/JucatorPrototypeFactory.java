package Creational.PrototypeFactory.Classes;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototypeFactory {
    private static Map<ETipJucator, AJucator> jucatoriMap=new HashMap<>();

    static {
        AJucator.medicamenteInterzise.add("Steroid X");
        AJucator.medicamenteInterzise.add("Steroid Y");

        jucatoriMap.put(ETipJucator.FOTBAL, new JucatorFotbal());
        jucatoriMap.put(ETipJucator.BASKET, new JucatorBasket());
    }


    public static AJucator getPrototip(ETipJucator tipJucator) throws CloneNotSupportedException {
        if(jucatoriMap.containsKey(tipJucator)){
            return jucatoriMap.get(tipJucator).clone();
        }
        return null;
    }
}
