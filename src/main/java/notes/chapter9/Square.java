package notes.chapter9;

public class Square extends Rectangle{

    @Override
    public double calcParemter() {
        return getSides() * getLength();
    }


    public void print(String name ){
        System.out.println("I am a " + name);
    }
}
