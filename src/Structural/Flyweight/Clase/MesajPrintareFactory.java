package Structural.Flyweight.Clase;

import java.util.HashMap;

public class MesajPrintareFactory {
    //aici se gestioneaza instantele partajate de MesajPrintareConcreteFlyweight
    private static HashMap<ETipPrintare, MesajPrintareConcreteFly> listaMesaje=new HashMap<>();
    private static int nrBonuriPrintate=0;

    //getFlyweight(key)
    public static MesajPrintareConcreteFly getMesajPrintare(ETipPrintare tipPrintare){
        nrBonuriPrintate++;
        MesajPrintareConcreteFly mesajPrintare=listaMesaje.get(tipPrintare);
        if(mesajPrintare==null){
            mesajPrintare=new MesajPrintareConcreteFly(tipPrintare);
            listaMesaje.put(tipPrintare, mesajPrintare);
        }
        return mesajPrintare;
    }

    public static int getNrBonuriPrintate() {
        return nrBonuriPrintate;
    }

    public static int getNrMatriteBonuri(){
        return listaMesaje.size();
    }
}
