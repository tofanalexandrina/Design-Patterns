package Creational.Prototype.Classes;

//Creational.Prototype Interface
public interface ILive extends Cloneable {
    ILive clone();
    void display();
    void addComment(String comment);
}
