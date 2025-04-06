package PrototypeFactory.Classes;

import java.util.ArrayList;

//Concrete Prototype 2 - metoda clone se duce in Prototype Factory
public class JucatorBasket extends AJucator{
    public JucatorBasket() {
        this.antrenamente=new ArrayList<>();
        antrenamente.add("Dribbling");
    }


    @Override
    public void addMedicamentInterzis(String medicament) {
        medicamenteInterzise.add(medicament);
    }

    @Override
    public void addAntrenamente(String antrenament) {
        this.antrenamente.add(antrenament);
    }

    @Override
    public String toString() {
        return "JucatorBasket{" +
                "medicamenteInterzise=" + medicamenteInterzise +
                ", antrenamente=" + antrenamente +
                '}';
    }
}
