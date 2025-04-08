package Creational.FinalVersions.pb2_factory;

public class RaportFactory {
    public static RaportAbstractFactory raportFactory(int indice){
        if(indice>=0&&indice<=30){
            return new RaportAerCuratFactory();
        }else if(indice>=31&&indice<=70){
            return new RaportAvertizareFactory();
        }else{
            return new RaportRiscFactory();
        }
    }
}
