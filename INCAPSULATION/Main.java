// Class jo bank account ko represent karti hai
class BankAccount {

    // Encapsulation: balance ko private rakha
    // Bahar koi direct access nahi kar sakta
    private int balance = 10000;

    // Getter Method
    // Balance ko safely read karne ke liye
    public int getBalance() {
        return balance;
    }

    // Withdraw Method
    // Balance ko controlled way me update karne ke liye
    public void withdraw(int amount) {

        // Validation
        // Itna hi paisa nikal sakte hain jitna account me hai
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Successful: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Deposit Method
    // Paisa add karne ke liye
    public void deposit(int amount) {

        // Negative amount deposit nahi ho sakta
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount!");
        }
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Object Creation
        BankAccount acc = new BankAccount();

        // Getter ke through balance dekhna
        System.out.println("Initial Balance: " + acc.getBalance());

        // Deposit karna
        acc.deposit(5000);

        // Updated Balance
        System.out.println("Balance After Deposit: " + acc.getBalance());

        // Withdraw karna
        acc.withdraw(3000);

        // Updated Balance
        System.out.println("Balance After Withdraw: " + acc.getBalance());

        // Invalid Withdrawal
        acc.withdraw(20000);

        /*
         * Ye line ERROR degi kyuki balance private hai
         * Encapsulation data ko protect karta hai
         */

        // acc.balance = 500000; // ❌ Not Allowed
    }
}