package Singleton.Classes;

public class Preparat {
    private int timpAlocat;
    private int gradeGatire;

    public Preparat(int timpAlocat, int gradeGatire) {
        this.timpAlocat = timpAlocat;
        this.gradeGatire = gradeGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "timpAlocat=" + timpAlocat +
                ", gradeGatire=" + gradeGatire +
                '}';
    }
}
