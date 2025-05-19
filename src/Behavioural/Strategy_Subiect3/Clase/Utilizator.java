package Behavioural.Strategy_Subiect3.Clase;

import java.util.List;

public class Utilizator {
    private String nume;
    private IProdusStrategy strategieVizualizare;

    public Utilizator(String nume, IProdusStrategy strategieVizualizare) {
        this.nume = nume;
        this.strategieVizualizare = strategieVizualizare;
    }

    public void setStrategieVizualizare(IProdusStrategy strategieVizualizare) {
        this.strategieVizualizare = strategieVizualizare;
    }

    public void afisareProduse(List<IProdus>produse){
        List<IProdus> produseAfisate = strategieVizualizare.vizualizareProduse(produse);
        System.out.println("Produse pentru utilizatorul " + nume + ":");
        for (IProdus produs : produseAfisate) {
            System.out.println(produs);
        }
    }
}
