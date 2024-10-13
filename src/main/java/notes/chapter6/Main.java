package notes.chapter6;

public class Main {

    public static void main(String[] args) {
        PhoneBill phone1 = new PhoneBill();
        phone1.setMins(500.00);
        phone1.setPrice(1000.00);
        phone1.printBill();

        PhoneBill phone2 = new PhoneBill(4856);
        phone2.setMins(300.0);
        phone2.setPrice(499.00);

        phone2.printBill();

      PhoneBill phone3 = new PhoneBill(4890, 5000.0, 999.0);

      phone3.printBill();



        System.out.println(ChapterSix.overLoadingMethods("Hi"));// Static Methods require
        //                  ClassName.methodName

    }
}
