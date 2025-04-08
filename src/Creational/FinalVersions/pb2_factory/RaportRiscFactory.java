package Creational.FinalVersions.pb2_factory;

public class RaportRiscFactory extends RaportAbstractFactory {
    @Override
    public AbstractAirQualityReport creareRaport() {
        return new RaportRisc();
    }
}
