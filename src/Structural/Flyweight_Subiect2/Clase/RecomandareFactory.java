package Structural.Flyweight_Subiect2.Clase;

import java.util.HashMap;
import java.util.Map;

//pentru gestionare instante partajate de recomandari
public class RecomandareFactory {
    private static Map<String, IRecomandare> recomandariMap = new HashMap<>();

    static {
        recomandariMap.put("Apa", new Recomandare("Minim 2 litri de apa pe zi."));
        recomandariMap.put("Somn", new Recomandare("Minim 8 ore de somn pe noapte."));
        recomandariMap.put("Consum", new Recomandare("Evitati consumul de sare si zahar."));
    }


    public static IRecomandare getRecomandare(String tip) {
        IRecomandare recomandare = recomandariMap.get(tip);
        if (recomandare == null) {
            recomandare = new Recomandare(tip);
            recomandariMap.put(tip, recomandare);
        }
        return recomandare;
    }
}
