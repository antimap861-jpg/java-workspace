public class encapsulation {
    
    // 1. Private data (Hidden from the outside)
    private double balance;
    private String accountNumber;

    // Constructor to set up the initial state
    public encapsulation(String accountNumber, double initialBalance) {

        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // 2. Public Getter: Allows reading the balance safely
    public double getBalance() {
        return this.balance;
    }

    // Public Getter for account number
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // 3. Controlled Modifiers (instead of just a standard "setter")
    
    public void deposit(double amount) {
        // We can add validation logic here!
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        // We can prevent overdrawing here!
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        encapsulation myAccount = new encapsulation("12345", 100.0);
        myAccount.deposit(50.0);
        myAccount.withdraw(200.0);
        System.out.println("Current balance: $" + myAccount.getBalance()); 
    }
}
