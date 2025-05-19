package Structural.Composite_Subiect1.Clase;

import java.util.ArrayList;
import java.util.List;

public class StructuraComposite implements IVirus {
    private List<IVirus>structura=new ArrayList<>();
    private String numeStructura;

    public StructuraComposite(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getNume() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNrCazuri() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String info="";
        info+=this.numeStructura+"\n";
        for(IVirus virus:structura){
            info+=" "+virus.getInfo();
            info+="\n";
        }
        return info;
    }

    @Override
    public void add(IVirus v) {
        structura.add(v);
    }

    @Override
    public void remove(IVirus v) {
        structura.remove(v);
    }

    @Override
    public IVirus getChild(int i) {
        return structura.get(i);
    }
}
