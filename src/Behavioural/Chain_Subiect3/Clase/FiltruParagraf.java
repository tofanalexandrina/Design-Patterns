package Behavioural.Chain_Subiect3.Clase;

import java.util.List;

public class FiltruParagraf extends AFiltruHandler{
    @Override
    public void handle(List<IItem> items) {
        for(IItem item:items){
            if(item.getType().equals("Paragraf")){
                item.setStil("color: black");
            }
        }
    }
}
