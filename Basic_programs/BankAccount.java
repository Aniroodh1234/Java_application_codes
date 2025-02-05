public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private String accountType;

    public BankAccount(String accountHolderName, int accountNumber, double balance, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (recipient != null && amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transferred: $" + amount + " to " + recipient.accountHolderName);
        } else {
            System.out.println("Invalid transfer");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aniroodh", 1001, 5000.0, "Savings");
        BankAccount account2 = new BankAccount("Abhighyan", 1002, 3000.0, "Checking");
        
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        System.out.println("Aniroodh deposits $1000");
        account1.deposit(1000);
        account1.displayAccountInfo();
        
        System.out.println("Aniroodh transfers $2000 to Abhighyan");
        account1.transfer(account2, 2000);
        
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}