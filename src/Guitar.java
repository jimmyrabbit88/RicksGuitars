import java.util.Iterator;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;


    public Guitar(String serialNumber, double price, Builder builder, String model,
                  Type type,  Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = new GuitarSpec( builder, model,type,  backWood, topWood);
    }

    public Guitar() {
    }

    public String getSerialNumber(){
        return serialNumber;
    }
    public double getPrice(){
        return price;
    }

    private void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}

