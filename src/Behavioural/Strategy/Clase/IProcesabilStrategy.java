package Behavioural.Strategy.Clase;


import java.util.ArrayList;

//<<interface>> Strategy
public interface IProcesabilStrategy {
    //execute()
    OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri);
}
