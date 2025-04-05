package Builder.Classes;

//podeaua standard existenta in mall
public class PodeaCiment implements IPodea{
    private int duritateCiment;
    public PodeaCiment() {
        this.duritateCiment=10;
    }

    @Override
    public String toString() {
        return "PodeaCiment{" +
                "duritateCiment=" + duritateCiment +
                '}';
    }

    @Override
    public int getDuritate() {
        return this.duritateCiment;
    }
}
