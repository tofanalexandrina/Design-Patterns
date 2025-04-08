package Creational.FactoryMethod.Classes;

public class AirQualityReportFactory {
    public static AAirQualityReportAbstractFactory alegeRaport(int pm2_5){
        if(pm2_5>=0 && pm2_5<=30){
            return new RaportAerCuratFactoryReport();
        }else if(pm2_5<=70){
            return new RaportAvertizareFactoryReport();
        }else {
            return new RaportRiscFactoryReport();
        }
    }

}
