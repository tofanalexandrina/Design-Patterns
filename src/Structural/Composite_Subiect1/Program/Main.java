package Structural.Composite_Subiect1.Program;

import Structural.Composite_Subiect1.Clase.StructuraComposite;
import Structural.Composite_Subiect1.Clase.Tulpina;

public class Main {
    public static void main(String[] args) {
        //nivel 0
        StructuraComposite europa=new StructuraComposite("Europa");
        StructuraComposite asia=new StructuraComposite("Asia");
        StructuraComposite africa=new StructuraComposite("Africa");

        //nivel 1
        StructuraComposite franta=new StructuraComposite("Franta");
        StructuraComposite italia=new StructuraComposite("Italia");
        StructuraComposite china=new StructuraComposite("China");
        StructuraComposite india=new StructuraComposite("India");
        StructuraComposite egipt=new StructuraComposite("Egipt");
        StructuraComposite africaDeSud=new StructuraComposite("Africa de Sud");

        //nivel 2
        Tulpina delta=new Tulpina("Delta", 20000);
        Tulpina alfa=new Tulpina("Alfa", 400000);
        Tulpina beta=new Tulpina("Beta", 30000);
        Tulpina omicron=new Tulpina("Omicron", 50000);


        //construire arbore
        europa.add(franta);
        europa.add(italia);
        asia.add(china);
        asia.add(india);
        africa.add(egipt);
        africa.add(africaDeSud);

        franta.add(delta);
        franta.add(alfa);
        italia.add(delta);
        italia.add(omicron);
        china.add(alfa);
        china.add(omicron);
        india.add(delta);
        india.add(beta);
        egipt.add(omicron);
        egipt.add(beta);
        africaDeSud.add(omicron);
        africaDeSud.add(delta);

        System.out.println("Structura arborescenta virusuri:");
        System.out.println(europa.getInfo());
        System.out.println(asia.getInfo());
        System.out.println(africa.getInfo());


        System.out.println("Numar total cazuri inregistrate:");
        int totalCazuri=alfa.getNrCazuri()+ delta.getNrCazuri()+ omicron.getNrCazuri()+ beta.getNrCazuri();
        System.out.println(totalCazuri);
    }
}
