package FinalVersions.pb6_singleton_registry;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private List<Preparat> preparate=new ArrayList<>();
    private int gradeMaxime;

    Cuptor(int gradeMaxime) {
        this.gradeMaxime = gradeMaxime;
    }

    int getGradeMaxime() {
        return gradeMaxime;
    }

    void addPreparat(Preparat p){
        this.preparate.add(p);
    }


    @Override
    public String toString() {
        return "Cuptor{" +
                "preparate=" + preparate +
                ", gradeMaxime=" + gradeMaxime +
                '}';
    }
}
