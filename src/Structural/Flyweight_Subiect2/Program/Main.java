package Structural.Flyweight_Subiect2.Program;

import Structural.Flyweight_Subiect2.Clase.RecomandareFactory;
import Structural.Flyweight_Subiect2.Clase.Reteta;

public class Main {
    public static void main(String[] args) {
        RecomandareFactory.getRecomandare("Somn").printareReteta(new Reteta("Ion Popescu", "Otita"));
        System.out.println("\n");
        RecomandareFactory.getRecomandare("Consum").printareReteta(new Reteta("Ana Doga", "Indigestie"));
    }
}
