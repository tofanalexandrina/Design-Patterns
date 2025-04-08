package Creational.FinalVersions.pb2_factory;

public class Main {
    public static void main(String[] args) {
        RaportAbstractFactory factory1= RaportFactory.raportFactory(20);
        AbstractAirQualityReport raport1=factory1.creareRaport();
        raport1.display();

        RaportAbstractFactory factory2= RaportFactory.raportFactory(32);
        AbstractAirQualityReport raport2=factory2.creareRaport();
        raport2.display();

        RaportAbstractFactory factory3= RaportFactory.raportFactory(80);
        AbstractAirQualityReport raport3=factory3.creareRaport();
        raport3.display();
    }

}