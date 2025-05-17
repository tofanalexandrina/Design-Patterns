package Behavioural.Template.Clase;

public abstract class AEvaluareDaune {
    //pas fix, executat indiferent de tip dauna
    private final void identificareDauna(){
        System.out.println("S-a identificat o noua dauna");
    }

    //submethods (package visibility)
    abstract void evaluareInitiala();
    abstract void trimitereEvaluare();

    //template method
    public final void proceduraEvaluare(){
        identificareDauna();
        evaluareInitiala();
        trimitereEvaluare();
    }
}
