package Structural.Facade.Classes;

import java.util.ArrayList;
import java.util.List;

public class GestiuneSali {
    private ArrayList<Sala> listaSali;

    public GestiuneSali() {
        this.listaSali=new ArrayList<>();
    }

    public void addSala(Sala s){
        this.listaSali.add(s);
    }

    public ArrayList<Sala> getListaSali() {
        return this.listaSali;
    }
}
