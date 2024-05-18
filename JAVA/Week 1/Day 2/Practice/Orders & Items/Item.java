public class Item {
    // Member variables
    private String name;
    private double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //  methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //method
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
