package Behavioural.Strategy_Subiect3.Program;

import Behavioural.Strategy_Subiect3.Clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IProdus produs1=new Produs("Rochie", 100, 5);
        IProdus produs2=new Produs("Cercei", 10, 0);
        IProdus produs3=new Produs("Caciula", 50, 2);
        IProdus produs4=new Produs("Pantaloni", 150, 10);

        List<IProdus> produse=new ArrayList<>();
        produse.add(produs1);
        produse.add(produs2);
        produse.add(produs3);
        produse.add(produs4);

        System.out.println("Afisare crescatoare:");
        Utilizator utilizator1=new Utilizator("Ion", new StrategieSortareCresc());
        utilizator1.afisareProduse(produse);
        System.out.println("\nAfisare descrescatoare:");
        utilizator1.setStrategieVizualizare(new StrategieSortareDescresc());
        utilizator1.afisareProduse(produse);
        System.out.println("\nAfisare cu minim 1 recenzie:");
        utilizator1.setStrategieVizualizare(new StrategieMinimRecenzie());
        utilizator1.afisareProduse(produse);
    }
}
