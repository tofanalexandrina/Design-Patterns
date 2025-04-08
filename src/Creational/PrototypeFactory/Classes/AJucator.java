package Creational.PrototypeFactory.Classes;

import java.util.ArrayList;
import java.util.List;

//clasa abstracta prototype (in diagrama e <<interface>>)
public abstract class AJucator implements Cloneable{
    protected List<String> antrenamente; //aici se va face deep copy - personalizate
    protected static List<String> medicamenteInterzise=new ArrayList<>(); //aici se va face shallow copy - aceleasi pentru toti


    public abstract void addMedicamentInterzis(String medicament);

    public abstract void addAntrenamente(String antrenament);

    @Override
    protected AJucator clone() throws CloneNotSupportedException {
        AJucator jucator= (AJucator) super.clone();
        jucator.antrenamente=new ArrayList<>(this.antrenamente); //deep copy
        return jucator;
    }
}
