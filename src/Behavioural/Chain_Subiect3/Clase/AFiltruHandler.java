package Behavioural.Chain_Subiect3.Clase;

import java.util.List;
import java.util.logging.FileHandler;

public abstract class AFiltruHandler {
    private AFiltruHandler next;

    public AFiltruHandler getNext(){
        return next;
    }

    public void setNext(AFiltruHandler next) {
        this.next = next;
    }

    public abstract void handle(List<IItem> items);
}
