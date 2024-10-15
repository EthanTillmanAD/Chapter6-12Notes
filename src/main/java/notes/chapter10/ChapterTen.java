package notes.chapter10;

import notes.chapter9.cakes.Cake;

public class ChapterTen {

    /*

    polymorphism

    for polymorphism we crated some classes dog, cat and animal

    below dog1 has access only to the dogs methods such as the overriden
    noise() and fetch(), but for dog 2 since its a type animal listed as a new Dog()
    it has access to the noise() method and prints out what the overridden from the dog class
    but doesnt have access to the fetch method
    same with reassigning dog2 to equal new Cat() it has access to the cat method noise()
    but not scratch this is because the noise method is overridden dog2 is still an animal
    but since animal doesnt have the fetch or scratch method we arent able to use them
    unless we cast them to the type of animal we want such as below on line 49
    dog2 has been casted to a Cat object and can now access the methods from the Cat class

    in order for us to actually get this correct we need to crate a instance of the object
    such as on line 51 we set dog2 to new Dog() then we can cast it to a Dog object

    we can also use a checker using the instanceof keyword to check what type of instance that object is
    such as below in the feed method

    something to note when we create an instance for objects we have to go from super to sub
    such as Animal dog = new Dog(); it cannot be Dog dog = new Animal():
    such as the commented out text below on line 56-57 we would have to cast it to a dog object but thats the
    same as Dog dog = new Dog();

     */

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.fetch();
        dog1.noise();


        Animal dog2 = new Dog();
        dog2.noise();
        dog2 = new Cat();
        dog2.noise();
        feed(dog2);

        ((Cat)dog2).scratch();

        dog2 = new Dog();
        ((Dog)dog2).fetch();
        feed(dog2);
        feed(dog1);

//        Dog god = (Dog) new Animal();
//        god = new Cat();
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Kibble");
        }else if(animal instanceof Cat){
            System.out.println("Wet cat food");
        }
    }
}
