package notes.chapter9.cakes;

public class BirthdayCake extends Cake{
    private int amountOfCandles;

    public BirthdayCake(String flavor, double price) {
        super(flavor, price);
    }
    public BirthdayCake(String flavor, double price, int amountOfCandles) {
        super(flavor, price);
        this.amountOfCandles = amountOfCandles;
    }

    public int getAmountOfCandles() {
        return amountOfCandles;
    }

    public void setAmountOfCandles(int amountOfCandles) {
        this.amountOfCandles = amountOfCandles;
    }
}
