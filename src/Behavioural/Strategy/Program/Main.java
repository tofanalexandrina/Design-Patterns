package Behavioural.Strategy.Program;

import Behavioural.Strategy.Clase.MeniuRestaurant;
import Behavioural.Strategy.Clase.OfertaMeniu;
import Behavioural.Strategy.Clase.StrategieCaloriiMinim;
import Behavioural.Strategy.Clase.StrategieCarbohidratiMinim;

public class Main {
    public static void main(String[] args) {
        //instantiere context
        MeniuRestaurant meniuRestaurant=new MeniuRestaurant();

        OfertaMeniu meniu1=new OfertaMeniu("Meniu1", 700, 70);
        OfertaMeniu meniu2=new OfertaMeniu("Meniu2", 500, 80);
        OfertaMeniu meniu3=new OfertaMeniu("Meniu3", 650, 20);
        OfertaMeniu meniu4=new OfertaMeniu("Meniu4", 800, 90);

        meniuRestaurant.addOfertaMeniu(meniu1);
        meniuRestaurant.addOfertaMeniu(meniu2);
        meniuRestaurant.addOfertaMeniu(meniu3);
        meniuRestaurant.addOfertaMeniu(meniu4);

        meniuRestaurant.setStrategie(new StrategieCaloriiMinim());
        System.out.println("Meniul cu nr minim de calorii: "+meniuRestaurant.alegereOferta());

        meniuRestaurant.setStrategie(new StrategieCarbohidratiMinim());
        System.out.println("Meniul cu nr minim de carbohidrati: "+meniuRestaurant.alegereOferta());
    }
}
