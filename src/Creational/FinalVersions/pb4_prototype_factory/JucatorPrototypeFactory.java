package Creational.FinalVersions.pb4_prototype_factory;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototypeFactory {
    private static Map<String, AJucator> jucatorMap=new HashMap<>();

    static {
        AJucator.medicamenteInterzise.add("Steroizi");
        jucatorMap.put("fotbal", new JucatorFotbal());
        jucatorMap.put("basket", new JucatorBasket());
    }

    public static AJucator getJucator(String tipJucator){
        if(jucatorMap.containsKey(tipJucator.toLowerCase())){
            return jucatorMap.get(tipJucator).clone();
        }else{
            return null;
        }
    }
}
