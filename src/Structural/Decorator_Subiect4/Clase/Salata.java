package Structural.Decorator_Subiect4.Clase;

public class Salata implements IProdus{

    @Override
    public String getDescriere() {
        return "salata caesar cu pui";
    }

    @Override
    public int getPret() {
        return 25;
    }
}
