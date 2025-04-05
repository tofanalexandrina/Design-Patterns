package SingletonRegistry.Program;

import SingletonRegistry.Classes.CuptoareRegistry;
import SingletonRegistry.Classes.Preparat;

public class Main {
    public static void main(String[] args) {
        CuptoareRegistry.adaugarePreparatCuptor(new Preparat("Cheesecake", 60, 180));
        CuptoareRegistry.adaugarePreparatCuptor(new Preparat("Cozonac", 120, 200));
        CuptoareRegistry.adaugarePreparatCuptor(new Preparat("Pui", 60, 180));
        CuptoareRegistry.adaugarePreparatCuptor(new Preparat("Pizza", 30, 200));

        CuptoareRegistry.afisareListaCuptoare();
    }
}
