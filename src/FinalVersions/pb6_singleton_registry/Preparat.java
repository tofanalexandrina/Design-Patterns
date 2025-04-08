package FinalVersions.pb6_singleton_registry;

public class Preparat {
    private String denumire;
    private int timp;
    private int grade;

    public Preparat(String denumire, int timp, int grade) {
        this.denumire = denumire;
        this.timp = timp;
        this.grade = grade;
    }


    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", timp=" + timp +
                ", grade=" + grade +
                '}';
    }
}
