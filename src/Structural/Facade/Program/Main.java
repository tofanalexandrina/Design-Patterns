package Structural.Facade.Program;

import Structural.Facade.Classes.Facade;

public class Main {
    public static void main(String[] args) {
        System.out.println(Facade.verificaDisponibilitateBucatari(2, "12/12/2022"));
        System.out.println(Facade.verificaDisponibilitateSala("12/12/2022"));
    }
}
