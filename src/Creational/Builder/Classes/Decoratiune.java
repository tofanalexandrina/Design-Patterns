package Creational.Builder.Classes;

public class Decoratiune implements IDecoratiuni{
    ETipMaterial tipMaterial;
    String denumire;

    public Decoratiune(ETipMaterial tipMaterial, String denumire) {
        this.tipMaterial = tipMaterial;
        this.denumire = denumire;
    }


    @Override
    public String toString() {
        return "Decoratiune{" +
                "tipMaterial=" + tipMaterial +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    public ETipMaterial getTipMaterialDecoratiuni() {
        return this.tipMaterial;
    }
}
