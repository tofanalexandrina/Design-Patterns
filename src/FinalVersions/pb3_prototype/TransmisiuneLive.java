package FinalVersions.pb3_prototype;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements ILive{
    private String platforma;
    private List<String> comentarii;

    public TransmisiuneLive(String platforma) {
        this.platforma = platforma;
        comentarii=new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public TransmisiuneLive clone() {
        try {
            TransmisiuneLive transmisiuneLive = (TransmisiuneLive) super.clone();
            transmisiuneLive.comentarii=new ArrayList<>();
            return transmisiuneLive;

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addComentarii(String comentariu) {
        comentarii.add(comentariu);
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    @Override
    public String toString() {
        return "TransmisiuneLiveEURO2024{" +
                "platforma='" + platforma + '\'' +
                ", comentarii=" + comentarii +
                '}';
    }
}
