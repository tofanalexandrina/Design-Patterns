package Creational.Builder_Simplu.Program;

import Creational.Builder_Simplu.Classes.Pantof;
import Creational.Builder_Simplu.Classes.PantofBuilder;

public class Main {
    public static void main(String[] args) {
        //varianta 1
        PantofBuilder pantofBuilder=new PantofBuilder();
        Pantof pantof1=pantofBuilder.setTipPantof("balerini").setNrPantof(35).setDimensiuneToc(10).setTipMaterialBaza("Piele").buildPantof();
        System.out.println(pantof1);
        Pantof pantof2=pantofBuilder.setTipPantof("stiletto").setNrPantof(38).setDimensiuneToc(7).setMaterialeSecundare("Catifea").setMaterialeSecundare("Piele intoarsa").buildPantof();
        System.out.println(pantof2);

        //varianta 2
        PantofBuilder pantofBuilder2=new PantofBuilder("Adidasi", 38, 9, "Piele");
        Pantof pantof3=pantofBuilder2.setMesajeTextPrintabile("Life is good").setMesajeTextPrintabile("YOLO").buildPantof();
        System.out.println(pantof3);
    }
}