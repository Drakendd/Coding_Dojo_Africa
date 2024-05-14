public class cafejava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 5.2;
        double latte = 4.6;
        double cappuccino = 7;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION
        // Example:
        System.out.println(generalGreeting + customer1);
        
//----noah order-----------
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
        //---------------------sam 
            int numberOfLattesOrdered = 2;
        double totalCost = numberOfLattesOrdered * latte;
        System.out.println(displayTotalMessage + totalCost); // Display total cost for Sam's order
        
        // Update Sam's order status
        boolean isReadyOrderSam = false; // Change this value to test different order statuses
        
        // Check and print Sam's order status
        if (isReadyOrderSam) {
            System.out.println(generalGreeting + customer2 + readyMessage);
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }
        // Jimmy's situation
        double chargedAmount = dripCoffee; // Jimmy was charged for a coffee
        double correctAmount = latte; // Jimmy had ordered a latte
        double difference = correctAmount - chargedAmount; // Calculate the difference
        
        // Print the total message with the new calculated total (what Jimmy owes)
        double totalOwed = chargedAmount + difference;
        System.out.println(displayTotalMessage + totalOwed);
    }
}
