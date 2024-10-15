package notes.chapter10;

public class Dog extends Animal{

    @Override
    public void noise(){
        System.out.println("bark");
    }
    public void fetch(){
        System.out.println("fetching");
    }
}
