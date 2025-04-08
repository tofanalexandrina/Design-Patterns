package Creational.FactoryMethod.Classes;

//produs
public class RaportAerCurat implements IAbstractAirQualityReport{

    @Override
    public void generareRaport() {
        System.out.println("Aer Curat! Valoare PM 2.5 este cuprinsă în intervalul 0-30.");
    }
}
