package FinalVersions.pb2_factory;

public class RaportAvertizareFactory extends RaportAbstractFactory {
    @Override
    public AbstractAirQualityReport creareRaport() {
        return new RaportAvertizare();
    }
}
