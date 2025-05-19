package Behavioural.Chain_Subiect3.Clase;

public class Paragraf implements IItem{
    private String text;
    private String stil;

    public Paragraf(String text) {
        this.text = text;
        this.stil = "color: black, font-weight: bold; font-style: italic";
    }

    @Override
    public String getType() {
        return "Paragraf";
    }

    @Override
    public void setStil(String stil) {
        this.stil=stil;
    }

    @Override
    public String toString() {
        return "Paragraf{" +
                "text='" + text + '\'' +
                ", stil='" + stil + '\'' +
                '}';
    }
}
