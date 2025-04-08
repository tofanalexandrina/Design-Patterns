package FinalVersions.pb4_prototype_factory;

import java.util.ArrayList;

public class JucatorFotbal extends AJucator{
    JucatorFotbal() {
        antrenamente=new ArrayList<>();
        antrenamente.add("Alergat");
        antrenamente.add("Sut");
    }

    @Override
    public String toString() {
        return "JucatorFotbal{" +
                "antrenamente=" + antrenamente +
                " medicamente interzise=" + medicamenteInterzise+
                '}';
    }
}
