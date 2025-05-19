package Structural.Decorator_Subiect4.Clase;

public class Paste implements IProdus{
    @Override
    public String getDescriere() {
        return "paste cu sos bolognese";
    }

    @Override
    public int getPret() {
        return 30;
    }
}
