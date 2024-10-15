package notes.chapter9;

public class ChapterNine {
    /*
    the four biggest concepts of OOP are
    encapsulation, Inheritance, polymorphism, and abstraction

    inheritance is done by a superclass(Parent) and subclass(Child)
    child class gets all the data from the master class
   this is also know as a Is-A

   inside this package, theres a person class and employee class,
   the employee class automaticly gets all fields, instance variables from the person class
   employee can have its own fields, instance variables but must take those from person class

Person = SuperClass
Employee = SubClass

    with constructors any time you have classes with inheritance the super constructor will always be used first
    below we have a person being made from the super class and a employee being made from the sub class
    in both the super and sub class they both have a default constructor that has a sout
    Person will only used the person constructor but employee will use both and print both
    souts

    for subclasses constructors whenever they are inherated it will have super(fieldsType); this code MUST be first
    inside the constructor

    sub classes must have at least one of the superclasses constructor

    we can override and overload methods

    we can override such as inside the Square class, we have a method that is overriden from reactangle
    we can easily do so using the @Override above a method in our subclass that was inherited from super
    and uses the same name return type and parameters

    we can also overload methods such as in chapter 6, but below we show theres something different
    inside the rectangle class on line 37 we have a print method, rectangle only has access to this method
    but inside square on line 11 we have the same named method but takes a parameter and overloaded the original
    method, square now has access to both the method from rectangle and the overloaded method inside the square class

    if the access modifier inside super is private, we wont directly get that inside the sub class, such as if we were to make
    an instance variable, field private we would need a getter or setter to fully access the value stored inside

    everything inherits from the object

    classes can extend as many times as we need the final class that inherits gets access to all the classes it has extended



     */
    public static void main(String[] args) {
        Person person1 = new Person("alex");
        //person1 only is allowed getters and setters from the person class
        Employee em1 = new Employee("john");
        //but em1 has access to em1 getters and setters but also those from the person class


        Rectangle rectangle1 = new Rectangle();
        rectangle1.print();//inside rectangle
        Square square1 = new Square();
        square1.print();//inside rectangle
        square1.print("Square");//inside square


        Mother mom = new Mother();
        mom.setName("Kathy");

        System.out.println(mom.getName()+ " " + mom.getGender());



    }

}
