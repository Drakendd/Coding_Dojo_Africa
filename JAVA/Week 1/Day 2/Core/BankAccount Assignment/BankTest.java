public class BankTest {
    public static void main(String[] args){
        // Create 3 acc
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();
        BankAccount bank3 = new BankAccount();

        
        // Deposit Test
        System.out.println("BANK 1 ");
        System.out.println(bank1.deposit(20, "SAVINGS"));
        System.out.println(bank1.deposit(30, "CHECKING"));
        System.out.println("Total: "+bank1.getBalance());
        System.out.println(".........");

        System.out.println("BANK 2 ");
        System.out.println(bank2.deposit(35, "SAVINGS"));
        System.out.println(bank2.deposit(15, "CHECKING"));
        System.out.println("Total: "+bank2.getBalance());
        System.out.println(".........");

        System.out.println("BANK 3 ");
        System.out.println(bank3.deposit(25, "SAVINGS"));
        System.out.println(bank3.deposit(25, "CHECKING"));
        System.out.println("Total: "+bank3.getBalance());
        System.out.println("........");


        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        System.out.println("BANK 1 ");
        System.out.println(bank1.withdraw(5, "SAVINGS"));
        System.out.println(bank1.withdraw(5, "CHECKING"));
        System.out.println("Total: "+bank1.getBalance());
        System.out.println(".........");


        System.out.println("BANK 2 ");
        System.out.println(bank2.withdraw(35, "SAVINGS"));
        System.out.println(bank2.withdraw(10, "CHECKING"));
        System.out.println("Total: "+bank2.getBalance());
        System.out.println(".........");


        System.out.println("BANK 3");
        System.out.println(bank3.withdraw(10, "SAVINGS"));
        System.out.println(bank3.withdraw(25, "CHECKING"));
        System.out.println("Total: "+bank3.getBalance());
        System.out.println(".........");

        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test  bank and money
        System.out.println("Number of Bank Accounts: "+bank1.getAccounts());

    }
}
