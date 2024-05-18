import java.util.ArrayList;

public class Order {
    //variables
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    //Constructor
    public Order(String name) {
        this.name = name;
        this.total = 0;
        this.ready = false;
        this.items = new ArrayList<>();
    }

    // methods
    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public boolean isReady() {
        return ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void addItem(Item item) {
        items.add(item);
        total += item.getPrice();
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", total=" + total +
                ", ready=" + ready +
                ", items=" + items +
                '}';
    }
}