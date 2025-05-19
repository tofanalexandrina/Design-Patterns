package Behavioural.Strategy_Subiect3.Clase;

import java.util.Comparator;
import java.util.List;

public class StrategieSortareDescresc implements IProdusStrategy{
    @Override
    public List<IProdus> vizualizareProduse(List<IProdus> produse) {
        produse.sort(Comparator.comparingDouble(IProdus::getPret).reversed());
        return produse;
    }
}
