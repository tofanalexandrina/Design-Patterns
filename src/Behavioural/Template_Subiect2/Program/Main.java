package Behavioural.Template_Subiect2.Program;

import Behavioural.Template_Subiect2.Clase.AProtocolUrgenta;
import Behavioural.Template_Subiect2.Clase.ProtocolSpitalPrivat;
import Behavioural.Template_Subiect2.Clase.ProtocolSpitalPublic;

public class Main {
    public static void main(String[] args) {
        AProtocolUrgenta protocolPublic=new ProtocolSpitalPublic();
        AProtocolUrgenta protocolPrivat=new ProtocolSpitalPrivat();
        protocolPublic.protocolUrgenta();
        System.out.println("\n");
        protocolPrivat.protocolUrgenta();
    }
}
