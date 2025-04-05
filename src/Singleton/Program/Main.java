package Singleton.Program;

import Singleton.Classes.CuptorSingleton;
import Singleton.Classes.Preparat;

public class Main {
    public static void main(String[] args) {
        CuptorSingleton.getInstantaUnicaCuptor().addPreparat(new Preparat(60, 200));
        CuptorSingleton.getInstantaUnicaCuptor().addPreparat(new Preparat(120, 180));
        CuptorSingleton.getInstantaUnicaCuptor().addPreparat(new Preparat(120, 200));
        CuptorSingleton.getInstantaUnicaCuptor().addPreparat(new Preparat(60, 180));
        CuptorSingleton.getInstantaUnicaCuptor().display();
    }
}
