package Structural.Proxy_Subiect1.Clase;

public class Vizitator implements ISpital{
    private String nume;
    private boolean areScrisoareAcceptare;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
    }

    public String getNume() {
        return nume;
    }

    public boolean getAreScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }

    @Override
    public String toString() {
        return "Vizitator{" +
                "nume='" + nume + '\'' +
                ", areScrisoareAcceptare=" + areScrisoareAcceptare +
                '}';
    }

    @Override
    public void permiteAcces() {
        if(areScrisoareAcceptare) {
            System.out.println(this.nume + " are scrisoare de acceptare.");
        }else{
            System.out.println(this.nume + " nu are scrisoare de acceptare");
        }
    }
}
