package Creational.Builder_Simplu.Classes;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private String tipPantof;
    private int nrPantof;
    private float dimensiuneToc;
    private String tipMaterialBaza;
    private List<String> materialeSecundare;
    private List<String> mesajeTextPrintabile;

    Pantof(String tipPantof, int nrPantof, float dimensiuneToc, String tipMaterialBaza) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.tipMaterialBaza = tipMaterialBaza;
    }

    public void addMateriale(String material){
        if(this.materialeSecundare==null){
            this.materialeSecundare=new ArrayList<>();
        }
        this.materialeSecundare.add(material);
    }

    public void addMesaje(String mesaj){
        if(this.mesajeTextPrintabile==null){
            this.mesajeTextPrintabile=new ArrayList<>();
        }
        this.mesajeTextPrintabile.add(mesaj);
    }


    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof='" + tipPantof + '\'' +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", tipMaterialBaza='" + tipMaterialBaza + '\'' +
                ", materialeSecundare=" + materialeSecundare +
                ", mesajeTextPrintabile=" + mesajeTextPrintabile +
                '}';
    }
}
