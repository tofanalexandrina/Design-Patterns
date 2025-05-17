package Behavioural.Strategy.Clase;

import java.util.ArrayList;

//Context
public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> listaMeniuri=new ArrayList<>();
    //-strategie:Strategy
    private IProcesabilStrategy strategie;

    public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
        this.listaMeniuri.add(ofertaMeniu);
    }

    //setStrategie(strategie:Strategy):void
    public void setStrategie(IProcesabilStrategy strategie){
        this.strategie=strategie;
    }

    //operatie():void
    public OfertaMeniu alegereOferta(){
        if(strategie!=null){
            return strategie.alegereMeniu(listaMeniuri);
        }else{
            throw new UnsupportedOperationException();
        }
    }
}
