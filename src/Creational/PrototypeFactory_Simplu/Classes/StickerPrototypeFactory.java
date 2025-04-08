package Creational.PrototypeFactory_Simplu.Classes;

import java.util.HashMap;
import java.util.Map;

public class StickerPrototypeFactory {
    private Map<String, Sticker> prototipuri = new HashMap<>();

    public Sticker getSticker(IMasina masina){
        String key=masina.getModelMasina()+"-"+masina.getAnFabricatie();
        if(!prototipuri.containsKey(key)){
            prototipuri.put(key, new Sticker(masina));
        }
        return prototipuri.get(key).clone();
    }
}
