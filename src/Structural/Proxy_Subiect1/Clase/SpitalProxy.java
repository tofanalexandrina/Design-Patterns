package Structural.Proxy_Subiect1.Clase;

public class SpitalProxy implements ISpital{
    private Vizitator vizitator;
    private boolean echipat;

    public SpitalProxy(Vizitator vizitator) {
        this.vizitator = vizitator;
        this.echipat=false;
    }

    @Override
    public void permiteAcces() {
        if(vizitator.getAreScrisoareAcceptare()){
            vizitator.permiteAcces();
            if(!echipat){
                echipat=true;
                System.out.println(vizitator.getNume()+" a fost echipat cu haine de protectie.");
            }
        }else{
            System.out.println("Nu este permis accesul vizitatorului "+ vizitator.getNume()+", nu are scrisoare de acceptare.");
        }
    }
}
