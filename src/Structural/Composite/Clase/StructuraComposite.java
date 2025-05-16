package Structural.Composite.Clase;

import java.util.ArrayList;
import java.util.List;

//Composite
public class StructuraComposite extends ANod{
    private List<ANod> structura=new ArrayList<>();
    private String numeStructura;

    public StructuraComposite(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        //construire si reprezentare textuala a substructurii dintr-un nod Structura
        //parcurgere recursiva a arborelui de componente
        String info="";
        info+=this.numeStructura+"\n";
        //se itereaza prin fiecare element(nod) din lista de copii
        for(ANod nod:structura){
            info += " "+ nod.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void addNod(ANod element) {
        structura.add(element);
    }

    @Override
    public void removeNod(ANod element) {
        structura.remove(element);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}
