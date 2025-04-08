package Creational.FactoryMethod.Classes;

//factory concret
public class RaportAerCuratFactoryReport extends AAirQualityReportAbstractFactory {
    @Override
    public IAbstractAirQualityReport getRaport() {
        return new RaportAerCurat();
    }
}
