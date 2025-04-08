package Creational.FactoryMethod.Classes;

//produs
public class RaportRisc implements IAbstractAirQualityReport{
    @Override
    public void generareRaport() {
        System.out.println("Risc asupra sanatatii! Valoarea PM 2.5 depășește 71.");
    }
}
