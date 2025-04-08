package FinalVersions.pb6_singleton_registry;

public class Main {
    public static void main(String[] args) {
        CuptorRegistry.adaugarePreparat(new Preparat("Cheesecake", 60, 180));
        CuptorRegistry.adaugarePreparat(new Preparat("Pizza", 60, 250));
        CuptorRegistry.display();

    }
}