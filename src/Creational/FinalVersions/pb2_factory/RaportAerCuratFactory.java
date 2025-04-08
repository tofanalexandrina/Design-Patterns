package Creational.FinalVersions.pb2_factory;

public class RaportAerCuratFactory extends RaportAbstractFactory {

    @Override
    public AbstractAirQualityReport creareRaport() {
        return new RaportAerCurat();
    }
}
