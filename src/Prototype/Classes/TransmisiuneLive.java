package Prototype.Classes;

import java.util.ArrayList;
import java.util.List;

//Concrete Prototype class
public class TransmisiuneLive implements ILive{
    private String evenimentSportiv;
    private String platforma;
    private List<String> listaComentarii;

    public TransmisiuneLive(String evenimentSportiv, String platforma) {
        this.evenimentSportiv = evenimentSportiv;
        this.platforma=platforma;
        listaComentarii=new ArrayList<>();
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    @Override
    public ILive clone() {
        TransmisiuneLive transmisiuneClonata = new TransmisiuneLive(this.evenimentSportiv, this.platforma);
        //deep copy pentru lista de comentarii
        transmisiuneClonata.listaComentarii=new ArrayList<>();
        return transmisiuneClonata;
    }

    @Override
    public void display() {
        System.out.println("Evenimentul: " + evenimentSportiv + " e live!");
        System.out.println("Platforma: " + platforma);
        System.out.println("Comentarii: "+listaComentarii + "\n");
    }

    @Override
    public void addComment(String comment) {
        listaComentarii.add(comment);
    }
}
