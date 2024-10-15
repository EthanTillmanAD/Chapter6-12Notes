package notes.chapter11;

public interface IProduct {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);


   default String getBarcode(){// this default method allows for us to make changes to an interface without breaking everything
                                // and forcing us to add this method everywhere we implamented this interface
        return "Barcode";
    }

}
