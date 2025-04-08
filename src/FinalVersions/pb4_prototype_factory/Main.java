package FinalVersions.pb4_prototype_factory;

public class Main {
    public static void main(String[] args) {
        AJucator jucator1=JucatorPrototypeFactory.getJucator("fotbal");
        AJucator jucator2=jucator1.clone();
        jucator2.addAntrenamente("Sprint");
        jucator1.setAntrenament("Pase");
        jucator1.addAntrenamente("Aruncari");


        AJucator jucator3=JucatorPrototypeFactory.getJucator("basket");
        jucator3.addAntrenamente("Saritura");
        jucator3.addMedicamente("LSD");
        System.out.println(jucator1);
        System.out.println(jucator2);
        System.out.println(jucator3);
    }
}