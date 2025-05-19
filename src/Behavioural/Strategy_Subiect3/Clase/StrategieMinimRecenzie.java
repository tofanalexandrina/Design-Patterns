package Behavioural.Strategy_Subiect3.Clase;

import java.util.ArrayList;
import java.util.List;

public class StrategieMinimRecenzie implements IProdusStrategy{
    @Override
    public List<IProdus> vizualizareProduse(List<IProdus> produse) {
        List<IProdus> produseCuRecenzii=new ArrayList<>();
        for(IProdus p:produse){
            if(p.getRecenzii()>=1){
                produseCuRecenzii.add(p);
            }
        }
        return produseCuRecenzii;
    }
}
