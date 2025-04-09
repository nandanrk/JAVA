public class BankAccount {
    private String accountHolder;
    private double balance;

    static int totalAccounts = 0;

    public BankAccount(String name, double initialDeposit) {
        this.accountHolder = name;
        this.balance = initialDeposit;
        totalAccounts++;  
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void showTotalAccounts() {
        System.out.println("Total bank accounts created: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 1500);
        BankAccount acc3 = new BankAccount("Charlie", 2000);

        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();

        // calling static method without an object
        BankAccount.showTotalAccounts(); 
    }
}
