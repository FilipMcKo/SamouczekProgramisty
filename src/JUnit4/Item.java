package JUnit4;

public class Item {
    private String name;
    private double price;


    public Item(double price, String name) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + "[$" + price + "]  ";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}