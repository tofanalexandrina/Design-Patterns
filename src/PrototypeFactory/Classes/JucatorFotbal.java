package PrototypeFactory.Classes;

import java.util.ArrayList;

//Concrete Prototype 1 - metoda clone se duce in Prototype Factory
public class JucatorFotbal extends AJucator{

    public JucatorFotbal(){
        this.antrenamente=new ArrayList<>();
        antrenamente.add("Pase");
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
        return "JucatorFotbal{" +
                "antrenamente=" + antrenamente +
                ", medicamenteInterzise=" + medicamenteInterzise +
                '}';
    }
}
