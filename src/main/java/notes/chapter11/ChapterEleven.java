package notes.chapter11;

public class ChapterEleven {

    /*
    abstraction is the idea that something exists only in theory, its meant to be a place holder or template
    its there for later use but isnt initialized until later
    it must be extended before it can be used,
    abstract methods have no body and are meant to be used inside the subclass/ concreate classes
    if you use an abstract method the class itself must be abstract as well any classes that extend that class
    must either initialize the abstract method or the class itself must become abstract and pass the method
    down till a class cant become abstract and must take on and override that method

    once a class goes abstract we cannot make another object from that class it must be an instance of a none abstract class


     interfaces must be implemented not extended, classes can implement as many as they want
     interfaces only contain abstract methods, so inside the interface we dont need to add public abstract
     because the interfaces makes them public abstract by default, they have no body, unless they are a default method, for more look in the IProduct interface
     interfaces cannot be instantiated

          */

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4.9, 8.00);
        System.out.println(rec1.calcArea());



    }
}
