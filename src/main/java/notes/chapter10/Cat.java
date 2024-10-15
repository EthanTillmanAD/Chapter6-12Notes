package notes.chapter10;

public class Cat extends  Animal{
    @Override
    public void noise() {
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("I Scratch");
    }
}
