package Creational.PrototypeFactory_Simplu.Classes;

public class Sticker implements ISticker{
    private String modelMasina;
    private int anFabricatie;

    public Sticker(IMasina masina) {
        this.modelMasina = masina.getModelMasina();
        this.anFabricatie = masina.getAnFabricatie();
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public Sticker clone() {
        try {
            return (Sticker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "modelMasina='" + modelMasina + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
