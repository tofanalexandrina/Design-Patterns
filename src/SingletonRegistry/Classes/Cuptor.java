package SingletonRegistry.Classes;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private int id;
    private List<Preparat>listaPreparate = new ArrayList<>();
    private int gradeMaxime;

    Cuptor(int id, int gradeMaxime) {
        this.id = id;
        this.gradeMaxime=gradeMaxime;
    }

    public int getGradeMaxime() {
        return gradeMaxime;
    }

    public void addPreparat(Preparat p){
        this.listaPreparate.add(p);
    }

    public int getTimpTotalAsteptare(){
        return listaPreparate.stream().mapToInt(Preparat::getTimpAlocat).sum();
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "id=" + id +
                ", listaPreparate=" + listaPreparate +
                ", gradeMaxime=" + gradeMaxime +
                '}';
    }
}
