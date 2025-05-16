package Structural.Proxy.Clase;

import java.util.ArrayList;
import java.util.List;

//Real Subject
public class Petrecere implements IPetrecere{
    private String data;
    private List<String>listaInvitati;
    private List<Client> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati) {
        this.data = data;
        this.listaInvitati = listaInvitati;
        this.listaParticipanti = new ArrayList<>();
    }

    @Override
    public void adaugaParticipant(Client c) {
        this.listaParticipanti.add(c);
        System.out.println("Clientul "+c+" a fost adaugat la petrecere.");
    }

    @Override
    public void afisareProgram() {
    }
}
