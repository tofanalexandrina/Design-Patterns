package Behavioural.Strategy.Clase;

import java.util.ArrayList;

//Concrete Strategy
public class StrategieCaloriiMinim implements IProcesabilStrategy{
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaCaloriiMinime=listaMeniuri.get(0);
        for(OfertaMeniu oferta:listaMeniuri){
            if(oferta.getNrCalorii()<ofertaCaloriiMinime.getNrCalorii()){
                ofertaCaloriiMinime=oferta;
            }
        }
        return ofertaCaloriiMinime;
    }
}
