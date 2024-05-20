import java.util.ArrayList;


//MEMBER VARIABLES
public class Order {
  private String name;
  private boolean ready;
  private ArrayList<Item> items;
  private Item item;

 //CONSTRUCTOR
public Order(){
  this.name = "Jassem";
  this.items = new ArrayList<Item>();
}

 // OVERLOADED CONSTRUCTOR
 // Takes a name as an argument, sets name to this custom name.
 // Initializes items as an empty list.
  public Order(String name){
  this.name = name;
  this.items = new ArrayList<Item>();
}

 // ORDER METHODS
 // Most of your code will go here, 
 // so implement the getters and setters first!
  public void addItem(Item item){
  items.add(item);
}

  public String getMessage (){
  if (this.ready){
  return "Order is Ready!";
  }
  return "Thank's for your waiting, Order will be ready soon.";
}

public double getTotal(){
  double total = 0;
  for(Item item : items){
  total += item.getPrice();
  }
  return total;
}

  public void display(){
  System.out.println("Customer Name:" + this.name);
  for(Item item : items){
  System.out.println(item.getName() + "-$" + item.getPrice());
}
System.out.println("Total: $" + getTotal());
}

 // GETTERS AND SETTERS
public String getName(){
  return this.name;
}

public void setName(String name){
  this.name = name;
}

public boolean getReady(){
  return this.ready;
}

public void setReady(boolean ready){
  this.ready = ready;
}

public ArrayList<Item> getItems(){
  return this.items;
}

public void setItems(ArrayList<Item> items){
  this.items = items;
}

}
