import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Mocha",3.5);
        Item item2 = new Item("Latte",2.5);
        Item item3 = new Item("Drip Coffee",1.5);
        Item item4 = new Item("Cappuccino",4);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("yassin daira");
        Order order4 = new Order("leo messi");
        Order order5 = new Order("mike tyson");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item3);

        order4.addItem(item4);
        order4.addItem(item1);

        order5.addItem(item3);
        order5.addItem(item1);

        order3.getStatusMessage();
        System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}