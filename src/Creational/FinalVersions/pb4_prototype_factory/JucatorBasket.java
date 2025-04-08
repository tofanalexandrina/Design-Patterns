package Creational.FinalVersions.pb4_prototype_factory;

import java.util.ArrayList;

public class JucatorBasket extends AJucator{
    JucatorBasket() {
        antrenamente=new ArrayList<>();
        antrenamente.add("Aruncat la cos");
        antrenamente.add("Dribbling");
    }

    @Override
    public void addAntrenamente(String antrenament) {
        this.antrenamente.add(antrenament);
    }

    @Override
    public void addMedicamente(String medicament) {
        medicamenteInterzise.add(medicament);
    }

    @Override
    public String toString() {
        return "JucatorBasket{" +
                "antrenamente=" + antrenamente +
                " medicamente interzise=" + medicamenteInterzise+
                '}';
    }
}
