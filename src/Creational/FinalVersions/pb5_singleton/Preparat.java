package Creational.FinalVersions.pb5_singleton;

public class Preparat {
    private String nume;
    private int timpAlocat;
    private int gradeGatire;

    public Preparat(String nume, int timpAlocat, int gradeGatire) {
        this.nume = nume;
        this.timpAlocat = timpAlocat;
        this.gradeGatire = gradeGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "nume='" + nume + '\'' +
                ", timpAlocat=" + timpAlocat +
                ", gradeGatire=" + gradeGatire +
                '}';
    }
}
