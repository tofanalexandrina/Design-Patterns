package Creational.SingletonRegistry.Classes;

public class Preparat {
    private String denumire;
    private int timpAlocat;
    private int gradeGatire;

    public Preparat(String denumire, int timpAlocat, int gradeGatire) {
        this.denumire = denumire;
        this.timpAlocat = timpAlocat;
        this.gradeGatire = gradeGatire;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getTimpAlocat() {
        return timpAlocat;
    }

    public int getGradeGatire() {
        return gradeGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", timpAlocat=" + timpAlocat +
                ", gradeGatire=" + gradeGatire +
                '}';
    }
}
