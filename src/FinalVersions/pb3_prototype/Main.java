package FinalVersions.pb3_prototype;

public class Main {
    public static void main(String[] args) {

        ILive transmisiuneLive=new TransmisiuneLive("Facebook");
        transmisiuneLive.addComentarii("Bravoooo!");
        transmisiuneLive.display();

        ILive transmisiuneLive2=transmisiuneLive.clone();
        ((TransmisiuneLive) transmisiuneLive2).setPlatforma("YouTube");
        transmisiuneLive2.addComentarii("Huaaaa!");
        transmisiuneLive2.display();


    }
}