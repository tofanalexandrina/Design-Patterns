package Creational.Prototype.Program;

import Creational.Prototype.Classes.ILive;
import Creational.Prototype.Classes.TransmisiuneLive;

public class Main {
    public static void main(String[] args) {
        ILive transmisiuneOriginala=new TransmisiuneLive("EURO 2024", "YouTube");
        transmisiuneOriginala.addComment("Comentariu 1 YouTube");
        transmisiuneOriginala.addComment("Comentariu 2 Youtube");
        transmisiuneOriginala.display();

        ILive transmisiuneFacebook= transmisiuneOriginala.clone();
        ((TransmisiuneLive) transmisiuneFacebook).setPlatforma("Facebook");
        transmisiuneFacebook.addComment("Comentariu pentru Facebook");
        transmisiuneFacebook.addComment("Alt comentariu pentru Facebook");
        transmisiuneFacebook.display();

        ILive transmisiuneTwitch= transmisiuneOriginala.clone();
        ((TransmisiuneLive)transmisiuneTwitch).setPlatforma("Twitch");
        transmisiuneTwitch.addComment("Comentariu pentru Twitch");
        transmisiuneTwitch.addComment("Alt comentariu pentru Twitch");
        transmisiuneTwitch.display();

    }
}
