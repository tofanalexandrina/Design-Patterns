package Structural.Decorator_Subiect4.Clase;

public class Pizza implements IProdus{
    @Override
    public String getDescriere() {
        return "pizza diavola";
    }

    @Override
    public int getPret() {
        return 35;
    }
}
