package notes.chapter6;

public class PhoneBill {
    private int phoneId;
    private static int phoneCount;
    private double price;
    private double mins;


    public PhoneBill() {
        phoneCount++;
        phoneId = phoneCount;
    }

    public PhoneBill(int phoneId) {
        this.phoneId = phoneId;
    }

    public PhoneBill(int phoneId, double price, double mins) {
        this.phoneId = phoneId;
        this.price = price;
        this.mins = mins;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public static int getPhoneCount() {
        return phoneCount;
    }

    public static void setPhoneCount(int phoneCount) {
        PhoneBill.phoneCount = phoneCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMins() {
        return mins;
    }

    public void setMins(double mins) {
        this.mins = mins;
    }

    public void printBill(){
        System.out.println("Your phone bill includes :\n"
               + "Total Minutes -> " + this.mins + "\nCost -> $" + this.price
                + "\nPhone id -> " + this.phoneId

        );
        System.out.println("");
    }
}
