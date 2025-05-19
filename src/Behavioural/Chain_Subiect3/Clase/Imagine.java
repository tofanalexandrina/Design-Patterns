package Behavioural.Chain_Subiect3.Clase;

public class Imagine implements IItem{
    private String sursa;

    public Imagine(String sursa) {
        this.sursa = sursa;
    }

    @Override
    public String getType() {
        return "Imagine";
    }

    @Override
    public void setStil(String stil) {

    }

    @Override
    public String toString() {
        return "Imagine{" +
                "sursa='" + sursa + '\'' +
                '}';
    }
}
