package Structural.Flyweight.Clase;

//Concrete Flyweight
public class MesajPrintareConcreteFly implements IPrintareFlyweight{
    private ETipPrintare tipPrintare;
    //intrinsic state(mereu private)
    private String mesajPrintare;

    public MesajPrintareConcreteFly(ETipPrintare tipPrintare) {
        this.tipPrintare = tipPrintare;
        System.out.println("S-a creat obiect cu printare de tip: "+this.tipPrintare);
    }

    public ETipPrintare getTipPrintare() {
        return tipPrintare;
    }


    @Override
    public void printareBon(Bon bon) {
        System.out.println("Pentru printare s-a folosit formatul: "+this.getTipPrintare());
        System.out.println("Se printeaza bonul de la masa "+ bon.getNrMasa());
    }
}
