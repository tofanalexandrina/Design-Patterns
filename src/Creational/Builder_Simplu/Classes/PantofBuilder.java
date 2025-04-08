package Creational.Builder_Simplu.Classes;

import java.util.ArrayList;
import java.util.List;

public class PantofBuilder implements IBuilder{
    private String tipPantof;
    private int nrPantof;
    private float dimensiuneToc;
    private String tipMaterialBaza;
    private List<String> materialeSecundare=new ArrayList<>();
    private List<String> mesajeTextPrintabile=new ArrayList<>();

    public PantofBuilder() {
    }

    public PantofBuilder(String tipPantof, int nrPantof, float dimensiuneToc, String tipMaterialBaza) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.tipMaterialBaza = tipMaterialBaza;
    }

    public PantofBuilder setTipPantof(String tipPantof) {
        this.tipPantof = tipPantof;
        return this;
    }

    public PantofBuilder setNrPantof(int nrPantof) {
        this.nrPantof = nrPantof;
        return this;
    }

    public PantofBuilder setDimensiuneToc(float dimensiuneToc) {
        this.dimensiuneToc = dimensiuneToc;
        return this;
    }

    public PantofBuilder setTipMaterialBaza(String tipMaterialBaza) {
        this.tipMaterialBaza = tipMaterialBaza;
        return this;
    }

    public PantofBuilder setMaterialeSecundare(String materialSecundar) {
        this.materialeSecundare.add(materialSecundar);
        return this;
    }

    public PantofBuilder setMesajeTextPrintabile(String mesajeTextPrintabil) {
        this.mesajeTextPrintabile.add(mesajeTextPrintabil);
        return this;
    }

    public void reset(){
        this.tipPantof=null;
        this.nrPantof=0;
        this.dimensiuneToc=0;
        this.tipMaterialBaza=null;
        this.materialeSecundare=new ArrayList<>();
        this.mesajeTextPrintabile=new ArrayList<>();
    }

    @Override
    public Pantof buildPantof() {
        if(this.nrPantof<35 || this.nrPantof>45){
            throw new CustomException("Numar pantof invalid (interval: 35-45).");
        }
        if(this.dimensiuneToc<0.5 || this.dimensiuneToc>12.5){
            throw new CustomException("Dimensiune toc invalida (interval: 0.5-12.5).");
        }
        Pantof pantof=new Pantof(this.tipPantof, this.nrPantof, this.dimensiuneToc, this.tipMaterialBaza);
        for(String material:this.materialeSecundare){
            pantof.addMateriale(material);
        }
        for(String text:this.mesajeTextPrintabile){
            pantof.addMesaje(text);
        }
        reset();
        return pantof;
    }
}
