package Prototype.Classes;

//Prototype Interface
public interface ILive extends Cloneable {
    ILive clone();
    void display();
    void addComment(String comment);
}
