package FinalVersions.pb4_prototype_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class AJucator implements Cloneable{
    List<String>antrenamente;
    static List<String>medicamenteInterzise=new ArrayList<>();


    public void addAntrenamente(String antrenament){
        this.antrenamente.add(antrenament);

    };

    public void addMedicamente(String medicament){
        medicamenteInterzise.add(medicament);

    };

    void setAntrenament(String antrenament){
        this.antrenamente=new ArrayList<>();
        this.antrenamente.add(antrenament);
    }


    @Override
    public AJucator clone() {
        try {
            AJucator clone = (AJucator) super.clone();
            this.antrenamente=new ArrayList<>(this.antrenamente);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}
