package PrototypeFactory.Program;

import PrototypeFactory.Classes.AJucator;
import PrototypeFactory.Classes.ETipJucator;
import PrototypeFactory.Classes.JucatorPrototypeFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Înregistrare jucători
        AJucator jucatorFotbal1 = JucatorPrototypeFactory.getPrototip(ETipJucator.FOTBAL);
        AJucator jucatorFotbal2 = JucatorPrototypeFactory.getPrototip(ETipJucator.FOTBAL);
        AJucator jucatorBasket1 = JucatorPrototypeFactory.getPrototip(ETipJucator.BASKET);

        jucatorFotbal1.addAntrenamente("Rezistență");

        jucatorFotbal2.addAntrenamente("Sprint");

        jucatorBasket1.addAntrenamente("Aruncare");

        jucatorBasket1.addMedicamentInterzis("Substanta K");

        // Afișare pentru test
        System.out.println("Jucator 1 (fotbal): " + jucatorFotbal1);
        System.out.println("Jucator 2 (fotbal): " + jucatorFotbal2);
        System.out.println("Jucator 3 (basket): " + jucatorBasket1);

    }
}
