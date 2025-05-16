package Structural.Proxy.Program;

import Structural.Proxy.Clase.Client;
import Structural.Proxy.Clase.IPetrecere;
import Structural.Proxy.Clase.Petrecere;
import Structural.Proxy.Clase.PetrecereProxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //inainte de aplicare restrictii
        List<String>listaInvitati=new ArrayList<>();
        listaInvitati.add("Ada Milea");
        listaInvitati.add("Alex Velea");

        Client c1=new Client("Ionel", 26);
        Client c2=new Client("Maria", 15);
        Petrecere petrecere=new Petrecere("16/05/2025", listaInvitati);
        petrecere.adaugaParticipant(c1);
        petrecere.adaugaParticipant(c2);

        //dupa aplicare restrictii prin proxy
        System.out.println("Dupa aplicare restrictii Proxy:");
        IPetrecere petrecereProxy=new PetrecereProxy(petrecere);
        Client c3=new Client("Ana", 17);
        Client c4=new Client("Marcela", 18);
        petrecereProxy.adaugaParticipant(c3);
        petrecereProxy.adaugaParticipant(c4);
    }
}
