package Behavioural.Chain_Subiect3.Program;

import Behavioural.Chain_Subiect3.Clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //chain
        AFiltruHandler filtruImagine=new FiltruImagine();
        AFiltruHandler filtruParagraf=new FiltruParagraf();
        filtruImagine.setNext(filtruParagraf);

        //creare pagini
        PaginaWeb pagina1 = new PaginaWeb();
        pagina1.adaugaItem(new Paragraf("Paragraf1"));
        pagina1.adaugaItem(new Imagine("Imagine1"));
        pagina1.adaugaItem(new Paragraf("Paragraf2"));
        pagina1.adaugaItem(new Imagine("Imagine2"));

        PaginaWeb pagina2 = new PaginaWeb();
        pagina2.adaugaItem(new Paragraf("Paragraf3"));
        pagina2.adaugaItem(new Imagine("Imagine3"));
        pagina2.adaugaItem(new Paragraf("Paragraf4"));
        pagina2.adaugaItem(new Imagine("Imagine4"));

        System.out.println("Pagina 1 inainte de filtrare:");
        System.out.println(pagina1);

        filtruImagine.handle(pagina1.getItems());
        System.out.println("\nPagina 1 dupa filtrare:");
        System.out.println(pagina1);

        System.out.println("\nPagina 2 inainte de filtrare:");
        System.out.println(pagina2);

        filtruImagine.handle(pagina2.getItems());
        System.out.println("\nPagina 2 dupa filtrare:");
        System.out.println(pagina2);
    }
}
