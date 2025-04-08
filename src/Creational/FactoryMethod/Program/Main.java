package Creational.FactoryMethod.Program;


import Creational.FactoryMethod.Classes.AAirQualityReportAbstractFactory;
import Creational.FactoryMethod.Classes.AirQualityReportFactory;
import Creational.FactoryMethod.Classes.IAbstractAirQualityReport;

public class Main {
    public static void main(String[] args) {
        AAirQualityReportAbstractFactory factory1= AirQualityReportFactory.alegeRaport(20);
        IAbstractAirQualityReport raport1=factory1.getRaport();
        raport1.generareRaport();

        AAirQualityReportAbstractFactory factory2= AirQualityReportFactory.alegeRaport(60);
        IAbstractAirQualityReport raport2=factory2.getRaport();
        raport2.generareRaport();

        AAirQualityReportAbstractFactory factory3= AirQualityReportFactory.alegeRaport(90);
        IAbstractAirQualityReport raport3=factory3.getRaport();
        raport3.generareRaport();
    }
}
