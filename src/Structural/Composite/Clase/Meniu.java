package Structural.Composite.Clase;

//wrapper care contine o structura de meniu si numele restaurantului
public class Meniu {
    private StructuraComposite structura;
    private String numeRestaurant;

    public Meniu(StructuraComposite structura, String numeRestaurant) {
        this.structura = structura;
        this.numeRestaurant = numeRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }
}
