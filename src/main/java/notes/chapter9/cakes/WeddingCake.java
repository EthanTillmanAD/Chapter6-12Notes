package notes.chapter9.cakes;

public class WeddingCake extends Cake{
    private int amountOfTiers;

    public WeddingCake(String flavor, double price) {
        super(flavor, price);

    }
    public WeddingCake(String flavor, double price, int amountOfTiers) {
        super(flavor, price);
        this.amountOfTiers = amountOfTiers;
    }


    public int getAmountOfTiers() {
        return amountOfTiers;
    }

    public void setAmountOfTiers(int amountOfTiers) {
        this.amountOfTiers = amountOfTiers;
    }
}
