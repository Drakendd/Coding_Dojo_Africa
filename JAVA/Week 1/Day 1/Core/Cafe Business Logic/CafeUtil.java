import java.util.ArrayList;
class CafeUtil {

    public int getStreakGoal()
    {
        int sum=0;
        for (int i=0; i<11; i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum=0;
        for (int i=0; i<prices.length; i++){
            sum+=prices[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i +" "+ menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println(String.format("Hello, %s!",username));
        System.out.println(String.format("There are %d people in front of you.",customers.size()));
        customers.add(username);
        for (int i=0; i<customers.size(); i++){
            System.out.println(i +" "+ customers.get(i));
        }
    }


}