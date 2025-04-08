package Creational.FactoryMethod.Classes;

//produs
public class RaportAvertizare implements IAbstractAirQualityReport{
    @Override
    public void generareRaport() {
        System.out.println("Avertizare! Valoarea PM 2.5 este cuprinsă în intervalul 31-70.");
    }
}
