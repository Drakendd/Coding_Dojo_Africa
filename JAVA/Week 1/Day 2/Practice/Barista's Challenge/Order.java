import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready to get.";
        }else{
            return "Thank you for the wait your order will be ready shortly.";
        }
    }

    public double getOrderTotal(){
        double sum=0;
        for (Item i : this.items)
        sum+=i.getPrice();
        return sum;
    }

    public void display (){
        System.out.println("Customer Name: "+this.name);
        for (Item i : this.items)
            System.out.println(i.getName() + " - $" + i.getPrice());
        System.out.println(getOrderTotal());
    }

    public boolean isReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready ;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name ;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items ;
    }
}