package Creational.FactoryMethod.Classes;

//factory concret
public class RaportAvertizareFactoryReport extends AAirQualityReportAbstractFactory {
    @Override
    public IAbstractAirQualityReport getRaport() {
        return new RaportAvertizare();
    }
}
