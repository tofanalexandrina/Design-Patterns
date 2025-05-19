package Behavioural.Chain_Subiect3.Clase;

import java.util.ArrayList;
import java.util.List;

public class FiltruImagine extends AFiltruHandler{
    @Override
    public void handle(List<IItem> items) {
        List<IItem>itemsFaraImagini=new ArrayList<>();
        for(IItem item:items){
            if(!item.getType().equals("Imagine")){
                itemsFaraImagini.add(item);
            }
        }
        items.clear();
        items.addAll(itemsFaraImagini);
        if(getNext()!=null){
            this.getNext().handle(items);
        }
    }
}
