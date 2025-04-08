package Creational.FinalVersions.pb6_singleton_registry;

import java.util.HashMap;
import java.util.Map;

public class CuptorRegistry {
    private static Map<String, Cuptor> cuptoareMap=new HashMap<>();

    static {
        cuptoareMap.put("deserturi", new Cuptor(200));
        cuptoareMap.put("carne", new Cuptor(250));
        cuptoareMap.put("pizza", new Cuptor(270));
    }

    public static void adaugarePreparat(Preparat preparat){
        for(Cuptor c: cuptoareMap.values()) {
            if (preparat.getGrade() < c.getGradeMaxime()) {
                c.addPreparat(preparat);
            }
        }
    }


    public static Map<String, Cuptor> getCuptoareMap() {
        return cuptoareMap;
    }

    public static void display(){
        for(Cuptor c: cuptoareMap.values()) {
            System.out.println(c);
        }
    }


}
