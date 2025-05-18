package Structural.Proxy_Subiect1.Clase;

import java.util.ArrayList;
import java.util.List;

public class SpitalProxy implements ISpital{
    private ISpital spital;
    private List<Vizitator>salaAsteptare;

    public SpitalProxy(ISpital spital) {
        this.spital = spital;
        this.salaAsteptare=new ArrayList<>();
    }

    @Override
    public void adaugaVizitator(Vizitator v) {
        if (v.getAreScrisoareAcceptare()) {
            salaAsteptare.add(v);
            System.out.println(v.getNume() + " a fost adaugat in sala de asteptare.");

            if (salaAsteptare.size() >= 5) {
                System.out.println("Echipare vizitatori.");
                for (Vizitator vizitator : salaAsteptare) {
                    spital.permiteAcces(vizitator);
                }
                salaAsteptare.clear();
                System.out.println("Acces permis pentru grup.");
            }
        }
    }

    @Override
    public void permiteAcces(Vizitator v) {
        adaugaVizitator(v);
    }
}
