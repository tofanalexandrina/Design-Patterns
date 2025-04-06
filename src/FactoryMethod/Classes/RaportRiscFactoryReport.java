package FactoryMethod.Classes;

//factory concret
public class RaportRiscFactoryReport extends AAirQualityReportAbstractFactory {
    @Override
    public IAbstractAirQualityReport getRaport() {
        return new RaportRisc();
    }
}
