package Prototype.Program;

import Prototype.Classes.ILive;
import Prototype.Classes.TransmisiuneLive;

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

        ILive transmisiuneOriginala2=new TransmisiuneLive("XFactor", "YouTube");
        transmisiuneOriginala2.addComment("Comentariu 1 YouTube");
        transmisiuneOriginala2.addComment("Comentariu 2 Youtube");
        transmisiuneOriginala2.display();

    }
}
