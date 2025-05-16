package Structural.Proxy.Clase;

public class PetrecereProxy implements IPetrecere{
    //!!Referinta privata catre obiectul Petrecere pe care il reprezinta
    private Petrecere petrecere;

    public PetrecereProxy(Petrecere petrecere) {
        this.petrecere = petrecere;
    }

    @Override
    public void adaugaParticipant(Client c) {
        //implementare control acces la petrecere
        if(c.getVarsta()>=18){
            petrecere.adaugaParticipant(c);
        }else{
            System.out.println("Clientul "+c.getNume()+" nu are varsta minima de 18 ani.");
        }
    }

    @Override
    public void afisareProgram() {
        this.petrecere.afisareProgram();
    }
}
