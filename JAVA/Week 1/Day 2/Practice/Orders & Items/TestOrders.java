public class TestOrders {
    public static void main(String[] args) {
    
        
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 4.5);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1);
        System.out.println("order1.total: " + order1.getTotal()); 

        order2.addItem(item1);

        order3.addItem(item4);

        order4.addItem(item2);

        order1.setReady(true);

        order4.addItem(item2);
        order4.addItem(item2);

        order2.setReady(true);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
    }
}
