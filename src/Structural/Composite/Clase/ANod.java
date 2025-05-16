package Structural.Composite.Clase;

//<<interface>> Component
public  abstract class ANod {
    public abstract String getDenumire();
    public abstract int getPret();

    //operation
    public String getInfo(){
        return this.getDenumire()+" "+this.getPret();
    }

    //add
    public void addNod(ANod element){

    }

    //remove
    public void removeNod(ANod element){

    }

    //getChild
    public ANod getNod(int i){
        throw new UnsupportedOperationException();
    }

}
