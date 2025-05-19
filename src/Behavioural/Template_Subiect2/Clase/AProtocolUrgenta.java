package Behavioural.Template_Subiect2.Clase;

public abstract class AProtocolUrgenta {
    //pasi ficsi
    private void verificareSemneVitale(){
        System.out.println("Se verifica semnele vitale.");
    };
    private boolean esteCritic(){
        System.out.println("Evaluare semne vitale");
        return Math.random()>0.5;
    }

    private void verificareDisponibilitateSpital(){
        System.out.println("Se verifica disponibilitate spital.");
    };

    private void verificareCentralizatorProgramari(){
        System.out.println("Se verifica centralizatorul de programari al medicilor de familie.");
    }


    private void finalizareProtocol(){
        System.out.println("Protocol finalizat.\n");
    }


    //pasi care difera
    abstract void sesizareUrgenta();
    abstract void interventieEchipaMedici();

    //template method
    public final void protocolUrgenta(){
        sesizareUrgenta();
        verificareSemneVitale();
        if(esteCritic()){
            System.out.println("Pacientul este in stare critica.");
            interventieEchipaMedici();
            verificareDisponibilitateSpital();
        }else{
            System.out.println("Pacientul nu este in stare critica.");
            verificareCentralizatorProgramari();
        }
        finalizareProtocol();
    }
}
