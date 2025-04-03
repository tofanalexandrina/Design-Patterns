package Prototype.Program;

import Prototype.Classes.ILive;
import Prototype.Classes.TransmisiuneLive;

public class Main {
    public static void main(String[] args) {
        ILive transmisiuneOriginala=new TransmisiuneLive("EURO 2024", "YouTube");
        transmisiuneOriginala.addComment("Comentariu 1 YouTube");
        transmisiuneOriginala.addComment("Comentariu 2 Youtube");
        transmisiuneOriginala.display();

        //varianta 1 - ar respecta mai mult open-closed
        ILive transmisiuneFacebook= transmisiuneOriginala.clone();
        ((TransmisiuneLive) transmisiuneFacebook).setPlatforma("Facebook");
        transmisiuneFacebook.addComment("Comentariu pentru Facebook");
        transmisiuneFacebook.display();

        //varianta 2 - propusa de intellij
        TransmisiuneLive transmisiuneTwitch= (TransmisiuneLive) transmisiuneOriginala.clone();
        transmisiuneTwitch.setPlatforma("Twitch");
        transmisiuneTwitch.addComment("Comentariu pentru Twitch");
        transmisiuneTwitch.display();

    }
}
