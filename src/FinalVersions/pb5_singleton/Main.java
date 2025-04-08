package FinalVersions.pb5_singleton;

public class Main {
    public static void main(String[] args) {
       CuptorSingleton.getInstantaCuptor().addPreparat(new Preparat("Cozonac", 60, 180));
       CuptorSingleton.getInstantaCuptor().addPreparat(new Preparat("Cheesecake", 60, 150));
       CuptorSingleton.getInstantaCuptor().display();
    }
}