package Behavioural.Strategy.Clase;

import java.util.ArrayList;

//Concrete Strategy
public class StrategieCarbohidratiMinim implements IProcesabilStrategy{
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaCarbohidratiMinim=listaMeniuri.get(0);
        for(OfertaMeniu oferta:listaMeniuri){
            if(oferta.getNrCarbohidrati()<ofertaCarbohidratiMinim.getNrCarbohidrati()){
                ofertaCarbohidratiMinim=oferta;
            }
        }
        return ofertaCarbohidratiMinim;
    }
}
