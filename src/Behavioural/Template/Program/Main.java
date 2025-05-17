package Behavioural.Template.Program;

import Behavioural.Template.Clase.AEvaluareDaune;
import Behavioural.Template.Clase.EvaluareDauneAuto;
import Behavioural.Template.Clase.EvaluareDauneBucatarie;
import Behavioural.Template.Clase.EvaluareDauneImobiliare;

public class Main {
    public static void main(String[] args) {
        AEvaluareDaune daunaBucatarie =new EvaluareDauneBucatarie();
        AEvaluareDaune daunaAuto=new EvaluareDauneAuto();
        AEvaluareDaune daunaImobiliara=new EvaluareDauneImobiliare();
        daunaBucatarie.proceduraEvaluare();
        System.out.println("\n");
        daunaAuto.proceduraEvaluare();
        System.out.println("\n");
        daunaImobiliara.proceduraEvaluare();

    }
}
