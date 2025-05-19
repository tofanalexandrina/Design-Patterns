package Structural.Decorator_Subiect4.Clase;

public class Ciorba implements IProdus{

    @Override
    public String getDescriere() {
        return "ciorba de pui cu perisoare";
    }

    @Override
    public int getPret() {
        return 10;
    }
}
